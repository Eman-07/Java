package com.example.fitnesscenter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample extends Application {
    BorderPane layout = new BorderPane();
    ObservableList<Member> membersList = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage){

        HBox topBox = new HBox();
        Button addMemberButton = new Button("Add Member");
        addMemberButton.setOnAction(event -> addMemberForm());
        Button viewMembersButton = new Button("View Members");
        viewMembersButton.setOnAction(event -> {
            try {
                showTable();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        topBox.setSpacing(10);
        topBox.setAlignment(Pos.CENTER);
        topBox.getChildren().addAll(addMemberButton,viewMembersButton);



        layout.setTop(topBox);
        Scene scene = new Scene(layout,500,500);
        stage.setTitle("Fitness Center");
        stage.setScene(scene);
        stage.show();
    }



    public void addMemberForm(){
        VBox box = new VBox();

        box.setAlignment(Pos.CENTER);
        box.setSpacing(20);


        //Name Stuff
        HBox nameBox= new HBox();
        nameBox.setAlignment(Pos.CENTER);

        Label nameLabel= new Label("Name");
        TextField nameField = new TextField();
        nameField.setPromptText("Name");
        nameBox.setSpacing(10);
        nameBox.getChildren().addAll(nameLabel,nameField);






//        Gender stuff
        RadioButton maleB = new RadioButton("Male");
        RadioButton femaleB = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();
        maleB.setToggleGroup(group);
        femaleB.setToggleGroup(group);
        Label genderLabel = new Label("Gender : ");
        HBox genderBox = new HBox(genderLabel,maleB,femaleB);
        genderBox.setSpacing(10);
        genderBox.setAlignment(Pos.CENTER);


//      MemberShip Stuff
        ComboBox<String> memberShipType = new ComboBox<>();
        memberShipType.getItems().addAll("Basic", "Gold","Premium");
        memberShipType.setPromptText("Plan Type");



//Date of birth stuff
        DatePicker dobPicker = new DatePicker();
        dobPicker.setPromptText("Date of Birth");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        dobPicker.setOnAction(event ->{
//            LocalDate selectedDate = dobPicker.getValue(); // Get selected date from DatePicker
//            if (selectedDate != null) {
//                String dateString = selectedDate.format(formatter); // Convert to string with format
//                System.out.println("Selected date: " + dateString); // Print or store the date
//            }
//        });



// Buttons to add new members
        Button addButton = new Button("Add");
        Button cancelButton = new Button("Cancel");
        HBox addBox = new HBox(cancelButton,addButton);
        addBox.setAlignment(Pos.CENTER);
        addBox.setSpacing(10);



        //adding to main vbox
        box.getChildren().addAll(nameBox,genderBox,memberShipType,dobPicker,addBox);
        layout.setCenter(box);


        //Adding actions to buttons
        addButton.setOnAction(event -> {

            String name = nameField.getText();
            String gender = ((RadioButton) group.getSelectedToggle()).getText();
            String date = dobPicker.getValue().format(formatter);
            String planType = memberShipType.getValue();

            System.out.println(name);
            System.out.println(gender);
            System.out.println(date);
            System.out.println(planType);

            membersList.add(new Member(name,planType,date,gender));
            saveData();
            nameField.clear();
            dobPicker.disarm();
        });
        cancelButton.setOnAction(event -> layout.setCenter(null));
    }


    public void showTable() throws Exception {
        //Load data from file
        loadData();

        if (membersList.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("The record is empty, Please enter a member from member form\nto view table");
            alert.showAndWait();

        }else {


            TableView tableView = new TableView<Member>();
            tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            //Columns
            TableColumn memberColumn = new TableColumn<Member, String>("Name");
            memberColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("name"));
            TableColumn dobColumn = new TableColumn<Member, String>("Date Of Birth");
            dobColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("dob"));
            TableColumn planTypeColumn = new TableColumn<Member, String>("Plan Type");
            planTypeColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("membershipType"));
            TableColumn genderColumn = new TableColumn<Member, String>("Gender");
            genderColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("gender"));


            tableView.getColumns().add(memberColumn);
            tableView.getColumns().add(genderColumn);
            tableView.getColumns().add(dobColumn);
            tableView.getColumns().add(planTypeColumn);

            tableView.setItems(membersList);
            layout.setCenter(tableView);
        }
    }

    public void saveData() {
        File file = new File("Data.ser");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){

            List<Member> temp = new ArrayList<>(membersList);
            oos.writeObject(temp);
            System.out.println("Data saved");


        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void loadData() {
        File file = new File("Data.ser");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            List<Member> temp = ((ArrayList<Member>) ois.readObject());
            membersList = FXCollections.observableArrayList(temp);
            System.out.println("data loaded");
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}

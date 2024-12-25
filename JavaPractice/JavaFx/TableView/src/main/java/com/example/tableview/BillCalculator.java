package com.example.tableview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillCalculator extends Application {

    // Prepare data
//    ObservableList<Data> dataList = FXCollections.observableArrayList(
//            new Data("Alice", 30),
//            new Data("Bob", 25),
//            new Data("Charlie", 35),
//            new Data("Allen", 30.5)
//    );

    ObservableList<Data> dataList = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {

//        saveData();
        loadData();
        BorderPane pane = new BorderPane();

        TableView<Data> tableView = new TableView<>();

        // Add columns to the table
        TableColumn<Data, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Data, Double> unitColumn = new TableColumn<>("Unit Consumed");
        unitColumn.setCellValueFactory(new PropertyValueFactory<>("unitsCount"));
        TableColumn<Data, Integer> unitPrice = new TableColumn<>("Unit Price");
        unitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        TableColumn<Data, Double> calculatedBill = new TableColumn<>("Total Bill");
        calculatedBill.setCellValueFactory(new PropertyValueFactory<>("bill"));

        tableView.getColumns().add(nameColumn);
        tableView.getColumns().add(unitColumn);
        tableView.getColumns().add(unitPrice);
        tableView.getColumns().add(calculatedBill);

        // Making Hbox to add new records in the table
        HBox addRecordBox = new HBox();
        addRecordBox.setSpacing(10);

        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        nameField.setText("Name");
        Label unitLabel = new Label("Unit Consumed");
        TextField unitField = new TextField();
        unitField.setText("Unit Consumed");

        Button addButton = new Button("Add");

        addRecordBox.getChildren().addAll(nameLabel, nameField, unitLabel, unitField, addButton);

        // Action for add button
        addButton.setOnAction(event -> {
            if (!nameField.getText().isEmpty() && !unitField.getText().isEmpty()) {
                dataList.add(new Data(nameField.getText(), Double.parseDouble(unitField.getText())));
                nameField.clear();
                unitField.clear();
            }
        });

        // Adding functionality to save record and load data from a file
        HBox saveRecordBox = new HBox();
        Button saveRecordButton = new Button("Save");
        saveRecordButton.setOnAction(event -> saveData());

        Button loadDataButton = new Button("Load");
        loadDataButton.setOnAction(event -> {
            try {
                loadData();
                tableView.setItems(dataList);  // Refresh table data after loading
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        saveRecordBox.getChildren().addAll(loadDataButton, saveRecordButton);

        pane.setTop(addRecordBox);
        pane.setCenter(tableView);
        pane.setBottom(saveRecordBox);

        tableView.setItems(dataList);
        tableView.setEditable(true);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Bill Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void saveData() {
        File file = new File("Data.ser");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Convert ObservableList to ArrayList for serialization
            List<Data> dataListCopy = new ArrayList<>(dataList);
            oos.writeObject(dataListCopy);

            oos.close();
            fos.close();

            System.out.println("Data saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadData() throws IOException, ClassNotFoundException {
        File file = new File("Data.ser");
        if (!file.exists()) {
            file.createNewFile();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize the list
            List<Data> loadedDataList = (List<Data>) ois.readObject();
            dataList = FXCollections.observableArrayList(loadedDataList);

            ois.close();
            fis.close();

            System.out.println("Data loaded successfully");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

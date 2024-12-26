package com.example.fitnesscenter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckListExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Stage stage = new Stage();
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);

        CheckBox checkBox = new CheckBox("i accept all user aggrements");
        CheckBox iAmHuman = new CheckBox("I am human");
//
//        ComboBox<CheckBox> comboBox= new ComboBox<>();
//        comboBox.getItems().addAll(checkBox, iAmHuman);

        ToggleGroup group = new ToggleGroup();

        box.getChildren().addAll();

        Scene scene = new Scene(box);
        stage.setTitle("Check List Example");
        stage.setScene(scene);
        stage.show();
    }


}
package com.example.bmicalculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Optional;

public class MainController {
    @FXML
    private TextField ageField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    @FXML
    private Label missingNotifier;



    public void exit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");
//        alert.showAndWait();

        // Show the alert and wait for a response
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            // User pressed OK (Yes), exit the application
            Platform.exit(); // Closes JavaFX application
        } else {
            // User pressed Cancel or closed the dialog
            System.out.println("Exit canceled.");
        }
    }


    public Boolean isEmpty(TextField age,TextField weight ,TextField height) {

        missingNotifier.setVisible(false);
        if (!age.getText().isEmpty() && !weight.getText().isEmpty() && !height.getText().isEmpty()) {
            System.out.println("all filled");
            return true;
        }
        System.out.println("empty");

        if (age.getText().isEmpty() || ageField.getText().) {
            missingNotifier.setVisible(true);
            missingNotifier.setLayoutX(322);
            missingNotifier.setLayoutY(129);
            missingNotifier.setText("Please enter a valid age");
        }
        if (weight.getText().isEmpty()) {
            missingNotifier.setVisible(true);
            missingNotifier.setLayoutX(316);
            missingNotifier.setLayoutY(179);
            missingNotifier.setText("Please enter a valid weight");
        }
        if (height.getText().isEmpty()) {
            missingNotifier.setVisible(true);
            missingNotifier.setLayoutX(313);
            missingNotifier.setLayoutY(220);
            missingNotifier.setText("Please enter a valid height");
        }

        return false;
    }

    public void calculate(ActionEvent event) {
       isEmpty(ageField,weightField,heightField);
    }
}

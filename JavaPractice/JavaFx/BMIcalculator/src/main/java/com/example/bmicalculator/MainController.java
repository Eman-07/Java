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
    @FXML
    private Label missingNotifier1;
    @FXML
    private Label missingNotifier2;



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


    public Boolean isEmptyAndNumeric(TextField age, TextField weight, TextField height) {

        missingNotifier.setVisible(false);
        missingNotifier1.setVisible(false);
        missingNotifier2.setVisible(false);


        // Flag to track validation
        boolean isValid = true;

        // Validate age
        if (age.getText().isEmpty() || !age.getText().matches("\\d+")) {
            missingNotifier.setVisible(true);
            missingNotifier.setText("Please enter a valid numeric age");
            isValid = false;
        }

        // Validate weight
        if (weight.getText().isEmpty() || !weight.getText().matches("\\d+")) {
            missingNotifier1.setVisible(true);
            missingNotifier1.setText("Please enter a valid numeric weight");
            isValid = false;
        }

        // Validate height
        if (height.getText().isEmpty() || !height.getText().matches("\\d+")) {
            missingNotifier2.setVisible(true);
            missingNotifier2.setText("Please enter a valid numeric height");
            isValid = false;
        }

        // If everything is valid
        if (isValid) {
            System.out.println("All fields are filled and numeric");
            return true;
        }

        // If there's any error
        System.out.println("Validation failed");
        return false;
    }


    public void calculate(ActionEvent event) {
       isEmptyAndNumeric(ageField,weightField,heightField);
    }
}

package com.example.bmicalculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    @FXML
    private ImageView imageView;



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

        // Validate age (integer)
        if (age.getText().isEmpty() || !age.getText().matches("\\d+")) {
            missingNotifier.setVisible(true);
            missingNotifier.setText("Please enter a valid numeric age (integer)");
            isValid = false;
        }

        // Validate weight (float)
        if (weight.getText().isEmpty() || !weight.getText().matches("\\d*\\.?\\d+")) {
            missingNotifier1.setVisible(true);
            missingNotifier1.setText("Please enter a valid numeric weight (float)");
            isValid = false;
        }

        // Validate height (float)
        if (height.getText().isEmpty() || !height.getText().matches("\\d*\\.?\\d+")) {
            missingNotifier2.setVisible(true);
            missingNotifier2.setText("Please enter a valid numeric height (float)");
            isValid = false;
        }

//        \\d+: Matches one or more digits (used for integer validation).
//         \\d*\\.?\\d+: Matches an optional sequence of digits before a decimal point,
//         an optional decimal point, and at least one digit after it (used for float validation).

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
        imageView.setImage(null);
       isEmptyAndNumeric(ageField,weightField,heightField);

    }



    public void reset(){
        ageField.setText("");
        weightField.setText("");
        heightField.setText("");
        missingNotifier.setVisible(false);
        missingNotifier1.setVisible(false);
        missingNotifier2.setVisible(false);
        imageView.setImage(null);
    }


    public void formula(ActionEvent event) {
        missingNotifier.setVisible(false);
        missingNotifier1.setVisible(false);
        missingNotifier2.setVisible(false);
        Image formula = new Image(MainController.class.getResourceAsStream("/com/example/bmicalculator/images/formula.png"));
        imageView.setImage(formula);
    }
}

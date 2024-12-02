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
            missingNotifier.setText("Please enter a positive numeric age (integer)");
            isValid = false;
        } else if (Integer.parseInt(age.getText()) <= 0) {
            missingNotifier.setVisible(true);
            missingNotifier.setText("Age must be greater than zero");
            isValid = false;
        }

        // Validate weight (float)
        if (weight.getText().isEmpty() || !weight.getText().matches("\\d*\\.?\\d+")) {
            missingNotifier1.setVisible(true);
            missingNotifier1.setText("Please enter a positive numeric weight (float)");
            isValid = false;
        } else if (Float.parseFloat(weight.getText()) <= 0) {
            missingNotifier1.setVisible(true);
            missingNotifier1.setText("Weight must be greater than zero");
            isValid = false;
        }

        // Validate height (float)
        if (height.getText().isEmpty() || !height.getText().matches("\\d+")) {
            missingNotifier2.setVisible(true);
            missingNotifier2.setText("Please enter a positive numeric height (integer)");
            isValid = false;
        } else if (Integer.parseInt(heightField.getText()) <= 0) {
            missingNotifier2.setVisible(true);
            missingNotifier2.setText("Height must be greater than zero");
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
       imageView.setImage(null);
       if (isEmptyAndNumeric(ageField,weightField,heightField)){

            double weight = Double.parseDouble(weightField.getText());
            int heightInInches = Integer.parseInt(heightField.getText());
            double heightInMeters = heightInInches * 0.0254;

            double bmi = weight / (heightInMeters * heightInMeters);


            alertModifier(bmi);
//
//           Image img = new Image(MainController.class.getResourceAsStream("/com/example/bmicalculator/images/formula.png"));
//           ImageView imageView2 = new ImageView(img);
//           imageView2.setFitHeight(150);
//           imageView2.setFitWidth(150);
//           alert.setGraphic(imageView2);


       }
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


    public void alertModifier(Double bmi){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Calculated BMI");

        String classification;
        if (bmi < 16) {
            classification = "Severe Thinness";
        } else if (bmi >= 16 && bmi < 17) {
            classification = "Moderate Thinness";
        } else if (bmi >= 17 && bmi < 18.5) {
            classification = "Mild Thinness";
        } else if (bmi >= 18.5 && bmi < 25) {
            classification = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            classification = "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            classification = "Obese Class I";
        } else if (bmi >= 35 && bmi < 40) {
            classification = "Obese Class II";
        } else {
            classification = "Obese Class III";
        }

        alert.setContentText(String.format("Your BMI is %.2f\nStatus : %s",bmi,classification));
        alert.showAndWait();


    }
}

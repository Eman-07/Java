package com.example.fxpractice_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SceneBuilder extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("FX Practice 1");

        URL resource = getClass().getResource("/com/example/fxpractice_1/SceneBuilder_1.fxml");
        System.out.println("FXML file location: " + resource); // Should not be null

        if (resource == null) {
            throw new RuntimeException("FXML file not found!");
        }

        try {
            Parent root = FXMLLoader.load(resource);
            Scene scene = new Scene(root);

            stage.setHeight(500);
            stage.setWidth(800);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}

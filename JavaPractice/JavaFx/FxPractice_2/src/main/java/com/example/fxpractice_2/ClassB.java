package com.example.fxpractice_2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClassB extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("ClassB");

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClassB.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(ClassB.class.getResource("ClassB-view.fxml"));



        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

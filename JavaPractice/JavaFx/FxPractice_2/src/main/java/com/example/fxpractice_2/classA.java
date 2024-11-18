package com.example.fxpractice_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class classA extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");


//        Parent root = FXMLLoader.load(getClass().getResource("classA-view.fxml"));


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("classA-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

//        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}

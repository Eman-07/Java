package com.example.bmicalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("main-view.fxml"));

    }


    public static void main(String[] args) {
        launch(args);
    }
}

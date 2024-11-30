package com.example.fxpractice_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class HBOXexample extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox box = new HBox();
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        button2.setPrefSize(100,20);
        button2.setText("Button2.1");
//        button2.set

        
        box.getChildren().addAll(button1, button2);

        box.setStyle("-fx-background-color: #940000;");
        box.setPadding(new Insets(10, 10, 10, 10));
        box.setSpacing(10);


        Scene scene = new Scene(box,200,150);




//        scene.getStylesheets().add("style.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
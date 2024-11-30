package com.example.fxpractice_4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {


    @Override
    public void start(Stage primaryStage) {

        //The BorderPane layout pane provides five regions in which to place
        // nodes: top, bottom, left, right, and center
        //If your application does not need one of the regions, you do not need
        // to define it and no space is allocated for it.
        BorderPane borderPane = new BorderPane();


        //top
        Button file = new Button("File");
        Button options = new Button("Options");
        Button exit = new Button("Exit");
        HBox topbox = new HBox();
        topbox.setAlignment(Pos.BASELINE_CENTER);

        topbox.getChildren().addAll(file, options,exit);


        //bottom
        HBox bottombox = new HBox();
        Button close = new Button("Close");
        bottombox.getChildren().add(close);


        //center
        ScrollPane infoPane = new ScrollPane();


        //left
        Button details = new Button("Details");
        VBox leftbox = new VBox();
        leftbox.getChildren().add(details);

        //right
        VBox rightbox = new VBox();
        Button privateButton = new Button("Private"); rightbox.getChildren().add(privateButton);





        //setting elements in border pane
        borderPane.setTop(topbox);
        borderPane.setBottom(bottombox);
        borderPane.setCenter(infoPane);
        borderPane.setLeft(leftbox);
        borderPane.setRight(rightbox);

        borderPane.setCursor(Cursor.CROSSHAIR);



        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

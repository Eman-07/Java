package com.example.fxpractice_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClassB extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Group root = new Group();
        Scene scene = new Scene(root,500,500, Color.CYAN);
//        Image logo = new Image(getClass().getResourceAsStream("logo.png"));
//
//        stage.getIcons().add(logo);


        Text text = new Text();
        text.setText("Como Estas");

        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Italic", 20));


        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);

        root.getChildren().add(text);
        root.getChildren().add(line);



        stage.setScene(scene);
        stage.setTitle("ClassB");


        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

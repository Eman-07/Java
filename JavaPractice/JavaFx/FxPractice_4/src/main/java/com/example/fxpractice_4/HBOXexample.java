package com.example.fxpractice_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.image.Image;


import java.awt.*;

public class HBOXexample extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox box = new HBox();
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        button2.setPrefSize(100,20);
        button2.setText("Button2.1");
//        button2.set


        Button button3 = new Button("Button3");


        Image okImg = new Image("C:\\Users\\Muhammad Eman\\Desktop\\GitRepos\\Java\\JavaPractice\\JavaFx\\FxPractice_4\\src\\main\\java\\com\\example\\fxpractice_4\\ok.png");
        ImageView okImgView = new ImageView(okImg);
        okImgView.setFitHeight(20);
        okImgView.setFitWidth(20);


//        Button button4 = new Button("ok" , okImgView);
        Button button4 = new Button("Button4");
        button4.setGraphic(okImgView);
        button4.setGraphicTextGap(10);

        box.getChildren().addAll(button1, button2,button3,button4);

        box.setStyle("-fx-background-color: #940000;");
        box.setPadding(new Insets(10, 10, 10, 10));
        box.setSpacing(10);


        Scene scene = new Scene(box,500,300);




//        scene.getStylesheets().add("style.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
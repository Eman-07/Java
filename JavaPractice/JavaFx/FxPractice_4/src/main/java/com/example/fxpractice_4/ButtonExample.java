package com.example.fxpractice_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.image.Image;

/*check HBOXExample for basics of button*/


public class ButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) {


        Button button = new Button("Button");
        Image img = new Image("C:\\Users\\Muhammad Eman\\Desktop\\GitRepos\\Java\\JavaPractice\\JavaFx\\FxPractice_4\\src\\main\\java\\com\\example\\fxpractice_4\\ok.png");
        ImageView imageView = new ImageView(img);
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        button.setGraphic(imageView);

        HBox hBox = new HBox(button);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));

        DropShadow shadow = new DropShadow();
        //Adding the shadow when the mouse cursor is on
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
//            button.setEffect(shadow);
            button.setEffect(shadow);
        });

        button.getStyleClass().add("button");

        //Removing the shadow when the mouse cursor is off
        button.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            button.setEffect(null);
        });


        Scene scene = new Scene(hBox,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ButtonExample");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

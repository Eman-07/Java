package com.example.scenebuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class controller{

    @FXML
    Rectangle rectangle = new Rectangle();
    private double x;
    private double y;



    public void up(ActionEvent event) {
        rectangle.setY(y-=10);
    }
    public void down(ActionEvent event) {
        rectangle.setY(y+=10);
    }
    public void left(ActionEvent event) {
        rectangle.setX(x-=10);
    }
    public void right(ActionEvent event) {
        rectangle.setX(x+=10);

    }




}

package com.example.fxpractice_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClassAController {


    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchB(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(ClassA.class.getResource("ClassB.fxml"));
        FXMLLoader loader = new FXMLLoader(ClassA.class.getResource("SceneB.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }


    public void switchA(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(ClassA.class.getResource("ClassA.fxml"));
        FXMLLoader loader = new FXMLLoader(ClassA.class.getResource("SceneA.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

}

package com.example.fxpractice_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
        line.setStartX(10);
        line.setStartY(200);
        line.setEndX(300);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
//        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(300);
        rectangle.setY(300);
        rectangle.setWidth(50);
        rectangle.setHeight(50);
        rectangle.setFill(Color.RED);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLUE);

        Polygon polygon = new Polygon();
        polygon.setFill(Color.BLUE);
        polygon.getPoints().setAll(200.0, 200.0 ,
                                   300.0,200.0,
                                   200.0,300.0);


        Circle circle = new Circle();
        circle.setFill(Color.BLUE);
        circle.setRadius(50);
        circle.setCenterX(400);
        circle.setCenterY(400);

        Image img = new Image("C:\\Users\\Muhammad Eman\\Desktop\\GitRepos\\Java\\JavaPractice\\JavaFx\\FxPractice_1\\src\\main\\java\\com\\example\\fxpractice_1\\logo.png");
        ImageView imgView = new ImageView(img);

        imgView.setX(250);
        imgView.setY(10);

        root.getChildren().addAll(line,rectangle,polygon,circle,imgView);
        root.getChildren().add(text);


        stage.setScene(scene);
        stage.setTitle("ClassB");


        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

module com.example.fxpractice_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.fxpractice_4 to javafx.fxml;
    exports com.example.fxpractice_4;
}
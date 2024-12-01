module com.example.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.bmicalculator to javafx.fxml;
    exports com.example.bmicalculator;
}
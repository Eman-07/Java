module com.example.fxpractice_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxpractice_1 to javafx.fxml;
    exports com.example.fxpractice_1;
}
module com.example.fxpractice_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxpractice_3 to javafx.fxml;
    exports com.example.fxpractice_3;
}
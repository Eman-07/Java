module com.example.fxpractice_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxpractice_2 to javafx.fxml;
    exports com.example.fxpractice_2;
}
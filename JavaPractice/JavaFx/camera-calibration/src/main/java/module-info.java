module com.example.cameracalibration {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencv;


    opens com.example.cameracalibration to javafx.fxml;
    exports com.example.cameracalibration;
}
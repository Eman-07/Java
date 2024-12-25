module com.example.fitnesscenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fitnesscenter to javafx.fxml;
    exports com.example.fitnesscenter;
}
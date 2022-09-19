module com.example.source_dsa {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.source_dsa.Patterns;
    opens com.example.source_dsa.Patterns to javafx.fxml;
}
module com.example.datastructures_analysis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructures_analysis to javafx.fxml;
    exports com.example.datastructures_analysis;
}
module com.example.assignmentlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignmentlab to javafx.fxml;
    exports com.example.assignmentlab;
}
module com.example.group_39_desco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group_39_desco to javafx.fxml;
    exports com.example.group_39_desco;
}
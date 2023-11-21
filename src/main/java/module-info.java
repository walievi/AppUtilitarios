module com.example.apputilitarios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apputilitarios to javafx.fxml;
    exports com.example.apputilitarios;
}
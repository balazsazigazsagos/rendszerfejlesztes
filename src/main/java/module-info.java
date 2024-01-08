module com.example.autokereskedes {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.autokereskedes to javafx.fxml;
    exports com.example.autokereskedes;
}
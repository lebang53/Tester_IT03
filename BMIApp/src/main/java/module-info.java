module com.lebang.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lebang.bmiapp to javafx.fxml;
    exports com.lebang.bmiapp;
}

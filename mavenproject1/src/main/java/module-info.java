module com.nthop.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nthop.mavenproject1 to javafx.fxml;
    exports com.nthop.mavenproject1;
}

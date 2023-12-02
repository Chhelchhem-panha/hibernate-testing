module com.panhacode.hibernateintegretion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.panhacode.hibernateintegretion to javafx.fxml;
    exports com.panhacode.hibernateintegretion;
}
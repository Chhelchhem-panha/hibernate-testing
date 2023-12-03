module com.panhacode.hibernateintegretion {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;


    opens com.panhacode.hibernateintegretion to javafx.fxml;
    exports com.panhacode.hibernateintegretion;
    exports com.panhacode.hibernateintegretion.controller;
    opens com.panhacode.hibernateintegretion.controller to javafx.fxml;

}
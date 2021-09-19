module FirstJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.baronasu;
    opens com.baronasu.view;
    opens com.baronasu.controller;
//    opens com.baronasu.model;
}
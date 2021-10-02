module FirstJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.baronasu.controller;
    opens com.baronasu.model;
    opens com.baronasu.view;
    opens com.baronasu;
}
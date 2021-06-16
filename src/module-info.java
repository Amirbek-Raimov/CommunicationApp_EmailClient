module CommunicationApp.EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.amirbek;
    opens com.amirbek.view;
    opens com.amirbek.controller;
    opens com.amirbek.model;


}


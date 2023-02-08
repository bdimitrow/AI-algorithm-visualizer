package com.sofia.uni.ai.aialgorithmvisualizer.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SidebarController {
    @FXML
    public Button addNodeBtn;

    @FXML
    public void addNodeAction(ActionEvent event) {
        // TODO: add nodes dynamically
        System.out.println("add node");
    }
}

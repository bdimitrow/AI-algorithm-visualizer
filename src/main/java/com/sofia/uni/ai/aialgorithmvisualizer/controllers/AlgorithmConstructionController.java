package com.sofia.uni.ai.aialgorithmvisualizer.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class AlgorithmConstructionController {
    @FXML
    public AnchorPane graphPane;

    @FXML
    public Button addNodeBtn;

    @FXML
    public void addNodeAction(ActionEvent event) {
        Circle node = new Circle(200, 200, 50, Color.WHITE);
        graphPane.getChildren().add(node);
    }
}

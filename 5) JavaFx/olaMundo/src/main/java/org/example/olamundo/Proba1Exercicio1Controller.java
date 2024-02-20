package org.example.olamundo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Proba1Exercicio1Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
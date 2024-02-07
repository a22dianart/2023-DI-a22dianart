package org.example.exercicio1javafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Button sairBtn;
    int suma = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        suma++;


        welcomeText.setText(String.valueOf(suma));
    }
    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
    }

}
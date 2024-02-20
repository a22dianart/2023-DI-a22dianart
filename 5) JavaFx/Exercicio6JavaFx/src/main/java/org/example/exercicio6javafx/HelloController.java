package org.example.exercicio6javafx;

import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Label texto;
    @FXML
    private VBox vbox;
    @FXML
    private ContextMenu menu;

    @FXML
    protected void onHelloButtonClick() {
        texto.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private void initialize() {
        vbox.setOnContextMenuRequested(event -> {
            menu.show(vbox, event.getScreenX(), event.getScreenY());
        });
    }

}
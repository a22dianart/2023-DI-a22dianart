package org.example.exercicio1javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.stage.Stage;

import java.io.IOException;

public class SairApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("app sair");

        Button button = new Button("Sair");
        button.setMnemonicParsing(true);
        button.setText("_Sair");
        button.setOnAction(value ->  {
            Platform.exit();

        });


        Scene scene = new Scene(button, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
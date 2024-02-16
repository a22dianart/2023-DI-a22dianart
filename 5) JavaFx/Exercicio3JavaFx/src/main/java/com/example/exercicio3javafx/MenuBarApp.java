package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuBarApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("");

        Menu menu = new Menu("Menu 1");

        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");

        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        Menu menu2 = new Menu("Menu 2");

        Menu submenu1 = new Menu("Menu 2.1");
        Menu submenu2 = new Menu("Menu 2.2");

        MenuItem menuItemSubmenu1 = new MenuItem("Item 1");
        MenuItem menuItemSubMenu2 = new MenuItem("Item 2");

        MenuItem menuItemSubmenu12 = new MenuItem("Item 1");
        MenuItem menuItemSubMenu22 = new MenuItem("Item 2");

        submenu1.getItems().add(menuItemSubmenu1);
        submenu1.getItems().add(menuItemSubMenu2);
        submenu2.getItems().add(menuItemSubmenu12);
        submenu2.getItems().add(menuItemSubMenu22);

        SeparatorMenuItem separator = new SeparatorMenuItem(); //separador


        menu2.getItems().add(submenu1);
        menu2.getItems().add(separator);
        menu2.getItems().add(submenu2);

        menuBar.getMenus().add(menu2);


        //OUTRAS COUSAS (NON MENU)

        Label etiqueta = new Label("Sin pulsar no Item 1");
        menuItem1.setOnAction(event -> {
            etiqueta.setText("Pulsouse no Item 1");

        });







        VBox root = new VBox();
        root.getChildren().add(menuBar);
        root.getChildren().add(etiqueta);





        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
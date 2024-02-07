module org.example.demo1ttjtgjgt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.demo1ttjtgjgt to javafx.fxml;
    exports org.example.demo1ttjtgjgt;
}
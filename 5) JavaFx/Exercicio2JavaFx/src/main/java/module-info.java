module org.example.exercicio2javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.exercicio2javafx to javafx.fxml;
    exports org.example.exercicio2javafx;
}
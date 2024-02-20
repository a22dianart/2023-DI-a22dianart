module org.example.exercicio6javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.exercicio6javafx to javafx.fxml;
    exports org.example.exercicio6javafx;
}
module it.buzzi.appfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires app;

    opens it.buzzi.appfx to javafx.fxml;
    exports it.buzzi.appfx;
}

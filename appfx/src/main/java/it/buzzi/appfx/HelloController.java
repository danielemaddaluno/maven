package it.buzzi.appfx;

import it.buzzi.app.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application! " + App.sum(1, 2));
    }
}

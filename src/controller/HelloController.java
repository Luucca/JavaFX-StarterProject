package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML private Label labelContagem;
    @FXML private JFXButton botaoIncrementar;

    private int contagem;

    @FXML
    void quandoHouverClick(ActionEvent event) {
        contagem += 1;
        labelContagem.setText("Contagem: " + contagem);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Inicializou o layout!");
    }
}

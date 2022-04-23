package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

// Classe responsável pelo comportamento dos componentes do nosso layout hello.fxml.
public final class HelloControllerExplicacao implements Initializable {

    /*
      O nome das variáveis abaixo com @FXML deve ser o mesmo nome
      definido no ID do componente no arquivo hello.fxml.
    */

    /*
      A anotação @FXML indicata ao JavaFX que ele deve iniciar esses componentes
      automagicamente para nós, sem a necessidade de fazermos um "new..." na classe.
      @FXML só é necessário se a variável ou método for privado (private).
    */
    @FXML private Label labelContagem;
    @FXML private JFXButton botaoIncrementar;

    private int contagem;

    @FXML
    void quandoHouverClick(ActionEvent event) {
        /*
          Método definido na ação(click) do nosso botão no arquivo de layout hello.fxml.
          O @FXML acima não é necessário pois o nosso modificador de acesso é "default" e não "private".
          Quando não definimos um modificador de acesso, o java usa "default (implícito)" por padrão.
        */


        // Define o conteúdo de texto do nosso componente Label
        contagem += 1;
        labelContagem.setText("Contagem: " + contagem);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Este método é chamado quando carregamos o layout na classe Main, linha 18 - "loader.load()".
        System.out.println("Inicializou o layout!");
    }
}

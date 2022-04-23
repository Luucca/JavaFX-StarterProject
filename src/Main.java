import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Método sobrescrito da classe herdada Application
    // Ele "fornece" o stage inicial da aplicação JavaFX
    @Override
    public void start(Stage primaryStage) throws Exception{

        // Cria o FXMLoader com a referência do arquivo de layout.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/hello.fxml"));

        // Carrega o layout e atribui a uma variável.
        Parent root = loader.load();

        // Define uma nova cena para o stage(janela), passando o layout carregado.
        primaryStage.setScene(new Scene(root));

        // Define o título do stage(janela).
        primaryStage.setTitle("Hello");

        // Exibe o stage(janela).
        primaryStage.show();
    }

    // Método de inicialização de toda aplicação java
    public static void main(String[] args) {

        // Esse método launch() vem da classe herdada Application.
        // Ele inicializa a aplicação JavaFX e posteriormente chama nosso método start() acima.
        launch(args);

    }
}

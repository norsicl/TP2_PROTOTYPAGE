package m1.piu.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class ControllerMainFrame {

    public void openContactPanel(MouseEvent mouseEvent) {

        Stage primaryStage = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/FXMLMainContactPanel.fxml"));
            Scene scene = new Scene(root, 380, 400);

            primaryStage.setTitle("Contact manager");
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
            // pour récupérer un element de type Pane (conteneur)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

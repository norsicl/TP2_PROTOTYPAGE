package m1.piu.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMainFrame {
    public void openContactPanel(MouseEvent mouseEvent) {
        Parent root = null;
        Stage primaryStage = new Stage();
        try {
            root = FXMLLoader.load(getClass().getResource("../View/FXMLMainContactPanel.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Parent children = FXMLLoader.load(getClass().getResource("m1/piu/View/FXMLMainPanel.fxml"));
        Scene scene = new Scene(root, 380, 360);

        primaryStage.setTitle("Contact manager");
        primaryStage.setScene(scene);
        // pour récupérer un element de type Pane (conteneur)


        primaryStage.show();
    }
}

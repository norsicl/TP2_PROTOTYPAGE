import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ContactManagerFX extends Application {

    public static void main(String[] args) {
        Application.launch(ContactManagerFX.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // soit on peut prendre le Interface_FB_LN.fxml
        Parent root = FXMLLoader.load(getClass().getResource("m1/piu/View/FXMLMainFrame.fxml"));

        //Parent children = FXMLLoader.load(getClass().getResource("m1/piu/View/FXMLMainPanel.fxml"));

        Scene scene = new Scene(root, 1200, 720);

        primaryStage.setTitle("Contact manager");
        primaryStage.setScene(scene);

        // pour récupérer un element de type Pane (conteneur)


        primaryStage.show();


        // pour afficher un message avant la fermeture de la fenetre
        primaryStage.setOnCloseRequest(( WindowEvent we ) -> { System.out.println("Fermeture de l ' application");
            primaryStage.close();
        }) ;

    }
}
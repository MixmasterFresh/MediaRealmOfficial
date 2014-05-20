
package mediarealm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MediaRealm extends Application {
     @Override
    public void start(Stage primaryStage) {
       Parent root = null;
       primaryStage.initStyle(StageStyle.UNDECORATED);
        try {
         root = FXMLLoader.load(getClass().getResource("/rsrc/UIManagment/DefaultState.fxml"));
        } catch (IOException ex) {
         Logger.getLogger(MediaRealm.class.getName()).log(Level.SEVERE, null, ex);
        }
        root.setStyle("-fx-background-color: #0d0d0d;");
        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

package net.vectorgaming.mediarealm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MediaRealm extends Application
{
   private double xOffset;
   private double yOffset;
    @Override
    public void start(final Stage primaryStage)
    {   
        Parent root = null;
        primaryStage.initStyle(StageStyle.UNDECORATED);
      
        try
        {
            root = FXMLLoader.load(getClass().getResource("/res/UIManagment/DefaultState.fxml"));
            root.setStyle("-fx-background-color: #0d0d0d;");
            root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });
        } catch (IOException ex)
        {
            Logger.getLogger(MediaRealm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

   
}

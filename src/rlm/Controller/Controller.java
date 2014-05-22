package rlm.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


/*Loads in all of the elements in the FXML file that is needed and assigns action listeners
to the element. the action listners are instances of the classes that are named accordingly
*/
public class Controller implements Initializable
{

    @FXML
    private Button myMusic;

    @Override 
    public void initialize(URL fxmlFileLocation, ResourceBundle resources)
    {
        
        myMusic.setOnAction(new MyMusicController());
    }
    
}

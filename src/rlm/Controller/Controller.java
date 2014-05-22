package rlm.Controller;

import java.net.URL;
import java.util.ResourceBundle;
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
    @FXML 
    private Button myVideos;
    @FXML
    private Button Netflix;
    @FXML 
    private Button Vimeo;
    @FXML 
    private Button SoundCloud;
    @FXML 
    private Button  Youtube;
    @FXML 
    private Button Pandora;
    @Override 
    public void initialize(URL fxmlFileLocation, ResourceBundle resources)
    {
      myVideos.setOnAction(new MyMusicController());
      myMusic.setOnAction(new MyMusicController());
      Youtube.setOnAction(new MyMusicController());
      Vimeo.setOnAction(new MyMusicController());
      Netflix.setOnAction(new MyMusicController());
      Pandora.setOnAction(new MyMusicController());
     }
    
    
    
}

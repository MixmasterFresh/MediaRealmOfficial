package mediarealm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller
{

    @FXML private Button ExitButton;
    @FXML private Button myMusic;

   protected void myMusicHandler()
    {
       myMusic.setText("Addison is gay!");
    }

}

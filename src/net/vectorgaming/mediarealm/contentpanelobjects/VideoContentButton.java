/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vectorgaming.mediarealm.contentpanelobjects;

import java.io.IOException;
import javafx.scene.control.Button;
import net.vectorgaming.mediarealm.util.FileUtils;

/**
 *
 * @author appam_000
 */
public class VideoContentButton
{

    private String title;
    private String path;
    private Button videoButton;

    public VideoContentButton(String title, String path) throws IOException
    {
        this.title = title;
        this.path = path;
        videoButton = new Button(title);
        videoButton.setPrefSize(175, 265);
        setButtonImage();

    }

    public Button getButton()
    {
        return videoButton;
    }

    private void setButtonImage() throws IOException
    {
       FileUtils.createThumbnail(path);
    }

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vectorgaming.mediarealm.contentpanelobjects;

import javafx.scene.control.Button;

/**
 *
 * @author appam_000
 */
public class VideoContentButton
{

    private String title;
    private String path;
    private Button videoButton;

    public VideoContentButton(String title, String path)
    {
        this.title = title;
        this.path = path;
        videoButton = new Button(title);
        videoButton.setPrefSize(175, 265);

    }

    public Button getButton()
    {
        return videoButton;
    }

    private void setButtonImage()
    {
        scanThumbNail();
    }

    private void scanThumbNail()
    {

    }

}

package net.vectorgaming.mediarealm.ui.controllers;

import javafx.event.Event;
import javafx.event.EventHandler;
import net.vectorgaming.mediarealm.util.FileUtils;

/*The event handler for the myVideo Button*/
public class MyVideoHandler implements EventHandler
{
    public static boolean needScan = true;
   
    //Creat class and package location for the VideoButtons Class
    //public static ArrayList <VideoButtons> videoButtonsList = new ArrayList<VideoButtons>();

    @Override
    public void handle(Event t)
    {

        //implement cleaning of flowpane
        if (needScan)
        {
            FileUtils.scanDirs();
            needScan = false;
        }
        addButtons();
    }

    
  
    /*adds all the buttons in the Arraylist @videoButtonsList to  
     the flow pane located in the content pane*/
    private void addButtons()
    {

    }
}

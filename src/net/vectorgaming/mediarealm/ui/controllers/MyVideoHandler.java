package net.vectorgaming.mediarealm.ui.controllers;

import java.util.ArrayList;
import javafx.event.Event;
import javafx.event.EventHandler;


/*The event handler for the myVideo Button*/
public class MyVideoHandler implements EventHandler
{

    private String[] directories;
    public static boolean needScan = true;
    //Creat class and package location for the VideoButtons Class
    public static ArrayList <VideoButtons> videoButtonsList = new ArrayList<VideoButtons>();

    @Override
    public void handle(Event t)
    {
       
        //implement cleaning of flowpane
       
        if (needScan)
        {
            getDirectories();
            loadFiles();

        }
        
        addButtons();
    }
    /*Scans the file "Directories" loacted in net\vectorgaming\mediarealm\config
     and for each directory found creates a string with the directory and loads 
     it into the directories Array;
     */

    private void getDirectories()
    {

    }

    /*Scans the directories given in the @directorie array  for video files
     and with each file found creates an object 
     and loads said object into an arrayList @VideoPointers*/
    private void loadFiles()
    {

    }

    
    /*adds all the buttons in the Arraylist @videoButtonsList to  
    the flow pane located in the content pane*/
    private void addButtons()
    {

    }
}

package net.vectorgaming.mediarealm.ui.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;


/*The event handler for the myVideo Button*/
public class MyVideoHandler implements EventHandler {

    private ArrayList<String> directories;
    public static boolean needScan = true;
    //Creat class and package location for the VideoButtons Class
    //public static ArrayList <VideoButtons> videoButtonsList = new ArrayList<VideoButtons>();

    @Override
    public void handle(Event t) {

        //implement cleaning of flowpane
        if (needScan) {
            getDirectories();
            loadFiles();
        }

        addButtons();
    }
    /*Scans the file "Directories" loacted in net\vectorgaming\mediarealm\config
     and for each directory found creates a string with the directory and loads 
     it into the directories Array
     */

    private void getDirectories() {
        directories = new ArrayList<String>();
        int counter = 0;
        String line;
        BufferedReader reader = null;
        File directoriesConfig;
        try {
            directoriesConfig = new File("C:/Users/XSoloDoloX/Documents/GitHub/MediaRealmOfficial/src/net/vectorgaming/mediarealm/config/Directories.txt");
            reader = new BufferedReader(new FileReader(directoriesConfig));

        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(MyVideoHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            while (reader.ready()) 
            {
                line = reader.readLine();
                System.out.println(line);
                directories.add(line);
            }
        } 
        catch (IOException e) 
        {

        }

    }
    /*Scans the directories given in the @directorie array  for video files
     and with each file found creates an object 
     and loads said object into an arrayList @VideoPointers*/

    private void loadFiles() {
        for (String directory : directories) {

        }
    }

    /*adds all the buttons in the Arraylist @videoButtonsList to  
     the flow pane located in the content pane*/
    private void addButtons() {

    }
}

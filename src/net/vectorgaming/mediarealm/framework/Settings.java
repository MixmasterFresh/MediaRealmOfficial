package net.vectorgaming.mediarealm.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.vectorgaming.mediarealm.ui.controllers.MyVideoHandler;

/**
 *
 * @author XSoloDoloX
 */
public class Settings implements Serializable
{
    private static Settings settings;
    
    private ArrayList<String> directories;
    
    public Settings()
    {
        directories = new ArrayList<>();
        directories.add("C:/Users/appam_000/Downloads");
    }
    
    public static void init()
    {
        if(settings == null)
        {
            settings = new Settings();
        }
    }
    
    public static Settings getInstance()
    {
        return settings;
    }
    
    public ArrayList<String> getDirectories()
    {
        return directories;
    }
    
    public void setDirectories(ArrayList<String> dirs)
    {
        directories = dirs;
    }
}

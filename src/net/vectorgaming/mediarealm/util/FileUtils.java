/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.vectorgaming.mediarealm.util;

import java.io.File;
import java.util.ArrayList;
import net.vectorgaming.mediarealm.contentpanelobjects.VideoContentButton;
import net.vectorgaming.mediarealm.framework.Settings;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author XSoloDoloX
 */
public class FileUtils
{
     public static ArrayList <VideoContentButton> VideoButtonList = new ArrayList<VideoContentButton>();
    
     private static final String[] EXTENSIONS_VIDEO =
    {
        "3g2",
        "3gp",
        "3gp2",
        "3gpp",
        "amv",
        "asf",
        "avi",
        "bin",
        "divx",
        "drc",
        "dv",
        "f4v",
        "flv",
        "gvi",
        "gxf",
        "iso",
        "m1v",
        "m2v",
        "m2t",
        "m2ts",
        "m4v",
        "mkv",
        "mov",
        "mp2",
        "mp2v",
        "mp4",
        "mp4v",
        "mpe",
        "mpeg",
        "mpeg1",
        "mpeg2",
        "mpeg4",
        "mpg",
        "mpv2",
        "mts",
        "mtv",
        "mxf",
        "mxg",
        "nsv",
        "nuv",
        "ogg",
        "ogm",
        "ogv",
        "ogx",
        "ps",
        "rec",
        "rm",
        "rmvb",
        "tod",
        "ts",
        "tts",
        "vob",
        "vro",
        "webm",
        "wm",
        "wmv",
        "wtv",
        "xesc"
    };
    /*Scans the directories given in the @directory array  for video files
     and with each file found creates an object 
     and loads said object into an arrayList @VideoPointers*/
    public static void scanDirs( )
    {
        if(Settings.getInstance() == null)
        {
            System.out.println("Settings null");
        }
        
        if(Settings.getInstance().getDirectories() == null)
        {
            System.out.println("Dirs null");
        }
        for (String directory : Settings.getInstance().getDirectories())
        {
            File dir = new File(directory);
            File[] files = dir.listFiles();
            scanSubDirs(files);
        }
    }

    private static void scanSubDirs(File[] files)
    {
        if (files != null)
        {
            for (File f : files)
            {
                if (f.isDirectory())
                {
                    File[] subDirectory = f.listFiles();
                    scanSubDirs(subDirectory);
                }
                for (String name : EXTENSIONS_VIDEO)

                {
                    if (FilenameUtils.getExtension(f.getName()).equalsIgnoreCase(name))
                    {
                        System.out.println(f.getAbsolutePath());
                        VideoButtonList.add(new VideoContentButton ( f.getName(), f.getAbsolutePath()));
                        
                    }
                }
            }

        }
    }
}

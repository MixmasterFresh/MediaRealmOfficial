package net.vectorgaming.mediarealm.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.vectorgaming.mediarealm.framework.Settings;

/**
 *
 * @author XSoloDoloX
 */
public class Serialization
{
    public static void serialize(Settings settings)
    {
        try
        {
            File f = new File("settings"+File.separator+"settings.rlm");
            if(!f.exists())
            {
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(settings);
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Settings deserializeSettings(String path)
    {
        Settings s = null;
        try
        {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            s = (Settings) ois.readObject();
            ois.close();
            fis.close();
        }catch(FileNotFoundException ex)
        {
            //log
        }catch (IOException | ClassNotFoundException ex)
        {
            //log
        }
        return s;
    }
    
    
}

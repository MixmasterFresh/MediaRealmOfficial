package net.vectorgaming.mediarealm.util;

import java.io.File;
import net.vectorgaming.mediarealm.configuration.Serialization;
import net.vectorgaming.mediarealm.framework.Settings;

/**
 *
 * @author XSoloDoloX
 */
public class SLAPI
{
    public static void loadSettings()
    {
        if(new File("settings"+File.separator+"settings.rlm").exists())
        {
            Serialization.deserializeSettings("settings"+File.separator+"settings.rlm");
        }
    }
    
    public static void saveSettings()
    {
        Serialization.serialize(Settings.getInstance());
    }
}

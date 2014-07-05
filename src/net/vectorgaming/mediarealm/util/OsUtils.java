
package net.vectorgaming.mediarealm.util;

public class OsUtils
{

    public static String osType = null;

    public static void scanOS()
    {
        if (osType == null)
        {
            osType = System.getProperty("os.name") + " " + System.getProperty("os.arch");
        }
    }
}

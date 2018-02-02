/*
 * Project Ren @ 2018
 * Rinkako, Ariana, Gordan. SYSU SDCS.
 */
package org.sysu.renNameService.utility;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Rinkako
 * Date  : 2018/1/18
 * Usage : This utility used for getting the timestamp.
 */
public class TimestampUtil {
    /**
     * Get timestamp in pattern of `yyyy-MM-dd HH:mm:ss`
     * @return timestamp in string
     */
    public static String GetTimeStampString() {
        return sdf.format(new Date());
    }

    /**
     * Timestamp string formatter.
     */
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}


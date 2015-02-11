/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileOperations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

     public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

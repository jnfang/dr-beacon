package drbeacon.models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


/**
 * Created by jfang on 10/8/16.
 */

public class Appointment {
    // get the supported ids for GMT-08:00 (Pacific Standard Time)
    static String[] ids = TimeZone.getAvailableIDs(2 * 60 * 60 * 1000);
    private static SimpleTimeZone appTimeZone = new SimpleTimeZone(2 * 60 * 60 * 1000, ids[0]);
    public Calendar timezone  = new GregorianCalendar(appTimeZone);
    public Date date;
    public Doctor doc;
    public String clinic;


}

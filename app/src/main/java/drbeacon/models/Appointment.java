package drbeacon.models;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


/**
 * Created by jfang on 10/8/16.
 */

public class Appointment {
    // get the supported ids for GMT-08:00 (Pacific Standard Time)
    static String[] ids = TimeZone.getAvailableIDs(2 * 60 * 60 * 1000);
    static int counter=5;
    private static SimpleTimeZone appTimeZone = new SimpleTimeZone(2 * 60 * 60 * 1000, ids[0]);
    public Calendar time  = new GregorianCalendar(appTimeZone);
    public Doctor doc;
    public String location;
    public String clinic;
    public Boolean hasAppointment;

    public Appointment(){
        time = Calendar.getInstance();
        time.add(Calendar.DATE, Appointment.counter);
        doc = null;
        location = null;
        clinic = null;
        hasAppointment = true;
        Appointment.counter+=2;
    }

    public static String getReadableDate(Calendar c) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        Calendar cal = c;
        return dateFormat.format(cal.getTime());
    }


    public Appointment(Boolean input_hasAppointment, Doctor doctor, String input_location, String input_clinic) {
        this.time = Calendar.getInstance();
        this.time.add(Calendar.DATE, Appointment.counter);
        this.hasAppointment = input_hasAppointment;
        this.location = input_location;
        this.clinic = input_clinic;
        this.doc = doctor;
        Appointment.counter+=5;

    }

    public Boolean isHasAppointment() {
        return hasAppointment;
    }

    public void setHasAppointment(Boolean hasAppointment) {
        this.hasAppointment = hasAppointment;
    }



    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}

package drbeacon.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jfang on 10/8/16.
 */

public class User {

    private String firstName, lastName;
    private Date birthDate;
    private String sex;
    private ArrayList<Appointment> apptSchedule;
    private ArrayList<String> conditionLabels;
    private ArrayList<String> historyDescriptions;

    public ArrayList<String> TestConditions (){
        ArrayList<String> condlabels = new ArrayList<String>();
        condlabels.add("Pneumonia");
        condlabels.add("Sprained ankle");
        condlabels.add("High blood pressure");
        condlabels.add("Appendicitis");
        condlabels.add("Broken toe");
        return condlabels;
    }

    public ArrayList<String> TestHistory (){
        ArrayList<String> histories = new ArrayList<String>();
        histories.add("Fall of 2013 diagnosed after week of camping in the mountains, prescribed XXX medication");
        histories.add("March 2010 second degree sprain from falling down stairs");
        histories.add("June 2009 diagnosed from yearly physical checkup, father also has it");
        histories.add("December 2000 sudden onset of appendicitis, removed at nearby clinic, in bedrest for 2 days");
        histories.add("September 1990 broke toe from impact on being hit by football");
        return histories;
    }

    public ArrayList<String> getConditionLabels() {
        return conditionLabels;
    }

    public void setConditionLabels(ArrayList<String> conditionLabels) {
        this.conditionLabels = conditionLabels;
    }

    public ArrayList<String> getHistoryDescriptions() {
        return historyDescriptions;
    }

    public void setHistoryDescriptions(ArrayList<String> historyDescriptions) {
        this.historyDescriptions = historyDescriptions;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ArrayList<Appointment> getApptSchedule() {
        return apptSchedule;
    }

    public void setApptSchedule(ArrayList<Appointment> apptSchedule) {
        this.apptSchedule = apptSchedule;
    }



}

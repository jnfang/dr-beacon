package drbeacon.models;

/**
 * Created by jfang on 10/8/16.
 */

public class Doctor {
    public String firstName;
    public String lastName;
    public String room;
    public String education;

    public Doctor (String firstName, String lastName, String room, String education){


    }

    public Doctor(String inputlastName) {
        firstName = "Jane";
        lastName = inputlastName;
        room = "A5E123";
        education = "Harvard Medical School";
//        profile = R.drawable.ic_android_doctor;

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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }




}



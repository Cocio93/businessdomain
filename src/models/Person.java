package models;

import java.util.ArrayList;

public class Person {
    private ArrayList<Hobby> hobby = new ArrayList();
    private InfoEntity info;
    private String firstName, lastName;
    
    public Person(String fName, String lName, Hobby hobby, InfoEntity info) {
        firstName = fName;
        lastName = lName;
        this.hobby.add(hobby);
        this.info = info;
    }

    public Person() {
        
    }
    public ArrayList<Hobby> getHobbys() {
        return hobby;
    }

    public void addHobby(Hobby hobby) {
        this.hobby.add(hobby);
    }

    public InfoEntity getInfo() {
        return info;
    }

    public void setInfo(InfoEntity info) {
        this.info = info;
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
}

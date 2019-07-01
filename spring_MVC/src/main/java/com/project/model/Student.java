package com.project.model;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String state;
    private LinkedHashMap<String, String> stateOptions;
    private String course;
    private String gender;
    private String[] language;

    public Student(){
        stateOptions = new LinkedHashMap<String, String>();

        stateOptions.put("Andra Pradesh", "Andra Pradesh");
        stateOptions.put("Arunachal Pradesh", "Arunachal Pradesh");
        stateOptions.put("Assam", "Assam");
        stateOptions.put("Bihar", "Bihar");
        stateOptions.put("Chhattisgarh", "Chhattisgarh");
        stateOptions.put("Goa", "Goa");
        stateOptions.put("Gujarat", "Gujarat");
        stateOptions.put("Haryana", "Haryana");
        stateOptions.put("Himachal Pradesh", "Himachal Pradesh");
        stateOptions.put("Jammu and Kashmir", "Jammu and Kashmir");
        stateOptions.put("Jharkhand", "Jharkhand");
        stateOptions.put("Karnataka", "Karnataka");
        stateOptions.put("Kerala", "Kerala");
        stateOptions.put("Madya Pradesh", "Madya Pradesh");
        stateOptions.put("Maharashtra", "Maharashtra");
        stateOptions.put("Manipur", "Manipur");
        stateOptions.put("Meghalaya", "Meghalaya");
        stateOptions.put("Mizoram", "Mizoram");
        stateOptions.put("Nagaland", "Nagaland");
        stateOptions.put("Orissa", "Orissa");
        stateOptions.put("Punjab", "Punjab");
        stateOptions.put("Rajasthan", "Rajasthan");
        stateOptions.put("Sikkim", "Sikkim");
        stateOptions.put("Tamil Nadu", "Tamil Nadu");
        stateOptions.put("Telagana", "Telagana");
        stateOptions.put("Tripura", "Tripura");
        stateOptions.put("Uttaranchal", "Uttaranchal");
        stateOptions.put("Uttar Pradesh", "Uttar Pradesh");
        stateOptions.put("West Bengal", "West Bengal");
        stateOptions.put("Andaman and Nicobar Islands", "Andaman and NicobarIslands");
        stateOptions.put("Dadar and Nagar Haveli", "Dadar and Nagar Haveli");
        stateOptions.put("Daman and Diu", "Daman and Diu");
        stateOptions.put("Delhi", "Delhi");
        stateOptions.put("Lakshadeep", "Lakshadeep");
        stateOptions.put("Pondicherry", "Pondicherry");
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public LinkedHashMap<String, String> getStateOptions() { return stateOptions; }

    public String getCourse() { return course; }

    public void setCourse(String course) { this.course = course; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String[] getLanguage() { return language; }

    public void setLanguage(String[] language) { this.language = language; }
}

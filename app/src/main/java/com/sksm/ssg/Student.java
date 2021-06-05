package com.sksm.ssg;

public class Student {
    public  String name;
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String password;
    public String phonenumber;
    public String rollnumber;


    public Student(String name, String email, String password, String phonenumber, String rollnumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
        this.rollnumber = rollnumber;
    }


    public Student() {
    }



}

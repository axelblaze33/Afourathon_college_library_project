package com.example.studentsdetails;

public class StudentsInfo {
    int rollno;
    String fname;
    String phone;
    String gmail;
    StudentsInfo(){

    }

    public String getMail() {
        return gmail;
    }

    public void setMail(String gmail) {
        this.gmail = gmail;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
//    public int getRollno() {
//        return rollno;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }

    public int getId() {
        return rollno;
    }

    public void setId(int id) {
        this.rollno = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


}


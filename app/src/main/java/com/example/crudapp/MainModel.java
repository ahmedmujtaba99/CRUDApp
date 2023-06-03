package com.example.crudapp;

public class MainModel {
    String Name,Day,Date;
    int Phone;

//     default constructor
    MainModel() {

    }

//    constructor
    public MainModel(int phone,String day,String name, String date) {
        this.Phone = phone;
        this.Day = day;
        this.Date = date;
        this.Name = name;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }


}

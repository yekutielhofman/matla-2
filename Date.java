package com.company;
//targil 2
public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //method 1
    public Date earlierDate(Date other){
        if (other.year < year) return other;
        else if (other.year > year) return this;

        if (other.month < month) return other;
        else if (other.month > month) return this;

        if (other.day < day) return other;
        else if (other.day > day) return this;
        return null;
    }
    //method 2
    public boolean isLegal(){
        if(day<1 || day > 31) return false;
        if(month<1 || month > 12) return false;
        if (day == 31){
            if (month == 4 || month == 6 || month == 9 || month == 11) return false;
        }
        if (month == 2){
            if (day > 28 && day !=29) return false;
            if (year % 4 != 0) return false;
            if (year % 100 == 0 && year % 400 != 0) return false;

        }
        return true;
    }
}

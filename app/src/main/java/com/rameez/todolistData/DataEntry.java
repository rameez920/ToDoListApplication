package com.rameez.todolistData;

/**
 * Created by Rameez on 1/6/2016.
 */
public class DataEntry {
    private CharSequence entryName;
    private CharSequence description;
    private int month, day, year;
    private int hour, minute;

    public DataEntry(String entryName, String description, int month, int day, int year, int hour, int minute) {
        this.entryName = entryName;
        this.description = description;
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;

    }

    public CharSequence getEntryName() {
        return entryName;
    }

    public void setEntryName(CharSequence entryName) {
        this.entryName = entryName;
    }

    public CharSequence getDateandTime() {
        return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
    }

    public CharSequence getDescription() {
        return description;
    }

    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

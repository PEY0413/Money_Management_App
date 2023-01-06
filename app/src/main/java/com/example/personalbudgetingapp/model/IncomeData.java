package com.example.personalbudgetingapp.model;

public class IncomeData {

    private String date, id;
    private int amount, week, month;
    private String notes;

    public IncomeData() {
    }

    public IncomeData(String date, String id, int amount, int week, int month, String notes) {
        this.date = date;
        this.id = id;
        this.amount = amount;
        this.week = week;
        this.month = month;
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

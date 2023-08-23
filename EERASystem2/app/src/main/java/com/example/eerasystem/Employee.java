package com.example.eerasystem;

public class Employee {
    private String title, description;
    private int id;

    public Employee(String title, int id, String description ){
        this.title = title;
        this.id = id;
        this.description = description;
    }
    public Employee(){
    }

    public Employee(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}

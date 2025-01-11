package com.StarkIndustries.SpringSecurityMark1.Model;

public class Student {

    private String sid;
    private String name;
    private String department;
    private String year;

    public Student(String sid, String name, String department, String year) {
        this.sid = sid;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public Student(){

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

package com.denis;

import java.util.Date;

public class Human {
    private String name;
    private String secondName;
    private Date birthday;
    private Gender gender;

    public enum Gender {MALE, FEMALE};

    public Human() {

    }

    public Human(String name, String secondName, Date birthday, Gender gender) {
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}';
    }
}

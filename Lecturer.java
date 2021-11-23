package com.company;

enum Lect{
    ENGLISH,MATHS,PHYSICS, PROGRAMMING, GARDENING
}

public class Lecturer {
    private String name;
    private Lect lecture;

    public Lecturer(String name, Lect lecture) {
        this.name = name;
        this.lecture = lecture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lect getLecture() {
        return lecture;
    }

    public void setLecture(Lect lecture) {
        this.lecture = lecture;
    }


    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lecture=" + lecture +
                '}';
    }
}

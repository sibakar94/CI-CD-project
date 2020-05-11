package com;

public class Student {
    private String name;
    private int roll;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
        Student student1=new Student();
        Student student2=new Student();
        student1.setRoll(1);
        student1.setName("A");
        student1.setAge(20);
        student2.setRoll(2);
        student2.setName("B");
        student2.setAge(19);
        System.out.println("Total age:"+student1.getAge()+student2.getAge());

    }


}


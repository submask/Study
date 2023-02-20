package com.work.student;

public class Student {
    private String name;
    private int number;
    private String ClassName;
    private int age;
    private String sex;

    public Student(String name, int number, String className, int age, String sex) {
        this.name = name;
        this.number = number;
        this.ClassName = className;
        this.age = age;
        this.sex = sex;
    }

    public String toString(){
        return  "我叫"+this.name+",我的性别是"+this.sex+",我的年龄是"+this.age+"，我的学号是"+this.number+"，所在班\n" +
                "级是"+this.ClassName;
    }
}

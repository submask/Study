package com.work.Ticket;

public class Visitor {
    private String name;
    private int age;

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String PrintVisitor(){
        if(this.age>60||this.age<18){
            return this.name+"的年龄是"+this.age+"，门票免费";
        }
        return this.name+"的年龄是"+this.age+"，门票20元";
    }
}

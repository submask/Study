package com.work.clock;

public class Clock {
    private int hourse;
    private int minute;
    private int second;

    public Clock(int hourse, int minute, int second) {
        this.hourse = hourse;
        this.minute = minute;
        this.second = second;
    }
    public String show(){
        return this.hourse+":"+this.minute+":"+this.second;
    }
}

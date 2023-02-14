package com.study;

import java.util.ArrayList;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("亚洲");
        list.add("欧洲");
        list.add("非洲");
        list.add("美洲");
        list.add("大洋洲");
        for (int index=0;index<list.size();index++){
            System.out.println(list.get(index));
        }
    }
}

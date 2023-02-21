package com.work.Login;

public class Students implements loginUser{
    private  String username="";
    private String passwd="";
    private String name="";

    public Students(String username, String passwd, String name) {
        this.username = username;
        this.passwd = passwd;
        this.name = name;
    }

    @Override
    public String login() {
        if (username.equals("xs1") && passwd.equals("123456")){
             name="小明";
        }
        if (username.equals("xs2") && passwd.equals("123456")){
            name="小红";
        }
        if (username.equals("xs3") && passwd.equals("123456")){
            name="小东";
        }
        return name;
    }
}

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

        }
    }
}

package com.jdbc;


import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String passwd="123";
        String sql="insert into users values (105,'zhangsanf','123','zsf')";
        DBHelper.getConnection();
//        Driver driver=new com.mysql.cj.jdbc.Driver();
//        DriverManager.registerDriver(driver);
        Connection con= DriverManager.getConnection(url,user,passwd);
        Statement stmt=con.createStatement();
        int result= stmt.executeUpdate(sql);
        if (result!=0){
//            System.out.printf("已完成数据添加");
            String Sql="select * from users";
            ResultSet rs=stmt.executeQuery(Sql);
            while (rs.next()) {
                System.out.printf("\tid=" + rs.getString("id")
                        + "\t user=" + rs.getString("user")
                        + "\t passwd=" + rs.getString("passwd")
                        + "\t name=" + rs.getString("name") + "\n");
            }
        }else{
            System.out.printf("未完成");
        }
        /*
//        ResultSet rs=stmt.executeQuery(sql);
//        while (rs.next()){
//            System.out.printf("\tid="+rs.getString("id")
//                    +"\t user="+rs.getString("user")
//                    +"\t passwd="+rs.getString("passwd")
//                    +"\t name="+rs.getString("name")+"\n"
//            );
//        }
        sql查询语句
         */
//        rs.close();
        DBHelper.close(con,stmt);
    }
}

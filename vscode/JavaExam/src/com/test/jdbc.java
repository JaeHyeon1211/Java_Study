package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Member{

    private String userid;
    private String username;
    private int age;


    Member(String userid, String username, int age){

        this.userid = userid;
        this.username = username;
        this.age = age;
    }


    public String getUserid(){ return userid;}
    public String getUsername(){ return username;}
    public int getAge(){ return age;}

}

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbd:mariadb://127.0.0.1:3306/webdev";
        String userid= "webmaster";
        String userpw = "1234";
        String query = "select userid, username, age from tbl_test";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("org.mariadb.jdbc"); //일종의 드라이버 프로그램 연동
        con = DriverManager.getConnection(url, userid, userpw);
        stmt =  con.createStatement();
        rs = stmt.executeQuery(query);

        //List<Member>list = new ArrayList<>();
        //{"klion", "kimyounghee","23"};
        


    }
}

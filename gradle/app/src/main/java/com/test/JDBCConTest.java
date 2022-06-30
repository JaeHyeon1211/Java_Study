package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

public class JDBCConTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid= "webmaster";
        String userpw = "1234";
        String query = "select userid, username, age from tbl_test";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("org.mariadb.jdbc.Driver"); //일종의 드라이버 프로그램 연동
        con = DriverManager.getConnection(url, userid, userpw);
        stmt =  con.createStatement();
        rs = stmt.executeQuery(query);

        //List<Member>list = new ArrayList<>();
        //{"klion", "kimyounghee","23"};
        List<Member> list = new ArrayList<>();
        
        while(rs.next()){
                //resultSet이 나올때까지 뺑뺑 돌릴꺼다
            list.add(new Member(rs.getString("userid"), rs.getString("username"), 
            rs.getInt("age")));
    
        }
        for(Member member:list) {
            System.out.println("아이디 = " + member.getUserid()
             + ", 이름 = " + member.getUsername()
             + ", 나이 = " + member.getAge());
            }

    if(rs != null) rs.close();
    if(stmt != null) stmt.close();
    if(con != null) con.close();

    }
}

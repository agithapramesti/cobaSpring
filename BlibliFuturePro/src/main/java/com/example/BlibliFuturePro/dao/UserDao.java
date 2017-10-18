package com.example.BlibliFuturePro.dao;

import com.example.BlibliFuturePro.model.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    public static Connection CON;
    public  static final String url="jdbc:postgresql://localhost:5432/db_bookstore";
    public  static final  String username="postgres";
    public  static final  String password="366milala";
    public UserDao(){}
    public void makeConnection(){
        System.out.println("Opening database..");
        try{
            CON= DriverManager.getConnection(url,username,password);
            System.out.println("Sukses Opening db!!");
        }catch (Exception e){
            System.out.println("Eror openning db.");
            System.out.println(e);
        }
    }
    public void closeConnection(){
        System.out.println("Closing database..");
        try {
            CON.close();
            System.out.println("Success Closing db!");
        }catch (Exception e){
            System.out.println("Eror while closing db");
            System.out.println(e);
        }
    }
    public List<User> getAllUser(){
        String sql="select * from tbl_user";
        System.out.println("Daftar User");
        List<User> list= new ArrayList<>();
        try{
            System.out.println("get1");
            Statement stat= CON.createStatement();
            ResultSet rs= stat.executeQuery(sql);
            if(rs!=null){
                System.out.println("get2");
                while (rs.next()){
                    System.out.println("get3");
                    User U= new User(rs.getString("username"),rs.getString("password"));
                    list.add(U);
                }
            }
            rs.close();
            stat.close();
        }
        catch (Exception e){
            System.out.println("Eror while reading dtabase..");
            System.out.println(e);
        }
        return list;
    }
}

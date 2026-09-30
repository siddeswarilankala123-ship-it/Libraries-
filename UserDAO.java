package com.library.dao;
import com.library.model.User; import com.library.util.DBConnection; import java.sql.*;
public class UserDAO {
 public User login(String email,String password)throws SQLException{
  String q="SELECT * FROM users WHERE email=? AND password=?";
  try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(q)){
   p.setString(1,email); p.setString(2,password); ResultSet r=p.executeQuery();
   if(r.next()){User u=new User();u.setUserId(r.getInt("user_id"));u.setName(r.getString("name"));u.setEmail(r.getString("email"));u.setRole(r.getString("role"));return u;}
  } return null;
 }
 public boolean register(String name,String email,String password)throws SQLException{
  try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("INSERT INTO users(name,email,password) VALUES(?,?,?)")){
   p.setString(1,name);p.setString(2,email);p.setString(3,password);return p.executeUpdate()>0;
  }
 }
}
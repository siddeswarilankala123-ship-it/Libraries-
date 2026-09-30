package com.library.dao;
import com.library.model.Book; import com.library.util.DBConnection; import java.sql.*; import java.util.*;
public class BookDAO {
 public List<Book> all()throws SQLException{
  List<Book> list=new ArrayList<>(); try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("SELECT * FROM books ORDER BY book_id DESC");ResultSet r=p.executeQuery()){
   while(r.next()){Book b=new Book();b.setBookId(r.getInt("book_id"));b.setTitle(r.getString("title"));b.setAuthor(r.getString("author"));b.setCategory(r.getString("category"));b.setIsbn(r.getString("isbn"));b.setQuantity(r.getInt("quantity"));b.setAvailableQuantity(r.getInt("available_quantity"));list.add(b);}
  } return list;
 }
 public void add(Book b)throws SQLException{
  try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("INSERT INTO books(title,author,category,isbn,quantity,available_quantity) VALUES(?,?,?,?,?,?)")){
   p.setString(1,b.getTitle());p.setString(2,b.getAuthor());p.setString(3,b.getCategory());p.setString(4,b.getIsbn());p.setInt(5,b.getQuantity());p.setInt(6,b.getQuantity());p.executeUpdate();
  }
 }
}
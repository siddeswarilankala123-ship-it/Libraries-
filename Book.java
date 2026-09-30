package com.library.model;
public class Book {
 private int bookId,quantity,availableQuantity; private String title,author,category,isbn;
 public int getBookId(){return bookId;} public void setBookId(int v){bookId=v;}
 public String getTitle(){return title;} public void setTitle(String v){title=v;}
 public String getAuthor(){return author;} public void setAuthor(String v){author=v;}
 public String getCategory(){return category;} public void setCategory(String v){category=v;}
 public String getIsbn(){return isbn;} public void setIsbn(String v){isbn=v;}
 public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;}
 public int getAvailableQuantity(){return availableQuantity;} public void setAvailableQuantity(int v){availableQuantity=v;}
}
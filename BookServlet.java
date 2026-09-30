package com.library.controller;
import javax.servlet.*;import javax.servlet.http.*;import java.io.*;import com.library.dao.BookDAO;import com.library.model.Book;
public class BookServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
  try{Book b=new Book();b.setTitle(req.getParameter("title"));b.setAuthor(req.getParameter("author"));b.setCategory(req.getParameter("category"));b.setIsbn(req.getParameter("isbn"));b.setQuantity(Integer.parseInt(req.getParameter("quantity")));new BookDAO().add(b);res.sendRedirect("books.jsp?added=1");}catch(Exception e){throw new ServletException(e);}
 }
}
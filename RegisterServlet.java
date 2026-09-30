package com.library.controller;
import javax.servlet.*;import javax.servlet.http.*;import java.io.*;import com.library.dao.UserDAO;
public class RegisterServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
  try{new UserDAO().register(req.getParameter("name"),req.getParameter("email"),req.getParameter("password"));res.sendRedirect("login.jsp?registered=1");}catch(Exception e){throw new ServletException(e);}
 }
}
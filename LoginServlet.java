package com.library.controller;
import javax.servlet.*;import javax.servlet.http.*;import java.io.*;import com.library.dao.UserDAO;import com.library.model.User;
public class LoginServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
  try{User u=new UserDAO().login(req.getParameter("email"),req.getParameter("password"));if(u!=null){req.getSession().setAttribute("user",u);res.sendRedirect("dashboard.jsp");}else{res.sendRedirect("login.jsp?error=Invalid%20login");}}catch(Exception e){throw new ServletException(e);}
 }
}
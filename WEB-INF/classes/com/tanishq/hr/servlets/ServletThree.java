package com.tanishq.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.tanishq.hr.dl.*;
import java.util.*;
public class ServletThree extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}
catch(Exception e)
{
//do nothing
}
}
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
String fName=request.getParameter("fname");
String lname=request.getParameter("lname");
int age=Integer.parseInt(request.getParameter("age"));
PrintWriter pw=response.getWriter();
response.setContentType("text/plain");
pw.print("First Name: "+fName+" Last Name: "+lname+" Age: "+age);
}catch(Exception e)
{
try{response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);}catch(Exception ee){}
}
}
}
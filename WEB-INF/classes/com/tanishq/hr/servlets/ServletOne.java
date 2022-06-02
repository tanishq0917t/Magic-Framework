package com.tanishq.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.tanishq.hr.dl.*;
import java.util.*;
import com.google.gson.*;
public class ServletOne extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}catch(Exception ee)
{
//do nothing
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
PrintWriter pw=response.getWriter();
response.setContentType("application/json");
response.setCharacterEncoding("utf-8");
DesignationDAO designationDAO=new DesignationDAO();
Set<DesignationDTO> designations=designationDAO.getAll();
Gson gson=new Gson();
String jsonString=gson.toJson(designations);
pw.print(jsonString);
pw.flush();
}//try ends here
catch(Exception e)
{
try
{
response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
}catch(Exception ee)
{
//do nothing
}
}
}//doGet ends here
}

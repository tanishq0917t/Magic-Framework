package com.tanishq.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.tanishq.hr.dl.*;
import java.util.*;
public class ServletTwo extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
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
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter pw=null;
try
{
pw=response.getWriter();
int code=Integer.parseInt(request.getParameter("code"));
response.setContentType("text/plain");
DesignationDAO designationDAO=new DesignationDAO();
DesignationDTO designationDTO=designationDAO.getByCode(code);
pw.print(designationDTO.getCode()+","+designationDTO.getTitle());
}
catch(DAOException daoException)
{
pw.print("Invalid");
}
catch(Exception e)
{
try{response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);}catch(Exception ee){}
}
}
}
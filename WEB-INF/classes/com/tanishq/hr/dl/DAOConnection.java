package com.tanishq.hr.dl;
import java.sql.*;
public class DAOConnection
{
private DAOConnection(){}
public static Connection getConnection() throws DAOException
{
Connection connection=null;
try
{
System.out.println("S1");
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("S2");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","tanishq","tanishq");
System.out.println("S3");
}catch(Exception e)
{
System.out.println("naa");
throw new DAOException(e.getMessage());
}
return connection;
}
}

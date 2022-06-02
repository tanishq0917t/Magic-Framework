package com.tanishq.hr.servlets;
public class Customer implements java.io.Serializable
{
public int age;
public String fname,lname;
public void setFname(String fname)
{
this.fname=fname;
}
public void setLname(String lname)
{
this.lname=lname;
}
public void setAge(int age)
{
this.age=age;
}
public String getFname()
{
return this.fname;
}
public String getLname()
{
return this.lname;
}
public int getAge()
{
return this.age;
}
}
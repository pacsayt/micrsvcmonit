package com.examplespring.boot.employeesvc;

public class Employee
{
  private int id;
  private String name;

  public Employee()
  {
    id = -1;
    name = "";
  }

  public Employee( int iniId, String iniName)
  {
    id = iniId;
    name = iniName;
  }

  @Override
  public String toString()
  {
    return "Employee [id=" + id + ", name=" + name + "]";
  }
}
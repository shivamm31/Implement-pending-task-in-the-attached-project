package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.SaveEmployeeService;
import com.knoldus.learning.service.SaveEmployeeServiceImpl;
import com.knoldus.learning.service.ValidateEmployeeService;
import com.knoldus.learning.service.ValidateEmployeeServiceImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeController {

    public static void main(String[] a){
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEmployeeServiceImpl();
        List<Employee> emplList = new ArrayList<>();


                String line = "";
                String splitBy = ",";
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader("LearningJava/sample.csv"));
                    while ((line = br.readLine()) != null)   //returns a Boolean value
                    {
                        String[] employee = line.split(splitBy);    // use comma as separator
                        //System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");
                        int id=Integer.parseInt(employee[0]);
                        String name=employee[1];
                        Employee empObj=new Employee(id,name);
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

        System.out.println("Saved employee  : "+saveEmployeeService.getEmployeeCount());
    }
}

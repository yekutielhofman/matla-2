package com.company;

import java.util.ArrayList;

//targil 1
public class Employee {

    String name;
    int salary;
    int seniority;

    public Employee(String name, int salary, int seniority) {
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;


    }
    //method 1
    public Double efficency(){
        return (double)(salary/seniority);
    }
    //method 2
    public ArrayList<Employee> filter(ArrayList<Employee> allEmployees){
        ArrayList<Employee> res = new ArrayList<Employee>();
        for(Employee e : allEmployees){
            if( e.salary<15000 && e.seniority>120 ) res.add(e);
        }
        return res;
    }
}

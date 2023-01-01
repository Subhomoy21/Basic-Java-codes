package com.company;

class Employee{  //  case sensitive maintain the formatting of the letters in class as well as same in the main section
    int id;
    String name;
    long salary;
    int age;
    public void EmployeePrintDetails(){
        System.out.println("The id of the employee is\n" + id);
        System.out.println("The name of the employee is\n" + name);
        System.out.println("The salary of the employee is\n" + salary);
    }
    public int ageDetails(){
        return  age;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // main (Instantiating a new employee object)
        Employee subhomoy = new Employee();
        Employee deepak = new Employee();
         //  setting the attributes!
        subhomoy.id =2;
        subhomoy.name="At The End Of The Day I Will Submit My Work";
        subhomoy.salary=455555454;
        subhomoy.age=21;
        deepak.id =3;
        deepak.name="At the starting of the day I try to submit my work";
        deepak.salary=465555454;
        deepak.age=22;
         //  Printing the attributes!
        // System.out.println(subhomoy.id);
        // System.out.println(subhomoy.name);
        // System.out.println(subhomoy.salary);
        subhomoy. EmployeePrintDetails();
        deepak.EmployeePrintDetails();

        int findingAge1 = subhomoy.ageDetails();
        int findingAge2 = deepak.ageDetails();
        System.out.println("The age of Employee Subhomoy:");
        System.out.println(findingAge1);
        System.out.println("The age of Employee  Deepak:");
        System.out.println(findingAge2);
    }
}

//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee() {
        this("",0,0.0);
    }
    public Employee(String name,int yearJoined,double basicSalary){
        setName(name);
        setYearJoined(yearJoined);
        setBasicSalary(basicSalary);
    }


    //Getters
    public String getName(){
        return name;
    }
    public int getYearJoined(){
        return yearJoined;
    }
    public double getBasicSalary(){
        return basicSalary;
    }

    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setYearJoined(int yearJoined){
        this.yearJoined=yearJoined;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }


    public String toString(){
        return "Employee Name : "+name+"\nYear Joined         : "+yearJoined+" year"+"\nBasic Salary       : RM "+basicSalary;
    }
    public double calculateSalary(){
        return basicSalary;
    }

    public boolean equals(Object test){
        if(test instanceof Employee){
            System.out.print("\nThe Employee Name "+name+" and "+((Employee)test).name+" is ");
            return name.equals(((Employee)test).name);
        }
        else{
            return false;
        }
    }
}
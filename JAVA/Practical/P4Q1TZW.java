
public class P4Q1TZW {

    public static void main(String[] args) {

        P4Q1Employee zinwei=new P4Q1Employee("TAN ZIN WEI",3000.00);
        P4Q1Employee Ali=new P4Q1Employee("Ali");
        P4Q1Employee Abu=new P4Q1Employee();

        //Employee zinwei
        System.out.println("Employee Name    : "+zinwei.getNameEmployee());
        System.out.println("Current Salary        : "+zinwei.getSalaryEmployee());
        zinwei.raiseSalary(8);
        System.out.println("After Raise Salary  : "+zinwei.getSalaryEmployee());

        //Employee Ali
        System.out.println("\nEmployee Name    : "+Ali.getNameEmployee());
        System.out.println("Current Salary        : "+Ali.getSalaryEmployee());
        Ali.raiseSalary(20);
        System.out.println("After Raise Salary  : "+Ali.getSalaryEmployee());

        // Employee Abu
        System.out.println("\nEmployee Name    : "+Abu.getNameEmployee());
        System.out.println("Current Salary        : "+Abu.getSalaryEmployee());
        Abu.raiseSalary(20);
        System.out.println("After Raise Salary  : "+Abu.getSalaryEmployee());



        System.out.println("\nAssign Salary of " +Ali.getNameEmployee()+" is RM4000.00");
        Ali.setSalaryEmployee(4000.00);
        if(zinwei.getSalaryEmployee()>Ali.getSalaryEmployee()){
            System.out.println("\n"+zinwei.getNameEmployee()+" is the Higher Salary");
            System.out.println("Current Salary is RM"+zinwei.getSalaryEmployee());
        }
        else{
            System.out.println("\n"+Ali.getNameEmployee()+" is the Higher Salary");
            System.out.println("Current Salary is RM"+Ali.getSalaryEmployee());
        }

        double total=zinwei.getSalaryEmployee()+Ali.getSalaryEmployee();
        System.out.print("\nTotal Salary of "+zinwei.getNameEmployee()+" and "+Ali.getNameEmployee()+" is RM "+total);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P7Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public abstract class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    

    public int compareTo(Employee e) {
        return (int) (this.id - e.id);
    }

    public abstract double computeMonthlyPay();

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + '}';
    }

}

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
public class Manager extends Employee {

    private double allowance;

    public Manager() {
    }

    public Manager(double allowance) {
        this.allowance = allowance;
    }

    public Manager(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double computeMonthlyPay() {
        return super.getBasicSalary() + this.allowance;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + "allowance=" + allowance + '}';
    }

}

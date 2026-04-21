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
public class Cleark extends Employee {

    private int overtimeHours;
    private double overtimeRate;

    public Cleark() {
    }

    public Cleark(int overtimeHours, double overtimeRate) {
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public Cleark(int id, String name, double basicSalary, int overtimeHours, double overtimeRate) {
        super(id, name, basicSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double computeOvertimePay() {
        return this.overtimeHours * this.overtimeRate;
    }

    public double computeMonthlyPay() {
        return super.getBasicSalary() + computeOvertimePay();
    }

    @Override
    public String toString() {
        return "Cleark{" +super.toString()+ "overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate + '}';
    }
    
    

}

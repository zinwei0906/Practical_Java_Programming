//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class Clerk extends Employee{

    private double allowance;
    private int overtimeHours;
    private static double overtimeRate=5.0;
    public Clerk() {

    }
    public Clerk(String name,int yearJoined,double basicSalary,double allowance,int overtimeHours) {
        super(name,yearJoined,basicSalary);
        setAllowance(allowance);
        setOvertimeHours(overtimeHours);
    }


    //Getters
    public double getAllowance(){
        return allowance;
    }
    public int getOvertimeHours(){
        return overtimeHours;
    }

    //Setters
    public void setAllowance(double allowance){
        this.allowance=allowance;
    }
    public void setOvertimeHours(int overtimeHours){
        this.overtimeHours=overtimeHours;
    }


    public String toString(){
        return super.toString()+"\nAllowance           : RM "+allowance+"\nOvertime Hours  : "+overtimeHours+" hour(s)"+"\nOvertime Rate    : "+overtimeRate+"%"+"\nMonthly Salary    : RM "+calculateSalary();
    }
    public double calculateSalary(){
        return super.calculateSalary()+allowance+overtimeHours*overtimeRate;
    }
}
//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class CommissionEmployee extends Employee{

    private double grossSale;
    private double commissonRate;

    public CommissionEmployee() {
        this("",0,0.0,0.0,0.0);
    }
    public CommissionEmployee(String name,int yearJoined,double basicSalary,double grossSale,double commissonRate) {
        super(name,yearJoined,basicSalary);
        setGrossSale(grossSale);
        setCommissonRate(commissonRate);
    }


    //Getters
    public double getGrossSale(){
        return grossSale;
    }
    public double getCommissonRate(){
        return commissonRate;
    }

    //Setters
    public void setGrossSale(double grossSale){
        this.grossSale=grossSale;
    }
    public void setCommissonRate(double commissonRate){
         this.commissonRate=commissonRate;
    }


    public String toString(){
        return super.toString()+"\nGross Sale         : "+grossSale+"\nCommisson Rate : "+commissonRate+"%"+"\nMonthly Salary    : RM "+calculateSalary();
    }
    public double calculateSalary(){
        return super.calculateSalary()+grossSale*commissonRate;
    }
}
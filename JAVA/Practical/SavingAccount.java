
public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount() {
        this("",0,0.0);
    }
    public SavingAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    public double calculateInterest(){
        return getBalance()*interestRate;
    }
    public void addInterest(){
        double interest=calculateInterest();
        deposit(interest);
    }
    public String toString(){
        return (super.toString() +"\nInterestRate : "+interestRate);
    }

}
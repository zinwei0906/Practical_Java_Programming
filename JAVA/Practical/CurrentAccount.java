
public class CurrentAccount extends Account{
    private int transactionCount;
    private static int freeTransaction=10;
    private static double transactionFee=0.50;
    public CurrentAccount() {
    }
    public CurrentAccount(String accountNumber,double balance){
        super(accountNumber,balance);
        transactionCount=0;
    }
    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
        if(transactionCount > freeTransaction)
            deductTransactionFee();
    }
    public boolean withdraw(double amount){
        boolean successful=super.withdraw(amount);
        if(successful){
            transactionCount++;
            if(transactionCount > freeTransaction)
            deductTransactionFee();
        }
        return successful;
    }
    public void deductTransactionFee(){
        super.withdraw(transactionFee);
    }
    public String toString(){
        return (super.toString()+"\nNo. of Transaction : "+transactionCount);
    }
}
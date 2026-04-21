import java.util.Date;

public class Account {
    private String accountNumber;
    private double balance;
    private Date dateCreated;

    public Account(){
        this("",0.0);
    }
    public Account(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        dateCreated=new Date();
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount>balance)
            return false;

        balance-=amount;
        return true;
    }
    public String toString(){
        return ("Account No : "+accountNumber+"\nBalance : " +balance+ "\nDate Created : "+dateCreated);
    }
    public boolean equals(Object o){
        if(o instanceof Account){
            System.out.println(accountNumber+","+((Account)o).accountNumber);
            return accountNumber.equals(((Account)o).accountNumber);
        }
        else{
            return false;
        }
    }
}
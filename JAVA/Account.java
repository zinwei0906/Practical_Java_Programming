import java.util.Scanner;
public class Account {
    private int accountNo;
    private String accountHolderName;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this(0,"",0.0);
    }

    public Account(int accountNo, String accountHolderName, double accountBalance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = accountBalance;
        this.annualInterestRate=annualInterestRate;
    }

    //setters
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }

    //getter
    public double getBalance(){
        return this.balance;
    }

    public void cashIn(double cash){
        this.balance += cash;
    }

    public void cashOut(double cash){
        this.balance -= cash;
    }

    public double calculateInterest(){
        return balance * annualInterestRate;
    }
    public String toString(){
        return("Account Name : "+accountNo+"\nAccount Holder Name : "+accountHolderName+"\nAccount Balance : "+balance);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        Account account = new Account(1001,"TAN ZIN WEI",1000.00);
        System.out.println("account");
        FixedDepositAccount ali=new FixedDepositAccount(1111,"Ali",100,0.03,4);
        System.out.println("ali");
        /*do{
            System.out.println("\n\tMain Menu");
            System.out.println("\t1 : Check In");
            System.out.println("\t2 : Cash Out");
            System.out.println("\t3 : Cash Out");
            System.out.println("\t4 : Interest");
            System.out.println("\t5 : Exit");
            System.out.print("\n\tEnter a choice : ");
            choice=scanner.nextInt();

            if(choice==1){
                System.out.println("\tTAN ZIN WEI .Your account balance is RM "+account.getBalance());
            }
            else if(choice==2){
                System.out.print("\tEnter the amount to Cash In > ");
                double IN=scanner.nextInt();
                account.cashIn(IN);
                System.out.print("\tTAN ZIN WEI .Your account balance is RM "+account.getBalance());
            }
            else if(choice==3){
                System.out.print("\tEnter the amount to Cash Out > ");
                double OUT=scanner.nextInt();
                account.cashOut(OUT);
                System.out.print("\tTAN ZIN WEI .Your account balance is RM "+account.getBalance());
            }
            else if(choice==4){
                account.setAnnualInterestRate(1.5);
                System.out.print("\tTAN ZIN WEI .Your Interest is RM "+account.calculateInterest());
            }
        }while(choice!=5);*/
    }
}
class FixedDepositAccount extends Account{
    private int savingYears;

    public double calculateInterest(){
        return super.calculateInterest()*savingYears;
    }
    public String toString(){
        return (super.toString()+"\nSaving Years : "+savingYears);
    }
}
class OverdraftAccount extends Account{
    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;
}
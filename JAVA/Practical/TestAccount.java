import java.util.Scanner;
public class TestAccount {

    public static void main(String[] args) {
        Account [ ] account={new SavingAccount(),new CurrentAccount("2222",8000.00)};
        account[0].deposit(600);
        account[0].withdraw(900);
        account[1].deposit(1000);
        account[1].withdraw(500);

        System.out.println(account[0]+"\n\n"+account[1]);
        ((SavingAccount)account[0]).addInterest();
        System.out.println("\n"+account[0]+"\n\n"+account[1]);

        SavingAccount acc3333=new SavingAccount("2222",900.00,0.04);
        System.out.println(acc3333.equals(account[0]));
        System.out.println(acc3333.equals(account[1]));

        /*Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n\tMain Menu");
            System.out.println("\t1 : Saving Account");
            System.out.println("\t2 : Current Account");
            System.out.println("\t3 : Deposit");
            System.out.println("\t4 : Withdraw");
            System.out.println("\t5 : Exit");
            System.out.print("\n\tEnter a choice : ");
            choice=scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\t1 : Saving Account");
                    break;
                case 2:
                    System.out.println("\t2 : Current Account");
                    break;
                case 3:
                    System.out.println("\t3 : Depost");
                    break;
                case 4:
                    System.out.println("\t4 : Withdraw");
                    break;
                default:
                   System.out.println("\tInvalid Input");
            }
        }while(choice!=5);
        System.out.print("\nExit From The System!!!");*/
    }
}

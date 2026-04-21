import java.util.Scanner;


public class P1Q1TZW{

    public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter name : ");
		String name=input.nextLine();

		System.out.print("\nEnter your year of study : ");
		int year=input.nextInt();

		System.out.print("\nWhat is your target GPA for this semester? ");
		double gpa=input.nextDouble();

		System.out.println("\n\nWelcome "+name+"!");

		System.out.println("Work hard to acheive your taget GPA of " + gpa + " ,this semester of your Year" + year + ".");
    }
}
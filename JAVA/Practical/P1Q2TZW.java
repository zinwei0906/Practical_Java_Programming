import java.util.Scanner;

public class P1Q2TZW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Enter your age (years) : ");
		int age =input.nextInt();

		System.out.println("\n\nAge in years : " +age+" years");
		System.out.println("Age in days : "+age*365+" days");
		System.out.println("Age in seconds : "+age*365*24*60*60+" seconds");
    }
}
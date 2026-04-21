import java.util.Scanner;

public class T1Q5TZW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the min Number > ");
		int minNum=input.nextInt();
		System.out.print("Enter the max Number > ");
		int maxNum=input.nextInt();

		int sum=0;

		System.out.print("Odd Numbers from " +minNum +" to " +maxNum+" are : ");
		for (int i = minNum; i <= maxNum; i++){
			if (i % 2 != 0) {
			System.out.print(i + " ");
			sum+=i;
			}
		}
		System.out.println("\n\nSum of the odd numbers = "+sum);
    }
}
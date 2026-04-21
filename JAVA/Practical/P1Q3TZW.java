import java.util.Scanner;

public class P1Q3TZW {

    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Please Enter the Credit Card Number > ");
    	int creditCardNumber=scanner.nextInt();

    	//Step1
    	int checkCCN1=creditCardNumber;
    	int sum1=0;
    	for(int number=0; number<5;number++){
    		sum1+=checkCCN1%10;
    		checkCCN1/=100;
    	}
    	System.out.println("Step 1 is "+sum1);

    	//Step2
    	int checkCCN2=creditCardNumber/10;
    	int sum2=0;
    	int check=0;
    	for(int number=1; number<8; number+=2){
    		check=(checkCCN2%10)*2;
    		sum2+=check/10;
    		check%=10;
    		sum2+=check;
    		checkCCN2/=100;
    	}
    	System.out.println("Step 2 is "+sum2);

    	int total=sum1+sum2;
    	int lastdigit=total%10;

    	System.out.println("Step 1 + Step 2  is "+total);
    	if(lastdigit==0){
    		System.out.println("\nThe Credit Card Number "+creditCardNumber + " is Valid");
    	}
    	else{
    		System.out.println("\nThe Credit Card Number "+creditCardNumber +" is Invalid");
    	}
    }
}

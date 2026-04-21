import java.util.Scanner;

public class P3Q1TZW {

    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Enter number of quiz scores to process : ");
    	int number=scanner.nextInt();
    	int [ ] scores=new int [number];

    	int scoreNumber=1,total=0;
    	for(int num=0;num<number;num++){
    		System.out.print("Score "+scoreNumber+ " : ");
    		scores[num]=scanner.nextInt();
    		scoreNumber++;
    		total+=scores[num];
    	}

    	double average=(double)total/(double)number;
    	System.out.print("\n\nResults\n======\nTotal is "+total+"\nAverage is "+average);

    	int moreAverage=0,lessAverage=0;
    	for(int num=0;num<number;num++){
    		if(scores[num]>=average)
    			moreAverage+=1;
    		else{
    			lessAverage+=1;
    		}
    	}
    	System.out.println("\nNumber of scores above or equal to the average is "+moreAverage);
    	System.out.println("Number of scores below the average is " +lessAverage);
    }
}

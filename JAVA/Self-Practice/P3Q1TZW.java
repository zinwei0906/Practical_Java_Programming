//Name : TAN ZIN WEI
//Student ID : 19WMD06432
//Group : DIA2 Group 6
import java.util.Scanner;
public class P3Q1TZW{
    public static void main(String[] args) {
        int [ ] arrayDenomination={100,50,20,10,5,1};
          int [ ] arrayQuantity=new int [6];
          int [ ] arrayValue=new int [6];
          int total=0;

         Scanner scanner=new Scanner(System.in);
         System.out.print("\tDenomination (RM) \t\t Quantity\n");

        for(int number=0;number<arrayDenomination.length;number++){
            System.out.printf("\t%12d\t\t\t    ",arrayDenomination[number]);
             arrayQuantity[number]=scanner.nextInt();
             arrayValue[number]=arrayDenomination[number]*arrayQuantity[number];
             total+=arrayValue[number];
        }

        System.out.print("\n\n\tDenomination (RM) \t\t Quantity\t\tValue (RM)");
        for(int number=0;number<arrayDenomination.length;number++){
            if(arrayQuantity[number]==0){
                number++;
            }
            else{
                    System.out.printf("\n\t%16d%25d%25d",arrayDenomination[number],arrayQuantity[number],arrayValue[number]);
            }
        }
        System.out.print("\n\tTotal = RM "+total);
    }
}
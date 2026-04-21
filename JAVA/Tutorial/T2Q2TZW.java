//Name : TAN ZIN WEI
//Student ID : 19WMD06432
//Group : DIA2 Group 6
import java.util.Scanner;

public class T2Q2TZW {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int year;

        System.out.print("Enter the year (0 to stop): ");
        year=scanner.nextInt();
        while(year!=0){
            if(checkLeapYear(year)==1){
                System.out.print("The Year "+year+" is a Leap Year\n\n");
            }
            else{
                System.out.print("The Year "+year+" is not a Leap Year\n\n");
            }
            System.out.print("Enter the year (0 to stop): ");
            year=scanner.nextInt();
        }
    }

    public static int checkLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0||year<1582){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
    }
}

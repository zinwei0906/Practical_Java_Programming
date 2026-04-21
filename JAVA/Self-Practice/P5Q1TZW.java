//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

import java.util.Scanner;

public class P5Q1TZW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Valid Password Rule : ");
        System.out.println("1. A Password must have at least 7 character , of which the first one must be a letter.");
        System.out.println("2. A Password consists of only letters and digits.");
        System.out.println("3. A Password must contain at least one letter and at least one digit.");
        for(int number=1;number<7;number++){
            System.out.print("\nPlease Enter The Password > ");
            String password=scanner.next();
            if(validPassword(password)){
                System.out.println("The Password "+password+" is Valid Password");
            }
            else{
                System.out.println("The Password "+password+" is Invalid Password");
            }
        }
    }
    public static boolean validPassword(String Password){
        if(Password.length()<7||!Character.isLetter(Password.charAt(0))){
            System.out.println("A Password must have at least 7 character , of which the first one must be a letter.");
            return false;
        }
        else{
            int countLetter=0;
            int countDigit=0;
            for(int num=0;num<Password.length();num++){
                if(!Character.isLetterOrDigit(Password.charAt(num))){
                    System.out.println("A Password consists of only letters and digits.");
                    return false;
                }
                else if(Character.isDigit(Password.charAt(num))){
                    countDigit++;
                }
                else{
                    countLetter++;
                }
            }
            if(countLetter<1||countDigit<1){
                System.out.println("A Password must contain at least one letter and at least one digit.");
                return false;
            }
            else{
                return true;
            }
        }
    }
}

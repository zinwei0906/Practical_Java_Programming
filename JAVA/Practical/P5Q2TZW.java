import java.util.Scanner;

public class P5Q2TZW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=scanner.nextLine();

        //Modify the String to Upper Case
        str=str.toUpperCase();
        //Replace All the Vowels to lower case letter 'x'
        str=str.replaceAll("[AEIOU]", "x");
        System.out.print("Modified string : "+str);
        //System.out.print("Modified string : "+toUppercase(str));
    }
    /*public static String toUppercase(String str){
        str=str.toUpperCase();
        str=str.replaceAll("[AEIOU]", "x");
        return str;
    }*/
}

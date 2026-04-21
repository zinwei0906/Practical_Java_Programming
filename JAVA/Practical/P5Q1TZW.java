import java.util.Scanner;
public class P5Q1TZW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a world : ");
        String world=scanner.next();
        System.out.print("Enter the letter you want to count : ");
        char letter=scanner.next().charAt(0);
        countLetter(world,letter);
        System.out.print("\n"+world+" contains "+countLetter(world,letter)+" "+letter);
    }
    public static int countLetter(String str,char ch){
        /*int count=0;
        char[] charStr = str.toCharArray();
        for(int num=0;num<charStr.length;num++){
            if(charStr[num]==ch){
                count++;
            }
        }
        return count;*/
        int count=0;
        for(int num=0;num<str.length();num++){
            if(str.charAt(num)==ch){
                count++;
            }
        }
        return count;
    }
}

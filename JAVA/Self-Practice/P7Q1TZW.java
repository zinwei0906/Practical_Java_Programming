//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class P7Q1TZW {
    public static void main(String[] args) {

        ComparableCircle circle1 = new ComparableCircle(10);
        ComparableCircle circle2 = new ComparableCircle(5);
        ComparableCircle circle3 = new ComparableCircle(5);

        System.out.println("\n\nCircle 1 = "+circle1);
        System.out.println("Circle 2 = "+circle2);
        System.out.println("Circle 3 = "+circle3);
        System.out.println("\nCircle 1 Compare to Circle 2 :");
        if(circle1.compareTo(circle2)==1){
            System.out.println("Circle 1 Larger Than Circle 2");
            circle1.howToColor();
        }
        else if(circle1.compareTo(circle2)==-1){
            System.out.println("Circle 1 Smaller Than Circle 2");
        }
        else{
            System.out.println("Circle 1 Same With Circle 2");
        }

        System.out.println("\nCircle 2 Compare to Circle 3 :");
        if(circle2.compareTo(circle3)==1){
            System.out.println("Circle 2 Larger Than Circle 3");
            circle2.howToColor();
        }
        else if(circle2.compareTo(circle3)==-1){
            System.out.println("Circle 2 Smaller Than Circle 3");
        }
        else{
            System.out.println("Circle 2 Same With Circle 3");
        }
    }
}

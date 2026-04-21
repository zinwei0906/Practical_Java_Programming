//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class ComparableCircle extends Circle implements Comparable,Colorable{
    public ComparableCircle() {
        this(0);
    }
    public ComparableCircle(double radius) {
        super(radius);
    }

    public void howToColor(){
        System.out.println("The Circle color is Blue");
    }
    public int compareTo(Object o) {
        if (getRadius() > ((Circle)o).getRadius()){
            return 1;
        }
        else if (getRadius() < ((Circle)o).getRadius())
            return -1;
        else
            return 0;
  }
}
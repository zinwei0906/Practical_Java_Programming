public class TestCircle {
   public static void main(String[] args) {
     Circle circle1 = new Circle(5);
     Circle circle2 = new Circle(10);
     Circle circle3 = new Circle(15);
     //Circle circle1 = new Circle(5);
     //Circle circle2 = new Circle(5);
     //Circle circle3 = new Circle(5);

     System.out.println("1)Area = " +  circle1.findArea());
     System.out.println("No. of objects = " +circle1.getNoOfObjects());

     System.out.println("\n2)Area = " + circle2.findArea());
     System.out.println("No. of objects = " +circle2.getNoOfObjects());

     System.out.println("\n3)Area = " + circle3.findArea());
     System.out.println("No. of objects = " +circle3.getNoOfObjects());

    System.out.println("Circle.getNoOfObjects() = " +Circle.getNoOfObjects());

  }
}

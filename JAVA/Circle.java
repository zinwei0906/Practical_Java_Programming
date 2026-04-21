class Circle {
    private double radius;
    private static int numberOfObjects=1;

    public Circle(double radius) {
        //radius++;
        this.radius = radius;
        numberOfObjects++;
   }

   public static int getNoOfObjects() {
        return numberOfObjects;
   }

   public double findArea() {
         return Math.PI * radius * radius;
   }
}
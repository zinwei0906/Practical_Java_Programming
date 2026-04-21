
class Airplane {
    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private static int numOfAirplane=0;

    public Airplane() {
        this(" ",0.0,0,0);
        numOfAirplane++;
    }
    public Airplane(String id,double price,int yearOfPurchased,int numOfPassenger){
        setId(id);
        this.price=price;
        this.yearOfPurchased=yearOfPurchased;
        setNumOfPassenger(numOfPassenger);
        numOfAirplane++;
    }
    //Setters
    public void setId(String id){
        this.id=id;
    }
    public void setNumOfPassenger(int numOfPassenger){
        this.numOfPassenger=numOfPassenger;
    }
    //Getters
    public String getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYearOfPurchased(){
        return this.yearOfPurchased;
    }
    public int getNumOfPassenger(){
       return this.numOfPassenger;
    }
    public static int getNumOfAirplane(){
        return Airplane.numOfAirplane;
    }
    public double calCurrentValue(){
        double Currentvalue =0;
        Currentvalue = price - (price * 0.1 *(2011 - this.yearOfPurchased));
        if (Currentvalue < 0 ){
            Currentvalue = 0;
        }
        return Currentvalue;
    }
    public String toString(){
        return "\nID                              : "+id+"\nPrice                         : RM"+price+"\nYear of Purchased   : "
            +yearOfPurchased+"\nNum of Passenger   : "+numOfPassenger+"\nThe Current Value    : RM"+calCurrentValue();
    }

    //Main
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("QWE12345",300000,2020,200);
        Airplane airplane2 = new Airplane("XYZ 0001",250000,2005,100);

        System.out.println(airplane1);
        System.out.println(airplane2);
        //System.out.println(airplane1.toString());
        //System.out.println(airplane2.toString());
        System.out.println("Total Number Of Airplane is "+Airplane.numOfAirplane);
    }

}

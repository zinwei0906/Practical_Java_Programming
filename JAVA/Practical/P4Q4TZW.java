import java.util.Scanner;

public class P4Q4TZW {
    Scanner scanner=new Scanner(System.in);
    //CarType[ ] = {new CarType("Toyota","Vios",1.5),new CarType("Nissan","Teana",2.0),new CarType("Honda","City",1.6)};
    //Class 1
    static class Registration{
        private int regNo;
        private Owner owner;
        private Car car;
        private static int nextRegNo=1001;

        public Registration(Owner owner,Car car){
            this.regNo=nextRegNo;
            this.owner=owner;
            this.car=car;
            nextRegNo++;
        }

        public String toString(){
            return String.format("%-6d %-27s %-61s",regNo,owner,car);
        }
    }
    //Class 2
    class Owner{
        private String name;
        private String icNo;

        public Owner(){
            this("","");
        }

        public Owner(String name,String icNo){
            this.name=name;
            this.icNo=icNo;
        }

        public String toString(){
            return String.format("%-15s %12s",name,icNo);
        }
    }
    //Class 3
    class Car{
        private String plateNo;
        private String color;
        private int year;
        private CarType carType;

        public Car(String plateNo,String color,int year,CarType carType){
            this.plateNo=plateNo;
            this.color=color;
            this.year=year;
            this.carType=carType;
        }

        public String toString(){
            return String.format("%-10s %-10s %6d %-35s",plateNo,color,year,carType);
        }
    }
    //Class 4
    class CarType{
        private String make;
        private String model;
        private double capacity;

        public CarType(){
            this("","",0);
        }

        public CarType(String make,String model,double capacity){
            this.make=make;
            this.model=model;
            this.capacity=capacity;
        }

        public String toString(){
            return String.format("%-15s %-10s %10.2f",make,model,capacity);
        }
    }
    /*public static void main(String[] args) {
        Registration [ ] carRegistrations = new Registration [4];

        for(int number=0;number<carRegistrations.length;number++){
            System.out.println("Enter Owner's Name : ");
            String name=scanner.nextLine();

            System.out.println("Enter IC Number : ");
            String ic=scanner.next();

            System.out.println("Car Type : ");
            System.out.println("Plate No > ");
            String plate=scanner.next();

            System.out.println("Color > ");
            String color=scanner.next();

            System.out.println("Year > ");
            int year=scanner.nextInt();

            for(int num=0;num<carTypes.length;num++){
                System.out.println((num+1)+"."+carTypes[num]);
            }

            System.out.println("Choose the Car Type : ");
            int choose=scanner.nextInt();
        }
        for(int n=0;num<carRegistrations .length;n++){
                System.out.println(carRegistration[n]);
        }
    }*/
}
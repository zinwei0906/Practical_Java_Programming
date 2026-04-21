//Author:TAN ZIN WEI
//Student ID : 19WMD06432
//Student Name : TAN ZIN WEI

public class P6Q1TZW {
    public static void main(String[] args) {
        Object[ ] empArray={new Employee ("TAN ZIN WEI",2000,2000.00),
                                            new CommissionEmployee ("TEE SENG SEN",2001,3000.00,1000.00,2.0),
                                            new Clerk ("LIM WU SENG",2002,4000.00,500.00,12)};

    Object[ ] emp123={new Employee ("TAN ZIN WEI",2003,2500.00),
                                     new CommissionEmployee ("TAN ZIN WEI",2004,3500.00,1000.00,2.0),
                                     new Clerk ("LIM WU SENG",2005,4500.00,500.00,10)};

    printElement(empArray);
    printElement(emp123);

    System.out.print("\n\nempArray[0].equals(emp123[0])");
    System.out.println(empArray[0].equals(emp123[0]));

    System.out.print("\nempArray[1].equals(emp123[1])");
    System.out.println(empArray[1].equals(emp123[1]));

    System.out.print("\nempArray[2].equals(emp123[2])");
    System.out.println(empArray[2].equals(emp123[2]));

    System.out.print("\nemp123[1].equals(emp123[1])");
    System.out.println(emp123[1].equals(emp123[1]));
    }

    public static void printElement(Object[ ] objectArray){
        for(Object element : objectArray){
            if(element instanceof CommissionEmployee){
                System.out.println("\nEmployee Type   : CommissionEmployee");
            }
            else if(element instanceof Clerk){
                System.out.println("\nEmployee Type   : Clerk");
            }
            else if(element instanceof Employee){
                System.out.println("\nEmployee Type   : Employee");
            }
            else{
                System.out.println("\nDidn't have the Employee Type");
            }
            System.out.println(element);
        }
    }
}

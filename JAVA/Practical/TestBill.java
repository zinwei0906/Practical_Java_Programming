public class TestBill {

    public static void main(String[] args) {
        PatientBill[ ] bills={new Inpatient("Ali Said",230.00,185.00,'S',3),
        new Outpatient("MarrayLim",98.00),
        new Outpatient("Peter Tan",125.00),
        new Inpatient("John Smith",190.00,105.00,'P',4)
        };
        printBill(bills);
        System.out.println("\nTotal bills : RM"+computerTotalCollection(bills)+"\n\n");

        //sorting
        java.util.Arrays.sort(bills);
        printBill(bills);
        System.out.println("\nTotal bills : RM"+computerTotalCollection(bills));
    }
    public static void printBill(PatientBill[ ] bills){
        /*for(int number=0;number<bills.length;number++){
            System.out.println(bills[number]);
            System.out.println("-----------------------------------------");
            System.out.println("Total charges : RM "+bills[number].calcTotalCharges());
            System.out.println("-----------------------------------------\n");
        }*/
        for(PatientBill element : bills){
            System.out.println(element);
            System.out.println("-----------------------------------------");
            System.out.println("Total charges : RM "+element.calcTotalCharges());
            System.out.println("-----------------------------------------\n");
        }
    }
    public static double computerTotalCollection(PatientBill[ ] bills){
        double total=0.0;
        /*for(int num=0;num<bills.length;num++){
            total+=bills[num].calcTotalCharges();
        }*/
        for(PatientBill element : bills){
            total+=element.calcTotalCharges();
        }
        return total;
    }
}

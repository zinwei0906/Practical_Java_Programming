
public class Inpatient extends PatientBill{
    private static double standardRate=100.00;
    private static double privateRate=200.00;
    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationStay;

    public Inpatient() {
    }
    public Inpatient(String name,double specialistCharges,double labCharges,char roomType,int durationStay) {
        super(name);
        this.specialistCharges=specialistCharges;
        this.labCharges=labCharges;
        this.roomType=roomType;
        this.durationStay=durationStay;
    }
    public double calcTotalCharges(){
        double roomCharges=0.0;
        if(roomType=='S'){
            roomCharges=durationStay*standardRate;
        }
        else if(roomType=='P'){
            roomCharges=durationStay*privateRate;
        }
        else{
            System.out.println("Invalid Room Type!!!");
        }
        return roomCharges+specialistCharges+labCharges;
    }
    public String toString(){
        return super.toString()+"\nSpecialist Charges : RM "+specialistCharges+"\nLab Charges          : RM "+labCharges+
            "\nRoom Type            : "+roomType+"\nDuration of Stay     : "+durationStay+" days";
    }
}

public class Outpatient extends PatientBill{
    private static double registrationFees=30.00;
    private double consultationFees;

    public Outpatient() {
    }
    public Outpatient(String name,double consultationFees) {
        super(name);
        this.consultationFees=consultationFees;
    }
    public double calcTotalCharges(){
        return registrationFees+consultationFees;
    }
    public String toString(){
        return super.toString()+"\nRegistration Fees  : RM "+registrationFees+"\nConsultation Fees : RM "+consultationFees;
    }

}
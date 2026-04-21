
public abstract class PatientBill implements Comparable{
    protected int visitID;
    protected String name;
    private static int lastVisitID=1000;

    public PatientBill() {
    }
    public PatientBill(String name) {
        visitID=lastVisitID;
        this.name=name;
        lastVisitID++;
    }
    public String toString(){
        return "Visit ID                    : "+visitID+"\nPatient Name         : "+name;
    }
    public abstract double calcTotalCharges();


    public int compareTo(Object o){
        PatientBill obj=(PatientBill)o;
        return name.compareTo(obj.name);
    }
}
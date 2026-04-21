public class T2Q3ComputerNetPay {
    public static double computerNetPay(int hourWorked,double hourPayRate,double taxRate){

    	return (hourWorked*hourPayRate)*(1-taxRate);
    }
    public static double computerNetPay(int hourWorked,double hourPayRate){
    	double taxRate=0.15;
    	return (hourWorked*hourPayRate)*(1-taxRate);
    }
    public static double computerNetPay(int hourWorked){
    	double hourPayRate=8.5;
    	double taxRate=0.15;
    	return (hourWorked*hourPayRate)*(1-taxRate);
    }
}
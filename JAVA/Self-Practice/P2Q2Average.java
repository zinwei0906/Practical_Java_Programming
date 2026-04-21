public class P2Q2Average {
	    public static void main(String[] args) {
        System.out.println("calculateAverage(10,10) = "+P2Q2Average.calculateAverage(10,10));
        System.out.println("calculateAverage(20,20,20) = "+P2Q2Average.calculateAverage(20,20,20));
        System.out.println("calculateAverage(10.5,10.5) = "+P2Q2Average.calculateAverage(10.5,10.5));
        System.out.println("calculateAverage(20.5,20.5,20.5) = "+P2Q2Average.calculateAverage(20.5,20.5,20.5));

        System.out.println("calculateAverage(10,10.5) = "+P2Q2Average.calculateAverage(10,10.5));
        System.out.println("calculateAverage(20,20.5,20) = "+P2Q2Average.calculateAverage(20,20.5,20));
    }


    public static int calculateAverage(int number1,int number2){
    	return (number1+number2)/2;
    }
    public static int calculateAverage(int number1,int number2,int number3){
    	return (number1+number2+number3)/3;
    }
	public static double calculateAverage(double number1,double number2){
    	return (number1+number2)/2;
    }
    public static double calculateAverage(double number1,double number2,double number3){
    	return (number1+number2+number3)/3;
    }

}
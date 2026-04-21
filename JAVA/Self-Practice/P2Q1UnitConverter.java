public class P2Q1UnitConverter {
	    public static void main(String[] args) {
    	double inches=1,centimeters=5;
    	System.out.printf("\t%-20s%-40s%-20s%s\n","Inches","Centimeters","Centimeters","Inches");
    	for(int number=1;number<=10;number++){
    		if(number>=10){
    			System.out.printf("\t%-21.2f%-45.2f%-24.2f%.2f\n",inches,inchToCentimeter(inches),centimeters,centimeterToInch(centimeters));
    		}
    		else if (number>=4){
    			System.out.printf("\t%-22.2f%-45.2f%-24.2f%.2f\n",inches,inchToCentimeter(inches),centimeters,centimeterToInch(centimeters));
    		}
    		else if(number>=2){
    			System.out.printf("\t%-22.2f%-46.2f%-24.2f%.2f\n",inches,inchToCentimeter(inches),centimeters,centimeterToInch(centimeters));
    		}
    		else{
    			System.out.printf("\t%-22.2f%-46.2f%-25.2f%.2f\n",inches,inchToCentimeter(inches),centimeters,centimeterToInch(centimeters));
    		}
    		inches+=1;
    		centimeters+=5;
    	}
    }
	    public static double inchToCentimeter(double in){
    	return in*2.54;
    }
    	public static double centimeterToInch(double cm){
    	return cm/2.54;
    }
}
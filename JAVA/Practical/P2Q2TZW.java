public class P2Q2TZW {

    public static void main(String[] args) {

    	System.out.println("The Math Square of  9 is "+Math.sqrt(9));
    	//System.out.println("The Square of -1is "+Square(-1));
    	System.out.println("The Square of 0 is "+Square(0));
    	System.out.println("The Square of 1 is "+Square(1));
    	System.out.println("The Square of 9 is "+Square(9));

    }
    public static double Square(double num){
    	double lower,upper,midpoint,mid2;

    	//If the num is <0
    	if(num<0){
    		System.out.println("Error!!!Negative number cant not allow");
    		System.exit(1);
    	}
    	if(num==0){
    		return 0;
    	}
    	else if(num==1){
    		return 1;
    	}
    	else if (num<1){
    		lower=num;
    		upper=1;
    		    while((upper-lower)/lower>=1.0e-8){
    			midpoint=(lower+upper)/2;
    			mid2=midpoint*midpoint;
    			if(mid2>num)
    				upper=midpoint;
    			else
    				lower=midpoint;
    		}


    	}
    	else{
    		lower=1;
    		upper=num;
    		while((upper-lower)/lower>=1.0e-8){
    			midpoint=(lower+upper)/2;
    			mid2=midpoint*midpoint;
    			if(mid2>num)
    				upper=midpoint;
    			else
    				lower=midpoint;
    		}
    	}
    	//return the value
    	return (lower+upper)/2;
    }
}




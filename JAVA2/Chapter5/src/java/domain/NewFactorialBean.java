package domain;

import java.text.*;

public class NewFactorialBean implements java.io.Serializable {
    private int number;
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public long getFactorial() {
        long factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }
    
    public static String format(long number) {
        NumberFormat format = NumberFormat.getInstance();
        return format.format(number);
    }
}

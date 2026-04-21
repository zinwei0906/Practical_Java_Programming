public class test {
    public static void main(String[] args) {
        //Question 1
        /*String s1 ="Hello";
        String s2 = s1;
        s1 = s1 + "there!";
        String s3 = "Hello";
        if (s1==s2)
        System.out.println("s1==s2 is true");
        else
        System.out.println("s1==s2 is not true");
        if (s2==s3)
        System.out.println("s2==s3 is true");
        else
        System.out.println("s2==s3 is not true");*/

        //Question 2
        /*String s1 = "I Love TAR College Very Much !";
        String OOP1 = new String("Introduction to OOP");
        System.out.println("ii) " + s1.charAt(19));
        System.out.println("iii) " + s1.equalsIgnoreCase("much"));
        System.out.println("iv) " + s1.replace('e', 'x'));
        System.out.println("v) " + s1.length());
        System.out.println("vi) " + s1.indexOf("ege"));
        System.out.println("vii) " + s1.lastIndexOf("ege", 30));
        System.out.println("Sub: " + OOP1.substring(2,8));*/

        //Question 3
        /*String s1= new String ("Demo");
        String s2 = s1;
        String s3= new String (s1);
        String s4= new String ("demo");
        if (s1 == s2)
        System.out.println("s1 == s2");
        if (s1 == s3)
        System.out.println("s1 == s3");
        if (s1.equals(s3))
        System.out.println("s1 equals s3");
        if (s1.equals(s4))
        System.out.println("s1 equals s4");
        if (s1.equalsIgnoreCase(s4))
        System.out.println("s1 equals (ignore case) s4");*/

        //Question 4
        /*System.out.println("123456789 :  "+verifyuserName("123456789"));
        System.out.println("2468 :  "+verifyuserName("2468"));
        System.out.println("12 34:  "+verifyuserName("12 34"));
        System.out.println("246810 :  "+verifyuserName("246810"));*/

        //Question 5
        System.out.println("Credit Card Number : 1234567812345678 is "+validateCreditCardNumber("1234567812345678"));
        System.out.println("Credit Card Number : 12345678 is "+validateCreditCardNumber("12345678"));
        System.out.println("Credit Card Number : 123456781234567i is "+validateCreditCardNumber("12345678123456QW"));

        //Question 8
        /*String s = "Java";
        StringBuffer buf = new StringBuffer(s);
        change(s, buf);
        System.out.println(s);
        System.out.println(buf);*/
    }
    /*public static boolean verifyuserName(String username){
        if(username.length()>=6&&username.indexOf(' ')==-1){
            return true;
        }
        else{
            return false;
        }
        if(username.length()<=6&&username.indexOf(' ')!=-1){
            return false;
        }
        else{
            return true;
        }
    }*/
    public static boolean validateCreditCardNumber(String creditCardNumber){
        if(creditCardNumber.length()==16){
            for(int number=0;number<creditCardNumber.length();number++){
                if(!Character.isDigit(creditCardNumber.charAt(number))){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    /*public static void change(String s, StringBuffer b){
        s = s + " and html";
        b.append(" and html");
    }*/
}

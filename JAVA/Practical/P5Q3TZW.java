
public class P5Q3TZW {
    public static void main(String[] args) {

        //String[] argss={"pETER","[RYAN]","Robbin","Mr"};
        String[] argss={"JOHN","[SMITH]","Mr"};
        //String[] argss={"[Chee]","ky","li","Ms"};
        String title=argss[argss.length-1];

        String fname=" ";
        for(int number=0;number<argss.length-1;number++){
            String name=argss[number].toLowerCase();
            if(name.charAt(0)=='['){
                name=name.replace(name.charAt(1),Character.toUpperCase(name.charAt(1)));
            }
            else{
                name=name.replace(name.charAt(0),Character.toUpperCase(name.charAt(0)));
            }
            fname+=" "+name;
        }
        String surname=fname.substring(fname.indexOf("[")+1,fname.indexOf("]"));

        fname=fname.replace('[', ' ');
        fname=fname.replace(']', ' ');

        System.out.println("To : "+fname);
        System.out.println("Wish you a Merry Christmas, "+title+" "+surname+".");
    }
}


public class P2Q1TZW {

    public static void main(String[] args) {
    	System.out.println("Number\t\tSqureRoot\n");
    	displaySqureRoot(20);
    }

	public static int displaySqureRoot(int number){
		for(int num=0;num<=number;num+=2){
			System.out.printf("%d\t\t\t\t\t%.4f\n",num,Math.sqrt(num));
		}
		return 0;
	}
}
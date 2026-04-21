
public class P3Q2TZW {

    public static void main(String[] args) {
    	int [ ] list1=new int [ ]{1,2,4,5,10,100,2,-22};
        int [ ] list2=new int [ ]{4,-120,6,8,10,-10,-20,100};
        int [ ] list3=new int [ ]{100,200,300,10,400,500,600,50};

    	System.out.println("The index of the smallest element is " +FindSmallestElement(list1)+"\n");
        System.out.println("The index of the smallest element is " +FindSmallestElement(list2)+"\n");
        System.out.println("The index of the smallest element is " +FindSmallestElement(list3)+"\n");
    	}

    public static int FindSmallestElement(int[ ] array){
    	int indexSmallestNumber=0;
        int smallest=array[indexSmallestNumber];

    	for(int num=0;num<array.length;num++){
    		if(array[num]<=smallest){
    			smallest=array[num];
                indexSmallestNumber=num;
    		}
    	}
        /*for(int num=0;num<array.length;num++){
            if(array[num]<array[indexSmallestNumber]){
                indexSmallestNumber=num;
            }
        }*/
        System.out.println("The Smallest Number is " +smallest);
        return indexSmallestNumber;


    }
}
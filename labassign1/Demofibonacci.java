package labassign1;

public class Demofibonacci {
     public static void main(String[] args){
    	 int n1=1,n2=1,i,c=20,n3=0;
    	 //System.out.println(c);
    	 double sum=0;
    	 System.out.print(n1+" "+n2);
    	 for(i=2;i<c;i++)
    	 {
    		 n3=n1+n2;
    		 System.out.print(" "+n3);
    		 n1=n2;
    		 n2=n3;
    		 sum=sum+n2;
    	 }
    	 sum=sum/c;
    	 System.out.println("\nAvg:"+sum);
     }
}

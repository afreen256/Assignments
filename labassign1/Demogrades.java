package labassign1;
import java.util.*;

public class Demogrades {
public static void main(String[] args)
  {
	float sum=0,avg;
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students");
	num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the grade of student"+(i+1));
		arr[i]=sc.nextInt();
		if(arr[i]>100)
		{
			System.out.println("Invalid grade,try again...");
		}
	       sum+=arr[i];
	}
	avg=sum/num;
	System.out.println("The average is:"+avg);
  }
}

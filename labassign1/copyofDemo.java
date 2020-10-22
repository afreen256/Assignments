package labassign1;

import java.util.Arrays;

public class copyofDemo {
public static void main(String[] args){
	int[] arr1=new int[] {36, 48, 60};
	System.out.println("Printing 1st array:");
	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]);
	}
	
	int[] arr2= Arrays.copyof(arr1, 5);
	arr2[3]=35;
	arr2[4]=89;
	System.out.println("Printing new array:");
	for(int i=0;i<arr2.length;i++){
		System.out.println(arr2[i]);
	}
}
}

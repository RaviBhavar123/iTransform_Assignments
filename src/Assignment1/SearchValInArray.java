package Assignment1;

import java.util.Scanner;

public class SearchValInArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENter a numb");
	int num=sc.nextInt();
	boolean found=false;
	
	int []arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println(num+" is present in array");
	}
	else {
		System.out.println(num+" is not present in array");
	}
}
}

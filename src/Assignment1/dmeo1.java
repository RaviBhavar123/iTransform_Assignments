package Assignment1;

import java.util.Scanner;

//six int from user first 3 int wl be ddmmyy and 
//second ddmmyy find a days diff from 2dates
//tc care of leap year
public class dmeo1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Date :");
	System.out.println("Day : ");
	int dd=sc.nextInt();
	System.out.println("Month :");
	int mm=sc.nextInt();
	System.out.println("Year :");
	int yy=sc.nextInt();
	System.out.println("Enter Second Date :");
	System.out.println("Day : ");
	int dd2=sc.nextInt();
	System.out.println("Month :");
	int mm2=sc.nextInt();
	System.out.println("Year :");
	int yy2=sc.nextInt();
	
	int yyDiff=0;
	int mmDiff=0;
	int ddDiff=0;
	if(yy>yy2) {
		yyDiff=yy-yy2;
	   
	}
}
}

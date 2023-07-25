package Assignment1;

import java.util.Scanner;

//find out the simple as well compound interest of suplied value
public class interestCal {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter principle value");
	double principleVal=sc.nextDouble();
	
	System.out.println("enter the interest rate");
	double ineterestrate=sc.nextDouble();
	
	System.out.println("tenature");
	double tenare=sc.nextDouble();
	
	double simpleInterest=(principleVal*ineterestrate*tenare);
	System.out.println("Simple Interest : "+ simpleInterest);
	
	double compoundInterest=principleVal*(Math.pow((1+ ineterestrate),tenare)-1);
	System.out.println("Compound Interest : "+ compoundInterest);
	
}
}

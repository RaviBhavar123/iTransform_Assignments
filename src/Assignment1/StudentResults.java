package Assignment1;

import java.util.Scanner;

public class StudentResults {
public static void main(String[] args) {
	//all sub marks should be <60 then stud wl pass
	//any two sub marks is<60 stud is promoted
	//any two sub>60 stud wl fail
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Sub 1 marks");
	double submarks1=sc.nextDouble();
	
	System.out.println("Enter Sub 2 marks ");
	double submarks2=sc.nextDouble();
	
	System.out.println("Enter Sub 3 marks");
	double submarks3=sc.nextDouble();
	double subpass=0;
	if(submarks1>=60) {
		subpass++;
		
	}
	if(submarks2>=60) {
		subpass++;
		
	}
	if(submarks3>=60) {
		subpass++;
		
	}
	if(subpass==3) {
		System.out.println("Student is passed");
	}
	else if (subpass==2) {
		System.out.println("student is promoted");
		
	}
	else {
		System.out.println("student failed");
		
	}
}
}

package Assignment1;

import java.util.Scanner;

public class LoginInfo {
public static void main(String[] args) {
	String usernme="ravipatil";
	String password ="ravi@123";
	
	int attempt=0;
	
	while(attempt<3
			) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a user name");
		String uname=sc.nextLine();
		
		System.out.println("Enter a pass");
		String pass=sc.nextLine();
		
		if(uname.equals(usernme)&&pass.equals(password)) {
		System.out.println("Welcome "+usernme);
		break;
		}
		
		
		else {
			attempt++;
			if (attempt < 3) {
				System.out.println("Invalid Credentials....!");
				
		}
			
			else {
				System.out.println("Contact admin");
				
			}
			}
		
	}
}}



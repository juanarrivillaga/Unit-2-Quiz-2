// Program Author: Juan Arrivillaga

import java.util.Scanner;

public class UserAuthentication {
	private static final String USERNAME = "Juan";
	private static final String PASSWORD = "default";

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String query1 = input.next();
		
		System.out.println("enter password");
		String query2 = input.next();
		
		
		if(authentication(query1,query2)){
		System.out.println("Hello "+ USERNAME);
		} else System.out.println("Wrong username and/or password...");

	}
	
	public static boolean authentication(String q1, String q2){
	
		if(q2.equals(PASSWORD)&& q1.equals(USERNAME))
			return true;
		else return false;
	}

}

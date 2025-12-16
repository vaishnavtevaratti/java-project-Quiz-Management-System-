
package Com.Sunbeam.Quiz.MainMenu;

import java.util.Scanner;

public class MainMenu {

	 private static int mainMenu(Scanner sc) {
		 System.out.println("**************MainMenu**************");
			System.out.println("0. EXIT");
			System.out.println("1. Signin");
			System.out.println("2. Signup");
			System.out.println("3. Admin");
			System.out.print("Enter your choice - ");
			return sc.nextInt();
	 }
	 
	 public static int mainMenuQ(Scanner sc) {
		 int choice =mainMenu(sc)  ;
		do{
			switch(choice) { 
			
			case 1: 
				System.out.println("SignIn option has been selected");
				SignIn.SignIn(sc);
			break;
			
			case 2: 
				System.out.println("Signup option has been selected");
			break;
			case 3: 
				System.out.println("Admin option has been selected");
				Admin.admin(sc);
			break;	
			default : 
				System.out.println("wrong Choice !");
			break;
			
			}	 
			 
		 } while((choice = mainMenu(sc))!=0);
		return 0; 
	 }
	 
	 
//	 public static void mainMenuQ(Scanner sc) {
//		 int choice;
//		 while(choice =mainMenu(Scanner sc) ) {
//			 
//			 
//			 
//		 }
		 
		 
		 
		 
	 }
	 
	 
	 


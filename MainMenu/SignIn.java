package Com.Sunbeam.Quiz.MainMenu;

import java.util.Scanner;

public class SignIn {

	private static int SignInOptions(Scanner sc) {
		
		System.out.println("**************SignInMenu**************");
		System.out.println("0. Signout");
		System.out.println("1. Attempt Quiz");
		System.out.println("2. Display Marks");
		System.out.println("3. Display Profile");
		System.out.println("4. Update Mobile");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
			}
	
	public static void SignIn(Scanner sc) {
		int choice=SignInOptions(sc);
		do {
			switch(choice) {
			
			case 1:
				System.out.println("Attempt Quiz Case Selected");
				break;
			case 2:
				System.out.println("Display Marks Case Selected");
				break;
			case 3:
				System.out.println("Display Profile Case Selected");
				break;
			case 4:
				System.out.println("Update Mobile Case Selected");
				break;
			default:
				System.out.println("Wrong Choice...");
				break;
			
			
			}
				
			
		}while((choice =SignInOptions(sc))!=0);
		
	
	
	
	}
	
}
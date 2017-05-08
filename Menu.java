//package application;


public class Menu{

	public static void startMsg() {		
		System.out.println("-----------------------------------");
		System.out.println("\t" + "WELCOME");
		System.out.println("\tMovie Application");
		System.out.println("-----------------------------------");
	}

	
	public static void enterUsername() { 
		System.out.println(" ");
		System.out.println("Please enter your username: ");
		}
	
	public static void enterPassword() { 
		System.out.println("Please enter your password: ");
		}
	
	public static void pwWrong() {
		System.out.println("Your password is wrong - Try again: ");
	}
	
	public static void mainMenu() {
		System.out.println("Main menu: "); 
		System.out.println("1) Movie options:");
		System.out.println("2) Favourites: "); 
		System.out.println("3) History: "); 
		System.out.println("4) Statistics: ");
		System.out.println("5) Quit");
		
    }

	public static void movieOptions(){
		System.out.println("Movies----------------------------------------------");
		System.out.println("to watch a movie type: W");
		System.out.println("to create movie type: C");
		System.out.println("to search for movie type: S");
		System.out.println("to delete a movie type: D");
		System.out.println("to go back type: B");


	}

}
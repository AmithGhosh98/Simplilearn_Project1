import java.util.Scanner;

public class Menu {
		 public static void main(String[] args) {
		 	System.out.println("Welcome to Locked.in");
		 	System.out.println("------------------------------------------");
		 	System.out.println("      MENU      ");
		 	System.out.println("------------------------------------------");
		 	System.out.println("1.Register.com");
		 	System.out.println("2.Login.com");
		 	
		 	Scanner scan=new Scanner(System.in);
		 	String s=scan.next();
		 	char  choice =s.charAt(0);
		 	switch(choice) {
		 	case '1':
		 		Registration.main(null);
		 		break;
		 	case '2':
		 		Login.main(null);
		 		break;
		 	default :
		 		System.out.println("Enter Correct Options");
		 	}
		 }
		 }




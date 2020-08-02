import java.util.Scanner;

public class Login implements Registration {
		public static void main(String[] args) {
			String user_name=userPass.name;
			
			String password =userPass.password;
			   System.out.println("\n");
			   System.out.println("-------------------------------------");
			   System.out.println("*************Login Page***************");
			   System.out.println("-------------------------------------");
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter User name");
				 String input=scan.nextLine();
				 if(input.equals(user_name)) {
					 System.out.println("username :"+input);
					 
				 }
				 else {
					 System.out.println("Invalid");
				 }
				 System.out.println("Enter Password\n");
				 String pwd=scan.nextLine();
				 if(pwd.equals(password)) {
					
					 System.out.println("login successfull!!");
					 HomePage.main(null);
				 }
				 else {
					 System.out.println("Invalid Password...Please Try Again..");
				 }
				 
		
		}
	}
		
		





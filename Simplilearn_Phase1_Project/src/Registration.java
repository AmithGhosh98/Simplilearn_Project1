import java.util.Scanner;

class userPass{
	public static String name;
	public static String password;
}


public interface Registration {
	public static final int PASSWORD_LENGTH = 8;
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		
		System.out.println("-----------------------------");
		
		System.out.println("********Register page********");
		System.out.println("-----------------------------");
		System.out.println("Enter Your Name");
		userPass.name=x.nextLine();
		System.out.println("Enter Password");
		System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.)\n");
		userPass.password = x.nextLine();
		if (is_Valid_Password(userPass.password)) {
            System.out.println("valid password " );
            System.out.println("Registration successful");
            Login.main(null);
        } else {
            System.out.println("Given password is wrong " );
        }
		
		
	}
	public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}




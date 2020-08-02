import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class HomePage {
		
	public static void main(String[] args) {
		System.out.println("Select an option Below");
		System.out.println("1.View the Current Files");
		System.out.println("2.ADD/DELETE/SEARCH Files");
		System.out.println("3.Close the Application");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char option=s.charAt(0);
		switch(option) {
		case '1':
			System.out.println("Viewing The Current Files In The Directory\n");
			File dir = new File("C:\\\\\\\\demo-folder\\\\\\\\Phase1.Project");

		      File[] files = dir.listFiles();

		      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

		      for (File file : files) {
		         if (!file.isHidden()) {
		            if (file.isDirectory()) {
		               System.out.println("DIR \t" + file.getName());
		            } else {
		               System.out.println("FILE\t" + file.getName());
		            }
		         }
		      }HomePage.main(null);
			break;
		case '2':
			System.out.println("1.Add files to the Current Directory\n");
			System.out.println("2.Delete files in the Current Directory\n");
			System.out.println("3.Search files In the Current Direcctory\n");
			Home_page2.main(null);
			break;
		case '3':
			System.out.println("closing the Application.......");
			System.exit(0);
			
			
			
		}

	}
	}



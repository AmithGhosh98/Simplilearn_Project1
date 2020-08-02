
	import java.io.File;
	import java.io.IOException;
	import java.io.Serializable;
	import java.util.Scanner;

	public class Home_page2 {
	public static void main(String[] args) {
		
		Scanner scan1=new Scanner(System.in);
		String s1=scan1.next();
		char choice1=s1.charAt(0);
		switch(choice1) {
		case'1':
			try {
		         File file = new File("C:\\demo-folder\\Phase1.Project\\first.txt");
		         
		         if(file.createNewFile())System.out.println("Success!");
		         else System.out.println ("Error, file already exists.");
		      }
		      catch(IOException ioe) {
		         ioe.printStackTrace();
		      }
			HomePage.main(null);
			break;


			
		case '2':	
			
			
			 try { 
		         File file = new File("C:\\\\demo-folder\\\\Phase1.Project");
		         if(file.delete()) { 
		            System.out.println(file.getName() + " is deleted!");
		         } else {
		            System.out.println("Delete operation is failed.");
		    		}
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
			 HomePage.main(null);
	        break;
			
		case '3':
			Serializable file = new File("C:\\\\demo-folder\\\\Phase1.Project");
			File[] filelist=((File) file).listFiles();
			System.out.println("enter the file Name that u want to delete.");
			Scanner scan=new Scanner(System.in);
			String filename=scan.next();
			
	        
	    for (int i = 0; i < filelist.length; i++) 
	    {
	        if(filelist[i].getName().equals(filename))
	        {
	            System.out.println("File is present at : "+filelist[i].getAbsolutePath());
	            file=filelist[i].getAbsolutePath();
	             }
	        else {
	        	System.out.println("File Not Found..");
	        	HomePage.main(null);
	        	break;
	        }
	       
	    }
	   break;
			
			
			
			
		case '4':
			Menu.main(null);
			break;
		default :
			System.out.println("Select the correct option");
		}
		
		 
	}
	}



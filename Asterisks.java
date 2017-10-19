import java.util.Scanner;
public class Asterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in); 
		 System.out.print("Side length: "); 
		 int side = in.nextInt(); 
		 int width = side * 2 - 1; 
		 int halfW = width / 2; 
		 int number = 1; 
		 for (int i =0;i< side;i++) { 
		     for (int j=0;j<halfW;j++) { 
		  System.out.print(" "); 
		     } 
		     for (int j = 0; j < number; j++) { 
		  System.out.print("*"); 
		     } 
		     System.out.println(); 
		     number += 2; 
		     halfW -= 1; 
		 }
		 number =width - 2; 
		 halfW = 1; 
		 for (int i = 0; i <side; i++) { 
		     for (int j = 0; j < halfW; j++) { 
		  System.out.print(" "); 
		     } 
		     for (int j = 0; j < number; j++) { 
		  System.out.print("*"); 
		     } 
		     System.out.println(); 
		     number -= 2; 
		     halfW += 1; 
	}

	}
}

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exedemo {
		static int x ,y, sum, product, quotient;
		
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter two values");
			
			try {
				x = scan.nextInt();
				y = scan.nextInt();
				
				sum=x+y;
				System.out.println("Sum="+sum);
				
				product= x*y;
				System.out.println("Product=" +product);
				
				quotient = x/y;
				System.out.println("Quotient=" +quotient);

			}
			catch (ArithmeticException ae){
				System.out.println("\n Second number should not be zero");
				
			}
			catch (InputMismatchException ie) {
				System.out.println("\n The inputs should be numerical values ");
			}
			
			
			scan.close();
			
		
		
	}

}

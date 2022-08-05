package BasicJava;

import java.util.Scanner;

public class Scanner_class_1 {
 
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the school name ");
		String NameOfschool = sc.next();
		
		System.out.println("enter Mark of Math");
		int mathmark = sc.nextInt();
		
		System.out.println(" Enter Mark of History");
		int historymark = sc.nextInt();
		
		
		
		System.out.println("Addition of mark of math and history"+(mathmark+historymark));
		
	}

	
	 
	  
	

}

package BasicJava;

public class OperatorsInjava {

	public static void main(String[] args) {
		
		int a = 10;
		int b =  3;
		System.out.println("Addition of two Number :-"+(a+b));
		System.out.println("divison and reminder is :-"+(a%b));
		System.out.println("Divison operation :- "+(a/b));
		System.out.println("Multiplication of two numbwer :-"+(a*b));
		   
		
		System.out.println("Comapre a and b  "+(a>b));
		System.out.println("comapre a and b "+(a<b));
		
		
		System.out.println("comapre a and b "+(a == b));
		System.out.println("Not equal operation "+(a!=b));
		
		
		System.out.println((a>b) && (b>a)); // both true the output true 
		System.out.println((a>b) || (b>a)); // any one from both of them then output tree
		System.out.println((a<b) || (a<b)); // both false output false
		
		
				
		
		if((a<b) && (a>b))
		{
			System.out.println("Kunal");
		}
		else
		{
			System.out.println("Kuldeep");
		}
		
		if(!(a<b))
		{
			System.out.println("Raj");
		}
		
		System.out.println((a & b));
			
		
	}

}

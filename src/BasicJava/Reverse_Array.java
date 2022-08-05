package BasicJava;

public class Reverse_Array {

	public static void main(String[] args) {


		String name [] = new String[3];
		name [0] = "Jaydeep";
		name [1] = "Pramod";
		name [2] = "patel";
		
		for(int i =0 ;i<name.length;i++)
		{
			System.out.println(name[i]);
			
		}
		
		System.out.println("***********************");
		
		for(int i=name.length;i<4;i--)
		{
			
			System.out.println(name[i]);
		
		}
		
		
		
	}

}

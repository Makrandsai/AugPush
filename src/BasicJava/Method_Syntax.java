package BasicJava;

public class Method_Syntax {


	int a = 10,b=40;
	
	void show()
	{
		System.out.println(a+b);
	}
	void add(int a,String name)
	{
		System.out.println(this.a);
	    System.out.println("Name of student "+name);
	}
	
	Method_Syntax(int s)
	
	{
		System.out.println(s);
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args)
	{
	
		Method_Syntax m = new Method_Syntax(78);
		
	}
}

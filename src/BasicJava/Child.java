package BasicJava;

public class Child extends Parent{

	
	public void ChildProperty()
	{
		System.out.println("Bike");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.fatherproperty();  // parent  // home
		c.ChildProperty();   // own property // bike
		
	}
}

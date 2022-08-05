package BasicJava;

public class Constructor1 {


       void show(int a ,int b)
	   {
		System.out.println(a+b);
		
	   }
       Constructor1(int c,int d)
       {
    	   
    	   System.out.println("Value of a and b addition := "+(c+d));
    	   
       }
       
       Constructor1(int e)
       {
    	   
    	   System.out.println("Value of e :="+e);
    	   
       }
	
	  public static void main(String[] args) {

		Constructor1 c1 = new Constructor1(45,56);
		Constructor1 c2 = new Constructor1(6);
		
		c1.show(10,5);
		
	
		
	}

}

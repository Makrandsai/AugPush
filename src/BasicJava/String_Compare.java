package BasicJava;

public class String_Compare {

	public static void main(String[] args) {


		String name1 = "Jalgaon";
		String name2 = "jalgaon";
		
		name1 = name1.concat(name2);
		System.out.println(name1);
		
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1 == name2);
		
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.endsWith("on"));
		System.out.println(name1.isBlank());
		System.out.println(name1.length());
		System.out.println(name1.replace("Jalgaon", "Pune"));
		System.out.println(name1.indexOf('l'));
	    
		
		String s = new String("Makrand");
		
		StringBuffer s1 = new StringBuffer("Vasant");
		
		System.out.println(s1.append(s));
		 
		System.out.println(s.concat("Temkar"));
        

	}

}

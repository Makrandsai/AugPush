package BasicJava;

import java.util.Collections;
import java.util.TreeSet;

public class Reversethearray {
	
  

	public static void main(String[] args) {


		
	 int a [] = {1,50,60,70,80,90};
	 
	 for(int i =0;i<a.length;i++)
	 {
		 System.out.print(" "+ a[i]);
		 
	 }
      System.out.println("*********************");
	 for(int i =a.length-1 ;i>=0;i--)
	 {
		 System.out.print(" "+a[i]);
	 }
	
	}

}

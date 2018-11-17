package test.testcases;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
	
		HashSet<String> SetA = new HashSet<String>();
		SetA.add("Kumar");
		SetA.add("john");
		SetA.add("Sujay");   // in the out put it will not allow duplicate values..
		SetA.add("Sujay");
		
// access via Iterator
		Iterator ite = SetA.iterator();
   while(ite.hasNext())
		   {  
	          System.out.println(ite.next());
		   }
	
	
	}

}

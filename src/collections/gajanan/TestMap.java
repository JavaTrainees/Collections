package collections.gajanan;

import java.util.*;

public class TestMap 
{
	
	
	public static void main(String args[])
	{  
	
	//Creating and populate Hashmap
		  HashMap<Integer,String> hashm=new HashMap<Integer,String>();  
		  hashm.put(400,"Gaju");  
		  hashm.put(401,"Raju");  
		  hashm.put(402,"Ritesh"); 
		  System.out.println("Adding elements in Hashmap before removing:");  
	//fetching data from hashmap before removing 	 
		  for(Map.Entry m:hashm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
	//Remove element from Hashmap
		  hashm.remove(401);
		  
	//fetching data from hashmap after removing 
		  System.out.println("\n");
		  System.out.println("Adding elements in Hashmap after removing:");
		  for(Map.Entry m:hashm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
		  
	//Creating and populate Treemap
		 
		   Map<Integer, String> Tmap = new TreeMap<Integer, String>();           
		   Tmap.put(102,"Java");  
		   Tmap.put(103, "C");  
		   Tmap.put(101, "C++");  
		   System.out.println("\n");
		   System.out.println("Values before remove in treemap: "); 
		   
		   for(Map.Entry m:Tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
    // Remove value for key 102  
		   Tmap.remove(102);  
		    
	//fetching data from Treemap after removing 
		   System.out.println("\n");
		   System.out.println("Values after remove in treemap: ");
		   for(Map.Entry m:Tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
	
	}        
}

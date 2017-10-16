package com.list;
import java.util.*;

class Test
{
	int Number;
	String name;
	public Test(int number, String name) {
		Number = number;
		this.name = name;
	}
	
}


class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}


public class Testarraylist {

	public static void main(String[] args) 
	{
		
	  //Creating ArrayList and adding element into arraylist
				ArrayList<String> list=new ArrayList<String>();  
				  list.add("Gaju");
				  list.add("ritesh");  
				  list.add("dinesh");  
				  list.add("Gaju");  
				 Iterator<String> itr=list.iterator();  
				 //Using while loop
				 System.out.println("Adding elements in arraylist:");
				  while(itr.hasNext())
				  {  
				   System.out.println(itr.next()); 
				
				  }
				  //Using for each loop
				  
				 /* for(String str: list)
				  {
					  System.out.println(str); 
				  }
				  */
				  
	 //Remove element from arraylist
				    list.remove(3);
				  System.out.println("\n");
				  System.out.println("Element after removing:");
				  
	//fetching data from Arraylist
				  Iterator<String> itr1=list.iterator();
				  while(itr1.hasNext())
				  {  
				   System.out.println(itr1.next()); 
				
				  }
				  System.out.println("\n");
	//Creating and adding user defined class objects into ArrayList
		
		Employee e1=new Employee(1,"Ramesh");
		Employee e2=new Employee(2,"Ganesh");
		
		ArrayList<Employee> Elist=new ArrayList<Employee>();
		Elist.add(e1);
		Elist.add(e2);
		 System.out.println("Adding user defined object in arraylist:"); 
		
		for(Employee str: Elist)
		  {
			  System.out.println(str.id+" "+str.name); 
		  }
		 System.out.println("\n");
			
		  
	 //Creating and adding user defined class objects into linkedlist
		  	System.out.println("Adding elements in Linkedlist:"); 
		  	//Creating list of tests 
		    List<Test> Tlist=new LinkedList<Test>();  
		    //Creating test objects  
		    Test t1=new Test(401,"Math");  
		    Test t2=new Test(402,"Physics");  
		    Test t3=new Test(403,"chemistry");  
		    Test t4=new Test(402,"Biology");  
		    Test t5=new Test(403,"English"); 
		    Tlist.add(t1);  
		    Tlist.add(t2);  
		    t3=t2;
		    Tlist.add(t3);
		    List<Test> Tlist1=new LinkedList<Test>();  
		    Tlist1.add(t4);
		    Tlist1.add(t5);
		    Tlist.addAll(Tlist1);
		//Remove element from arraylist
		    
		    Tlist.removeAll(Tlist1);
		    
		//fetching data from Arraylist	    
		    for(Test b:Tlist){  
		    System.out.println(b.Number+" "+b.name);  
		    }  
		  
		  
	}

}

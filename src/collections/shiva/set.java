package com.example.demo;
import java.util.*;
public class set
{
		public static void main(String args[])
	{
			Set<String> hs= new HashSet<String>();
		hs.add("trump");
		hs.add("obama");
		hs.add("modi");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		hs.remove("trump");
		hs.remove("obama");
		System.out.println("---after removing the elements---");
		Iterator itr1 = hs.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		Set<String> hl= new LinkedHashSet<String>();
			hl.add("modi");
		hl.add("cbn");
		System.out.println("--elemets of LinkedHashSet---");
		//hs.retainAll(hl);
		//System.out.println("---after retaining---");
		Iterator itr2 = hl.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		Set<Integer> ts= new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		System.out.println("elements of treeset");
		Iterator itr3 = ts.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
		
	}
}
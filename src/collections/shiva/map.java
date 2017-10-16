package com.example.demo;
import java.util.*;
class map{
	public static void main(String args[])
	{
		Map<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1,"cbn");
		hm.put(2,"jagan");
		hm.put(3,"kcr");
		for(Map.Entry m:hm.entrySet())
		{
		 System.out.println(m.getKey()+" "+m.getValue());
		}
		//System.out.println(hm);
		hm.remove(2);
		hm.remove(3);
		System.out.println("after removing elements");
		//System.out.println("after removing"+hm);
		for(Map.Entry m:hm.entrySet())
		{
		 System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Map<Integer,String> h= new LinkedHashMap<Integer,String>();
		h.put(4,"suzuki");
	    h.put(5,"hyundai");
	System.out.println("--elemets of LinkedHashMap---");
	for(Map.Entry m:h.entrySet())
	{
		 System.out.println(m.getKey()+" "+m.getValue());
	}

	Map<Integer,String> tm= new TreeMap<Integer,String>();
	tm.put(6,"royal");
	tm.put(7,"enfield");
	System.out.println("---elements of TreeMap---");
	for(Map.Entry m:tm.entrySet())
	{
		 System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
package com.example.demo;

import java.util.*;

public class collection {
	
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("shiva");
		al.add("kellton");
		al.add("vinay");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove("vinay");
		System.out.println("---after removing---");
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
				LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		System.out.println("---elements of LinkedList---"	);
		Iterator itr2 = ll.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
		ll.remove(2);
		System.out.println("---after removing an element---");
		Iterator itr3 = ll.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
	
		}
	}
}

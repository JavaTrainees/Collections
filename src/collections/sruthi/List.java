package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		System.out.println("........ARRAY LIST........");

		ArrayList<String> s = new ArrayList<String>();// ArrayList

		// adding elements
		s.add("sruthi");
		s.add("abc");
		s.add("abc");

		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		ArrayList<String> s1 = new ArrayList<String>();// ArrayList

		// adding all elements
		s1.add("def");
		s1.add("mno");
		s1.add("pqr");
		s.addAll(s1);

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());

		}
		ArrayList<String> s2 = new ArrayList<String>();// ArrayList
		// remove elements
		s2.add("def");
		s2.add("mno");
		s1.removeAll(s2);
		System.out.println("Elements after removing");
		Iterator<String> i2 = s1.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());

		}
		ArrayList<String> s3 = new ArrayList<String>();// ArrayList
		// retain method
		s3.add("def");
		s3.add("mno");
		s2.retainAll(s3);
		System.out.println("Elements after retaining");
		Iterator<String> i3 = s2.iterator();
		while (i3.hasNext()) {
			System.out.println(i3.next());

		}
		System.out.println("........LINKED LIST........");
		LinkedList<String> l = new LinkedList<String>();// LinkedList

		// adding elements
		l.add("sruthi");
		l.add("abc");
		l.add("abc");

		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		LinkedList<String> l1 = new LinkedList<String>();// LinkedList

		// adding all elements
		l1.add("def");
		l1.add("mno");
		l1.add("pqr");
		l.addAll(l1);

		Iterator<String> it1 = l1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}
		LinkedList<String> l2 = new LinkedList<String>();// LinkedList
		// remove method
		l2.add("def");
		l2.add("mno");
		l1.removeAll(s2);
		System.out.println("Elements after removing");
		Iterator<String> it2 = l1.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());

		}
		LinkedList<String> l3 = new LinkedList<String>();// LinkedList
		// retain method
		l3.add("def");
		l3.add("mno");
		l2.retainAll(l3);
		System.out.println("Elements after retaining");
		Iterator<String> it3 = s2.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());

		}

	}
}

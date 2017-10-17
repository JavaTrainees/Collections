package set;

import java.util.*;

public class Set {

	public static void main(String[] args) {
		System.out.println("........HASH SET........");

		HashSet<String> s = new HashSet<String>();// HashSet

		// adding elements
		s.add("sruthi");
		s.add("abc");
		s.add("abc");

		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		HashSet<String> s1 = new HashSet<String>();// HashSet

		// adding all elements
		s1.add("def");
		s1.add("mno");
		s1.add("pqr");
		s.addAll(s1);

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());

		}
		HashSet<String> s2 = new HashSet<String>();// HashSet
		// remove method
		s2.add("def");
		s2.add("mno");
		s1.removeAll(s2);
		System.out.println("Elements after removing");
		Iterator<String> i2 = s1.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());

		}
		HashSet<String> s3 = new HashSet<String>();// HashSet
		// retain method
		s3.add("def");
		s3.add("mno");
		s2.retainAll(s3);
		System.out.println("Elements after retaining");
		Iterator<String> i3 = s2.iterator();
		while (i3.hasNext()) {
			System.out.println(i3.next());

		}
		System.out.println("........LINKED HASH SET........");
		LinkedHashSet<String> l = new LinkedHashSet<String>();// LinkedHashSet

		// adding elements
		l.add("sruthi");
		l.add("abc");
		l.add("abc");

		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();// LinkedHashSet

		// adding all elements
		l1.add("def");
		l1.add("mno");
		l1.add("pqr");
		l.addAll(l1);

		Iterator<String> it1 = l1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}
		LinkedHashSet<String> l2 = new LinkedHashSet<String>();// LinkedHashSet
		// remove method
		l2.add("def");
		l2.add("mno");
		l1.removeAll(s2);
		System.out.println("Elements after removing");
		Iterator<String> it2 = l1.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());

		}
		LinkedHashSet<String> l3 = new LinkedHashSet<String>();// LinkedHashSet
		// retain method
		l3.add("def");
		l3.add("mno");
		l2.retainAll(l3);
		System.out.println("Elements after retaining");
		Iterator<String> it3 = s2.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());

		}
		System.out.println("........TREE SET........");

		TreeSet<String> t = new TreeSet<String>();// TreeSet

		// adding elements
		t.add("sruthi");
		t.add("abc");
		t.add("abc");

		Iterator<String> it4 = t.iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());

		}
		TreeSet<String> t1 = new TreeSet<String>();// TreeSet

		// adding all elements
		t1.add("def");
		t1.add("mno");
		t1.add("pqr");
		t.addAll(s1);

		Iterator<String> it5 = t1.iterator();
		while (it5.hasNext()) {
			System.out.println(it5.next());

		}
		TreeSet<String> t2 = new TreeSet<String>();// TreeSet
		// remove method
		t2.add("def");
		t2.add("mno");
		t1.removeAll(t2);
		System.out.println("Elements after removing");
		Iterator<String> it6 = s1.iterator();
		while (it6.hasNext()) {
			System.out.println(it6.next());

		}
		TreeSet<String> t3 = new TreeSet<String>();// TreeSet
		// retain method
		t3.add("def");
		t3.add("mno");
		t2.retainAll(t3);
		System.out.println("Elements after retaining");
		Iterator<String> it7 = t2.iterator();
		while (it7.hasNext()) {
			System.out.println(it7.next());

		}

	}

}

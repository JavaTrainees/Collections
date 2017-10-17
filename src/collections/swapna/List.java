package collections.swapna;

import java.util.*;

public class List {

	static long startTime = System.currentTimeMillis();

	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		// al.remove(40);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		// al.addAll(al1);
		// al.removeAll(al1);
		// al.retainAll(al1);
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("swapna");
		ll.add("keerthi");
		ll.add("supraja");
		ll.add("swapna");

		int soll = al.size();
		System.out.println("size of arraylist list is :" + soll);

		Iterator itr2 = ll.iterator();
		for (String str : ll) {
			System.out.println(str);
		}

		ll.remove(0);
		System.out.println("After removing one element in linkedlist");
		Iterator itr3 = ll.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		boolean value = al.contains(30);
		System.out.println("The given value is :" + value);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}
}

// It allows duplicate values
// maintains insertion order.
// is non synchronized

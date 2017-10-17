package collections.gajanan;

import java.util.*;

public class Testhashset {

	public static void main(String[] args) {
		// Creating and adding element into Hashset

		HashSet<String> set = new HashSet<String>();
		set.add("Gaju");
		set.add("ritesh");
		set.add("dinesh");
		set.add("Gaju");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("minesh");
		set2.add("Raju");

		set.addAll(set2);

		// removing elements from a Hashset

		set.removeAll(set2);

		Iterator<String> itr = set.iterator();

		System.out.println("Adding elements in Hashset:");

		// fetching data from Hashset

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("\n");

		// Creating and adding user defined class objects into Hashset

		Employee e1 = new Employee(1, "Ramesh");
		Employee e2 = new Employee(2, "Ganesh");
		Employee e3 = new Employee(3, "Himesh");
		Employee e4 = new Employee(2, "manesh");
		Employee e5 = new Employee(3, "gimesh");
		HashSet<Employee> set1 = new HashSet<Employee>();
		set1.add(e1);
		set1.add(e2);
		// set1.add(e3);
		e3 = e2;

		HashSet<Employee> set3 = new HashSet<Employee>();
		set3.add(e4);
		set3.add(e5);
		set1.addAll(set3);
		// removing elements from a Hashset

		set1.removeAll(set3);
		System.out.println("Adding user defined object in Hashset:");

		// fetching data from Hashset

		for (Employee str : set1) {
			System.out.println(str.id + " " + str.name);
		}

		// Creating and adding elements into Treeset
		TreeSet<String> al = new TreeSet<String>();
		al.add("Gaju");
		al.add("Dinesh");
		al.add("Ritesh");
		al.add("Gaju");
		TreeSet<String> al1 = new TreeSet<String>();
		al1.add("Raju");
		al1.add("tinesh");

		al.addAll(al1);

		// removing elements from a Treeset

		al.removeAll(al1);
		System.out.println("\n");
		// fetching data from Treeset
		System.out.println("Adding user defined object in Treeset:");
		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}

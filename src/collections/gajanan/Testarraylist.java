package collections.gajanan;

import java.util.*;

public class Testarraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Gaju");
		list.add("ritesh");
		list.add("dinesh");
		list.add("Gaju");

		Iterator<String> itr = list.iterator();
		System.out.println("Adding elements in arraylist:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.remove(3);
		System.out.println("\n");
		System.out.println("Element after removing:");

		Iterator<String> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("\n");
		Employee e1 = new Employee(1, "Ramesh");
		Employee e2 = new Employee(2, "Ganesh");

		ArrayList<Employee> Elist = new ArrayList<Employee>();
		Elist.add(e1);
		Elist.add(e2);
		System.out.println("Adding user defined object in arraylist:");

		for (Employee str : Elist) {
			System.out.println(str.id + " " + str.name);
		}
		System.out.println("\n");
		System.out.println("Adding elements in Linkedlist:");

		List<Test> Tlist = new LinkedList<Test>();
		Test t1 = new Test(401, "Math");
		Test t2 = new Test(402, "Physics");
		Test t3 = new Test(403, "chemistry");
		Test t4 = new Test(402, "Biology");
		Test t5 = new Test(403, "English");
		Tlist.add(t1);
		Tlist.add(t2);
		t3 = t2;
		Tlist.add(t3);

		List<Test> Tlist1 = new LinkedList<Test>();
		Tlist1.add(t4);
		Tlist1.add(t5);
		Tlist.addAll(Tlist1);
		Tlist.removeAll(Tlist1);
		for (Test b : Tlist) {
			System.out.println(b.Number + " " + b.name);
		}
	}

}

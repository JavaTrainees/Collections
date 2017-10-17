package map;

import java.util.*;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		System.out.println(".....HashMap......");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();// Hash Map
		hm.put(1, "sruthi");
		hm.put(2, "swapna");
		hm.put(3, "gajanan");
		hm.put(4, "mani");
		hm.put(5, "shiva");

		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());

		}
		hm.remove(3);
		System.out.println("Elements after removing in HashMap");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());

		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "abc");
		tm.put(2, "def");
		tm.put(3, "ghi");
		tm.put(4, "jkl");

		for (Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());

		}
		hm.remove(3);
		System.out.println("Elements after removing in Tree Map");
		for (Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());

		}
	}
}
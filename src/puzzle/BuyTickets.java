package puzzle;

class BuyTickets {

	public static void main(String args[]) {

		int index = 3, time = 0, a[] = new int[] { 5, 5, 2, 3 }, n;
		n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] <= a[index])
				time += a[i];
			else
				time += a[index];
		}
		int valid = 0;
		if (index < n - 1)
			for (int i = index + 1; i < n; i++) {
				if (a[i] > a[index])
					valid++;
			}
		time -= valid;
		System.out.println(time);
	}

}
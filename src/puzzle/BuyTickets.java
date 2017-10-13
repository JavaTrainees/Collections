package puzzle;

class BuyTickets {

	public static void main(String args[]) {

		int index = 2, time = 0, a[] = new int[] { 2,6,3,4,5 }, n;
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
package puzzle;

public class BuyTickets {

	public static void main(String args[]) {

		int index = 0, output = 0, time = 0, a[] = new int[] { 1,1,1,1 };

		while (a[index] != 0) {
			if (a[0] > 0) {
				a[0] = a[0] - 1;
				time++;
			}
			output = updateArray(a);
		}
		System.out.println(output);
	}

	static int updateArray(int a[]) {
		int n, index = 0, temp = a[0];
		n = a.length;
		for (int i = 0; i < n - 1; i++)
			a[i] = a[i + 1];
		a[n - 1] = temp;
		return index = (index + n - 1) % n;
	}

}

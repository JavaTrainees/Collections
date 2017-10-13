package puzzle;
class BuyTickets {

	public static void main(String args[]) {

		int index = 3,  time = 0, a[] = new int[] { 4,2,5,3 };

		while (a[index] != 0){
			if (a[0] > 0) {
				a[0] = a[0] - 1;
				time++;
			}
			//if(a[0] != 0)
			//updateArray(a);
			int n, temp = a[0];
			n = a.length;
			for (int i = 0; i < n - 1; i++)
				a[i] = a[i + 1];
			a[n - 1] = temp;
			index = (index + n - 1) % n;
		}
		System.out.println(time);
	}

	

}

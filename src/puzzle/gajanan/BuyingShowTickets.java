package puzzle.gajanan;

import java.io.IOException;
import java.util.Scanner;

public class BuyingShowTickets {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size:");
		int n = sc.nextInt();
		int tickets[] = new int[n];
		System.out.println(tickets.length + " Input array elements:");
		for (int i = 0; i < n; i++) {
			tickets[i] = sc.nextInt();
		}
		System.out.println("Position in array:");
		int p = sc.nextInt();
		int r = waitingTime(tickets, p);
		System.out.println("Output: " + r);

	}

	static int waitingTime(int[] tickets, int p) {

		int outputTime = 0;

		return outputTime;
	}

}

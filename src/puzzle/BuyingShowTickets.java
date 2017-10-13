package puzzle;

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
		int index = sc.nextInt();
		int r = waitingTime(tickets, index);
		System.out.println("Output: " + r);

	}

	static int waitingTime(int[] a, int index) {

		int outputTime = 0, time = 0;

		 while( a[index] != 0){
			 if(a[0] > 0){
				 a[0] = a[0]-1;
				 time++;
			 }
			 updateArray(a);
		}
	static void updateArray(int a[]){
		int i, n = a.length, temp = a[0];
		for (i = 0; i < n-1; i++)
			a[i] = a[i+1];
		a[n-1] = temp;
		index = (index + n-1)%n;
	}
		
		return time;
	}

}

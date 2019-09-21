package belton_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int temp;

		int a;
		int b;
		int c;
		int d;

		int newA;
		int newB;
		int newC;
		int newD;

		System.out.println("This program decrypts digits with super secwet scheme OwO");

		System.out.println("Please enter a four-digit number (one digit at a time) :) : ");

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();

		System.out.println("Decrypting.......");

		newA = (a + 3) % 10;
		newB = (b + 3) % 10;
		newC = (c + 3) % 10;
		newD = (d + 3) % 10;

		temp = newC;
		newC = newA;
		newA = temp;

		temp = newD;
		newD = newB;
		newB = temp;

		System.out.printf("%d%d%d%d", newA, newB, newC, newD);

	}

}

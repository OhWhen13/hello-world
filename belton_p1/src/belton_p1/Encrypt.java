package belton_p1;

import java.util.Scanner;

public class Encrypt {

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

		System.out.println("This program encrypts digits with super secwet scheme OwO");

		System.out.println("Please enter a four-digit number (one digit at a time) :) : ");

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();

		System.out.println("Encrypting.......");

		newA = (a + 7) % 10;
		newB = (b + 7) % 10;
		newC = (c + 7) % 10;
		newD = (d + 7) % 10;

		temp = newA;
		newA = newC;
		newC = temp;

		temp = newB;
		newB = newD;
		newD = temp;

		System.out.printf("%d%d%d%d", newA, newB, newC, newD);

	}

}

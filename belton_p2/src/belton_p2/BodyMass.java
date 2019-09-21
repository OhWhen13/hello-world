package belton_p2;

import java.util.Scanner;

public class BodyMass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int option;

		float weight;
		float height;

		float BMI;

		System.out.println("BMI calculator ");
		System.out.println("Please select your Unit, Enter " + "  1: Pounds/Inches   2: Kilograms/Meters: ");
		option = in.nextInt();

		if (option == 1) {
			System.out.println("Enter your weight(lbs): ");
			weight = in.nextFloat();
			System.out.println("Enter your height(in): ");
			height = in.nextFloat();
			BMI = (703 * weight) / (height * height);
			System.out.printf("Your BMI is: %.2f ", BMI);
			if (BMI < 18.5) {
				System.out.println("[Underweight]");
			} else if (BMI < 25) {
				System.out.println("[Normal]");
			} else if (BMI < 30) {
				System.out.println("[Overweight]");
			} else {
				System.out.println("[Obese]");
			}
		} else if (option == 2) {
			System.out.println("Enter your weight(kg): ");
			weight = in.nextFloat();
			System.out.println("Enter your height(m): ");
			height = in.nextFloat();
			BMI = weight / (height * height);
			System.out.printf("Your BMI is: %.2f ", BMI);
			if (BMI < 18.5) {
				System.out.println("[Underweight]");
			} else if (BMI < 25) {
				System.out.println("[Normal]");
			} else if (BMI < 30) {
				System.out.println("[Overweight]");
			} else {
				System.out.println("[Obese]");
			}
		}

	}

}

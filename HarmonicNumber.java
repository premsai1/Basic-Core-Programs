package fellowship;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : this program performs the harmonic sum of no .
 * 
 * 
 */
public class Harmonic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		harmonic_number o1 = new harmonic_number();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the limit of harmonic mean");
		int limit = s1.nextInt();
		harmonic(limit);
	}

	public void harmonic(int limit) {
		if (limit > 0) {
			double i = 0;
			double sum = 0;
			for (i = 1; i <= limit; i++) {
				sum = sum + (1 / i);
				System.out.println("the limit is " + limit + " the harmonic mean " + (1 / i));

			}
			System.out.println("the harmonic sum till " + limit + " is=" + sum);

		} else {
			System.out.println("enter the correct value");
		}
	}

}

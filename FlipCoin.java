package fellowship;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : this program perform the flip-coin with random function and
 *          returns heads and tails .
 * 
 */
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flip_Coin o1 = new Flip_Coin();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the no of times the toss to be performed");
		int n = s1.nextInt();
		float a[] = new float[n];
		int min = 0;
		int max = 1;
		int temp = 1;
		int tails = 0;
		int heads = 0;
		int i = 0;
		if (n > 0) {

			for (i = 0; i < n; i++) {
				float random = (float) Math.random();
				if (random <= 0.5) {
					tails++;

				} else {
					heads++;

				}
				System.out.println("random elemnts are" + random);
				a[i] = random;

			}
			System.out.println("the heads are " + heads);
			System.out.println("the tails are " + tails);
			System.out.println(" " + n);
			int percentage_of_heads = ((heads * 100) / n);
			int percentage_of_tails = ((tails * 100) / n);
			System.out.println("the percentage of heads vs percentage  of tails " + percentage_of_heads + ": "
					+ percentage_of_tails);
		} else {
			System.out.println("invalid option");
		}
	}
}

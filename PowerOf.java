package fellowship;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : this program performs the 2 table till the given no.
 * 
 */
public class powerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power_of o1 = new power_of();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("the limit of power to be printed");
		int limit = s1.nextInt();
		if (limit > 0 && limit < 31) {
			for (int i = 0; i <= limit; i++) {
				int a = (int) Math.pow(2, i);
				System.out.println("2^" + i + " =" + a);
			}
		} else {

		}
	}
}

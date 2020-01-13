package fellowship;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : This program performs checks whether a no is a leap year arenot.
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear o1 = new leapyear();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the 4 digited year to be checked whether it is leap year");
		int year = s1.nextInt();
		int x = count(year);
		if (x >= 4) {
			leapyear(year);

		} else {
			System.out.println("enter the correct 4 digit year");
		}
	}

	public int count(int year) {
		int count = 0;
		while (year != 0) {
			year = year / 10;
			++count;
		}
		return count;

	}

	public void leapyear(int year) {

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("the year is a leap year");
		} else {
			System.out.println("this is not a leap year");
		}
	}
}

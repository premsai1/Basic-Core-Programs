package fellowship;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : prints string with a name
 */
public class First {
	void print(String str) {
		System.out.println("Hello " + str + ",How are you?");
	}

	public void Count(String str) {
		int i = 0;
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count++;
		}
		if (count > 3) {
			print(str);
		} else {
			System.out.println("enter the Corrrect Usernmae");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user name");
		String str = sc.next();

		first u = new first();
		u.Count(str);
	}
}

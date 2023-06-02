package week05;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger astrisk = new AsteriskLogger();
		Logger space = new SpacedLogger();

		astrisk.Log(input());

		astrisk.Error(input());

		space.Log(input());

		space.Error(input());

	}

	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input next string:");
		String input = sc.next();
		return input;
	}

}
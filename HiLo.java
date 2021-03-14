/*
 * @author Tommy Yuan - this name came with 
 * file downloaded 08 March 2021
 * The purpose is to practise the use of if statement.
 * author: Angelica Beristain - add conditional statements
 * date: 14M March 2021
 * 
 * */

import java.util.*;

public class HiLo {

	int random;

	public void generateNumber() {
		// The following lines generate and output a random number between 1 and 10
		random = (int) (Math.random() * 10) + 1;
	}

	// Write the guess() method below
	public void guess() {
		// Use scanner to accept a user input
		// Create a new scanner object to receive user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you guess ");
		int guess = sc.nextInt();

		// write your code below
		if (guess > random) {
			System.out.println("High");
		} else if (guess == random) {
			System.out.println("Hit");
		} else {
			System.out.println("Low");
		}

	}

}

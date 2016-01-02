package com.darkbyte.programs.reversestring;

import java.util.Scanner;

public class Main {
	
	//Used to take input from the console
	private static Scanner scanner = new Scanner(System.in);

	//The main method for the program
	public static void main(String[] args) {
		//Gets the user to input something
		System.out.print("Please enter what you would like to reverse: ");
		String toReverse = scanner.nextLine();
		
		//An empty string to store the reversed sentence/word in
		String reversed = "";
		/*
		 * Loops backward through the string by starting at the length of the string and decrementing each time
		 * Gets the character at the index in the string to reverse minus 1 because if the character is not decremented by 1
		 * Then the array will access 1 over the character causing an error due to accessing a character not inside the array
		 * Also, if the error is ignored, the last character will be missed as 0 is not more than 0 and it will only loop as long as the loop counter is more than 0
		 */
		for(int i = toReverse.length(); i > 0; i--) reversed += toReverse.toCharArray()[i - 1];
		
		//Prints out the reversed string :)
		System.out.print("Reversed: " + reversed);
	}
}

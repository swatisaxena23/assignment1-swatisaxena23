/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in())
        double time = sc.nextDouble();
        double speed = 0.0;
        double distance = 0.0;
        double gravity = 9.8;
        speed = 9.8 * time;
        distance = 0.5 * gravity * time * time;
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}

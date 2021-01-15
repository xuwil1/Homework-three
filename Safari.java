/**
 * Safari extends Application contains all 
 * possible readCommands for safari application
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class Safari extends Application {
	String s = "Stack debug:\n[Home->SafariHome";
	String st = null;
	boolean bool = true;
	CommandStack stack;

	public Safari() {
		stack = new CommandStack();
	}

	@Override
	public void readCommand(Scanner scanner) throws InvalidCommandException {
		while (bool == true) {
			System.out.println(s + stack.toString());
			if (st != null) {
				System.out.println(st);
			} else {
			}
			System.out.println("Safari Options:\n\tG) Google Something\n"
					+ "\tF) Go to a favorite (bookmark)\n\tL) Follow a link\n"
					+ "\tH) Home Screen\n\tS) Switch to Maps\n\tB) Back");
			System.out.print("Please select a choice: ");
			// COMMAND OPTIONS
			char choice = scanner.nextLine().charAt(0);
			if (choice == 'G' | choice == 'g') { // Google Something
				System.out.print("Please enter a query: ");
				GoogleSomething command = new GoogleSomething(scanner);
				if (command.validCommand(stack)) {
					try {
						stack.push(command);
						st = command.toString();
					} catch (InvalidCommandException e) {
						System.out.println("Invalid!");
					}
				}
			} else if (choice == 'F' | choice == 'f') { // Go to a favorite (bookmark)
				System.out.print("Please enter bookmark name: ");
				GoToBookmark command = new GoToBookmark(scanner);
				if (command.validCommand(stack)) {
					try {
						stack.push(command);
						st = command.toString();
					} catch (InvalidCommandException e) {
						System.out.println("Invalid!");
					}
				}
			} else if (choice == 'L' | choice == 'l') { // Follow a link
				System.out.print("Please enter a link: ");
				FollowLink command = new FollowLink(scanner);
				if (command.validCommand(stack)) {
					try {
						stack.push(command);
						st = command.toString();
					} catch (InvalidCommandException e) {
						System.out.println("Invalid!");
					}
				}
			} else if (choice == 'H' | choice == 'h') { // Home Screen
				return;
			} else if (choice == 'S' | choice == 's') { // Switch to Maps
				sw = true;
				return;
			} else if (choice == 'B' | choice == 'b') { // Back
				try {
					stack.pop();
					st = null;
				} catch (EmptyStackException e) {
					System.out.println("Invalid!");
				}
			} else {
				System.out.println("Choice invalid!");
			}
		}
	}
}

/**
 * Map extends Application contains all 
 * possible readCommands for map application
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class Map extends Application {
	String s = "Stack debug:\n[Home->MapsHome";
	String st = null;
	boolean bool = true;
	CommandStack stack;

	public Map() {
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
			System.out.println("Maps Options:\n\tF) Find a place\n" + "\tP) Plan a route\n\tN) Start Navigation\r\n"
					+ "\tH) Home Screen\r\n\tS) Switch to Safari\r\n" + "\tB) Back");
			System.out.print("Please select an option: ");
			char choice = scanner.nextLine().charAt(0);
			// COMMAND OPTIONS
			if (choice == 'F' | choice == 'f') { // Find a place
				System.out.print("Please enter a location: ");
				FindPlace command = new FindPlace(scanner);
				if (command.validCommand(stack)) {
					try {
						stack.push(command);
						st = command.toString();
					} catch (InvalidCommandException e) {
						System.out.println("Invalid!");
					}
				}
			} else if (choice == 'P' | choice == 'p') { // Plan a route
				PlanRoute command = new PlanRoute(scanner);
				if (command.validCommand(stack)) {
					try {
						stack.push(command);
						st = command.toString();
					} catch (InvalidCommandException e) {
						System.out.println("Invalid!");
					}
				}
			} else if (choice == 'N' | choice == 'n') { // Start Navigation
				try {
					StartNavigation command = new StartNavigation(this.stack);
					if (command.validCommand(stack)) {
						try {
							stack.push(command);
							try {
								System.out.println(stack.peek());
								}catch(EmptyStackException e){}
							st = command.toString();
						} catch (InvalidCommandException e) {
							System.out.println("Invalid!");
						}
					}
				} catch (EmptyStackException e) {
					System.out.println("No route or destination!");
				}

			} else if (choice == 'H' | choice == 'h') { // Home Screen
				return;
			} else if (choice == 'S' | choice == 's') { // Switch to Safari
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

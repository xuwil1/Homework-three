
/**
 * iCatchUp is main driver of program
 * contains menu for user interactions 
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class iCatchUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Application safari = new Safari();								//creates new safari application
		Application map = new Map();									//creates new map application
		Application app;										//creates dummy application named app
		boolean quit = true;
		boolean sw = false;
		System.out.println("Welcome to the uPhone pocket telegraph");
		while (quit) {
			System.out.println("Home Options:\n\tS) Safari\n\tM) Maps\n\tQ) Quit");
			System.out.print("Please select an option: ");
			char opt = sc.nextLine().charAt(0);

			if (opt == 'S' | opt == 's' | opt == 'M' | opt == 'm') {			//map or safari command

				if (opt == 'S' | opt == 's') {								
					app = safari;

				} else {
					app = map;
				}
				try {
					app.readCommand(sc);
					while (app.getSwitch() == true) {
						sw = true;
						if (app.equals(safari)) {
							app = map;
						} else {
							app = safari;
						}
						app.setSwitch();
						try {
							sw = false;
							app.readCommand(sc);
						} catch (InvalidCommandException e) {
							System.out.println("Error command invalid!");
						}
					}
				} catch (InvalidCommandException e) {
					System.out.println("Error command invalid!");
				}
			} else if (opt == 'Q' | opt == 'q') {											//Quit command
				System.out.println("Sorry to see you go, tell the iPod I said hi!");
				quit = false;
			} else {
				System.out.println("Input invalid! Please try again.");
			}
		}

	}
}

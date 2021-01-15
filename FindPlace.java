
/**
 * FindPlace  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents "F:Find a place"
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class FindPlace implements Command {
	private String destination;

	/**
	 * method creates a FindPlace object with scanner of type Scanner
	 * 
	 * @param scanner
	 */
	public FindPlace(Scanner scanner) {
		this.destination = scanner.nextLine();
	}

	/**
	 * Stack is type CommandStack
	 * 
	 * @param stack
	 *            Returns whether or not pushing this FindPlace command will be
	 *            valid for the given stack.
	 * @return
	 */
	public boolean validCommand(CommandStack stack) {
		return true;
	}

	/**
	 * Returns String of Command in long form for current screen display
	 * 
	 * @return
	 */
	public String toString() {
		return "Current Screen: Showing results for " +destination;
		 
	}

	/**
	 * Returns string of command in short form
	 * 
	 * @return
	 */
	public String toShortString() {
		return "->F:" + destination;
	}

}
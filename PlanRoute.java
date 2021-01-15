
/**
 * PlanRoute  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents "P: Plan a route"
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class PlanRoute implements Command {
	private String source;
	private String destination;

	/**
	 * method creates a PlanRoute object with scanner of type Scanner
	 * 
	 * @param scanner
	 */
	public PlanRoute(Scanner scanner) {
		System.out.print("Please enter a source: ");
		this.source = scanner.nextLine();
		System.out.print("Please enter a destination: ");
		this.destination = scanner.nextLine()
				;
	}

	/**
	 * Stack is type CommandStack
	 * 
	 * @param stack
	 *            Returns whether or not pushing this PlanRoute command will be
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
		return "Current Screen: Planning route from " + source + " to " + destination;
	}

	/**
	 * Returns string of command in short form
	 * 
	 * @return
	 */
	public String toShortString() {
		return "->P:" + source + "-" + destination;
	}
}

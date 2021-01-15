/**
 * GoogleSomething  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents “L: FollowLink”
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class FollowLink implements Command {
	private String link;

	/**
	 * method creates a FollowLink object with scanner of type Scanner
	 * 
	 * @param scanner
	 */
	public FollowLink(Scanner scanner) {
		this.link = scanner.nextLine();
	}

	/**
	 * Stack is type CommandStack
	 * 
	 * @param stack
	 *            Returns whether or not pushing this StartNavigation command will
	 *            be valid for the given stack.
	 * @return
	 */
	public boolean validCommand(CommandStack stack) {
		if (stack.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Returns String of Command in long form for current screen display
	 * 
	 * @return
	 */
	public String toString() {
		return "Current Screen: " + this.link;
	}

	/**
	 * Returns string of command in short form
	 * 
	 * @return
	 */
	public String toShortString() {
		return "->L:" + this.link;
	}

}

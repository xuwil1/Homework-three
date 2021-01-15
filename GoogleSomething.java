/**
 * GoogleSomething  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents "G: Google something"
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class GoogleSomething implements Command{
	private String query;
	/**
	 * method creates a GoogleSomething object with scanner of type Scanner
	 * @param scanner
	 */
	public GoogleSomething (Scanner scanner) {
		this.query=scanner.nextLine();
	}
	/**
	 * Stack is type CommandStack
	 * @param stack
	 * Returns whether or not pushing this GoogleSomething command will be valid for the given stack.
	 * @return
	 */
		public boolean validCommand(CommandStack stack) {
				return true;
		}
	/**
	 * Returns String of Command in long form for current screen display
	 * @return
	 */
		public String toString(){
			return "Current Screen: Google: " + query;
		}

	/**
	 * Returns string of command in short form 
	 * @return
	 */
		public String toShortString(){		
			return "->G:"+ query;
		}

	
}

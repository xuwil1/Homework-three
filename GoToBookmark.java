/**
 * GoogleSomething  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents “F: Go to favorite/bookmark”
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class GoToBookmark implements Command{
	private String bookmark;
	/**
	 * method creates a GoToBookmark object with scanner of type Scanner
	 * @param scanner
	 */
	public GoToBookmark(Scanner scanner){
		this.bookmark=scanner.nextLine();
	}
	/**
	 * Stack is type CommandStack
	 * @param stack
	 * Returns whether or not pushing this FindPlace command will be valid for the given stack.
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
			return "Current Screen: Safari Home";
		}

	/**
	 * Returns string of command in short form 
	 * @return
	 */
		public String toShortString(){		
			return "->F:"+ bookmark;
		}
}

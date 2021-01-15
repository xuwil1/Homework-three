/**
 * StartNavigation  class is used to represent a possible command 
 * that can be entered in the phone app
 * represents "N: Start Navigation"
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class StartNavigation implements Command {
	private String source;
	private String destination;

	/**
	 * method creates a StartNavigation object with commandstack of type
	 * CommandStack
	 * 
	 * @param commandstack
	 *            throws exception when commandstack is empty
	 * @throws EmptyStackException
	 */
	public StartNavigation(CommandStack commandStack) throws EmptyStackException {
		if (commandStack.isEmpty() | commandStack.peek() instanceof StartNavigation) {
			throw new EmptyStackException();
		} else if(commandStack.peek() instanceof FindPlace){
			this.source= commandStack.peek().toString();
			this.source=this.source.substring(36,source.length());
			System.out.println(source);
		}else {
			this.source = commandStack.peek().toString();
			this.source=source.substring(36,source.length());
			this.source=source.substring(0,source.lastIndexOf(" to "));
			this.destination = commandStack.peek().toString();
			this.destination=destination.substring(36,destination.length());
			this.destination=destination.substring(destination.lastIndexOf(" to ")+4,destination.length());
		}
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
		try {
			if (stack.isEmpty() | stack.peek() instanceof StartNavigation) {
				return false;
			} else {
				return true;
			}
		} catch (EmptyStackException e) {
			return false;
		}
	}

	/**
	 * Returns String of Command in long form for current screen display
	 * 
	 * @return
	 */
	public String toString() {
		if(this.destination==null) {
			return "Current Screen:Navigating to " + this.source;
		}else {
		return "Current Screen:Navigating from " + this.source + " to " + this.destination;
		}
	}

	/**
	 * Returns string of command in short form
	 * 
	 * @return
	 */
	public String toShortString() {
		if(this.destination==null) {
			return "->N:" + this.source;
		}else {
		return "->N:" + this.source + "-" + this.destination;
		}
	}
}

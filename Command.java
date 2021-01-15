
/**
 * Command  interface is used to represent the commands entered on the phone app
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public interface Command {
	/**
	 * stack is type CommandStack and is the object that is to be tested
	 * 
	 * @param stack
	 *            lets user know whether or not the stack entered is valid or
	 *            invalid
	 * @return
	 */
	public boolean validCommand(CommandStack stack);

	/**
	 * returns Command in long form for current screen display
	 */
	public String toString();

	/**
	 * returns command in short form for stack display
	 * 
	 * @return
	 */
	public String toShortString();
}

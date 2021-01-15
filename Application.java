
/**
 * Application is an abstract class that contains a method to read commands from iCatchUp
 * has a goBack method to pop commands
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

abstract public class Application {
	private CommandStack stack;
	protected boolean sw = false;
	/**
	 * takes in user input
	 * @param scanner
	 * throws InvalidCommandException if user input creates error 
	 * @throws InvalidCommandException
	 */
	abstract public void readCommand(Scanner scanner) throws InvalidCommandException;
	/**
	 * pop commands
	 * throws EmptyStackException when there is an error
	 * @throws EmptyStackException
	 */
	public void goBack() throws EmptyStackException {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		} else {
			stack.pop();
		}

	}
	/**
	 * returns boolean sw
	 * @return
	 */
	public boolean getSwitch() {
		return sw;
	}
	/**
	 * resets sw to false
	 */
	public void setSwitch() {
		this.sw = false;
	}
}

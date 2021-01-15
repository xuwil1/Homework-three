
/**
 * CommandStack is a stack made from arraylist 
 * allows user to use functions such as push, pop, and peek
 * 
 *  @author Willie Xu
 *	email: xuwillie1@gmail.com
 *	Class CSE 214-R10
 */

import java.io.*;
import java.util.*;

public class CommandStack {
	private int index = -1;
	protected ArrayList<Command> commands = new ArrayList<Command>();
/**
 * command is the user specified input that is added on to the stack
 * @param command
 * InvalidCommandException when input is invalid
 * @throws InvalidCommandException
 */
	public void push(Command command) throws InvalidCommandException {
		if (!command.validCommand(this)) {
			throw new InvalidCommandException();
		} else {
			index++;
			commands.add(index, command);

		}
	}
/**
 * pops the last command on the stack
 * @return
 * if stack is empty an EmptyStackException is thrown
 * @throws EmptyStackException
 */
	public Command pop() throws EmptyStackException {
		if (commands.isEmpty()) {
			throw new EmptyStackException();
		} else {
			Command temp = commands.get(index);
			commands.remove(index);
			System.out.println(index);
			index--;
			return temp;
		}
	}
/**
 * returns the last command on the stack without popping
 * @return
 * throws EmptyStackException if stack is empty
 * @throws EmptyStackException
 */
	public Command peek() throws EmptyStackException {
		if (commands.isEmpty()) {
			throw new EmptyStackException();
		} else {
			return commands.get(index);
		}
	}
/**
 * returns true when stack is empty and false when stack is not empty
 * @return
 */
	public boolean isEmpty() {
		if (commands.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
/**
 * returns screen command string
 * @return
 */
	public String getScreenCommand() {
		return commands.get(index).toString();
	}
/**
 * returns stack debug command
 */
	public String toString() {
		String x = "";
		for (int i = 0; i < index + 1; i++) {
			x += commands.get(i).toShortString();
		}
		return x;
	}
}

package pobj.tme6;

import java.util.ArrayList;

public class CommandList implements ICommand{
	ArrayList<ICommand> list;
	
	public void addCommand(ICommand command){
		list.add(command);
	}
	public CommandList() {
		this.list = new ArrayList<ICommand>();
	}
	public void execute(IColorTurtle turtle){
		for (ICommand cmd : list) {
			cmd.execute(turtle);
		}
	}
}

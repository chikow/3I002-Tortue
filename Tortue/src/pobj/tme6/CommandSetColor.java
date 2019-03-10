package pobj.tme6;

import javafx.scene.paint.Color;

public class CommandSetColor implements ICommand {
	Color color;
	public CommandSetColor(Color color) {
		this.color = color;
	}
	@Override
	public void execute(IColorTurtle turtle) {
		// TODO Auto-generated method stub
		turtle.setColor(color);
	}

}

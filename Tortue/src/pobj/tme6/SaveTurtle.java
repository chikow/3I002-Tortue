package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle {
	CommandList list;
	
	
	public SaveTurtle() {
		list=new CommandList();
	}

	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandTurn(angle));

	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		list.addCommand(new CommandUp());

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		list.addCommand(new CommandDown());
}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		list.addCommand(new CommandSetColor(color));
	}
	public CommandList getCommand(){
		return list;
	}

}

package pobj.tme6;

public class CommandMove implements ICommand{
	int i;
	
	public CommandMove(int i) {
		this.i = i;
	}

	@Override
	public void execute(IColorTurtle turtle) {
		// TODO Auto-generated method stub
		turtle.move(i);
		
	}

}

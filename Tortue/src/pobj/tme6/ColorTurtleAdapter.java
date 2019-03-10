package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtleAdapter implements IColorTurtle{
	ITurtle T;
	Color c;
	
	public ColorTurtleAdapter(ITurtle T) {
		this.T=T;
	}
	
	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		T.move(length);
		
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		T.turn(angle);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		T.up();
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		T.down();
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.c=color;
		
	}

}

package pobj.tme6;

import javafx.scene.paint.Color;

public class ContextTurtle extends ColorTurtle{
	private IContext Context;
	
	 public ContextTurtle(IContext Con) {
		// TODO Auto-generated constructor stub
		 super();
		this.Context=Con;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		Context.drawLine(x1, y1, x2, y2, color);
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
	}

}

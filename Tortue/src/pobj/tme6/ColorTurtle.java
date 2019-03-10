package pobj.tme6;


public class ColorTurtle extends Turtle implements IColorTurtle{
	private Color color;
	
	
	
	public ColorTurtle() {
		super();
		this.color= Color.BLACK;
	}

	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		super.move(length);
		
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		super.turn(angle);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		super.up();
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		super.down();
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
		
		
	}

	
	public void draw(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+color.toString());
		
	}

}

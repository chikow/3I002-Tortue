package pobj.tme6;
import javafx.scene.paint.Color;

public class Turtle implements ITurtle{
	private int x , y ;
	private int angle;
	private boolean etat;
	
	

	public Turtle() {
		this.x = 0;
		this.y = 0;
		this.angle = 0;
		this.etat = true;
	}
	
	
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
	}
	

	@Override
	public void move(int length) {
		int oldX = x,oldY = y;
		
		
		 x = this.x + (int)(length * Math.sin(angle * Math.PI / 180.));
		 y = this.y + (int)(length * Math.cos(angle * Math.PI / 180.));
		 if(etat) {
		draw(oldX ,oldY , this.x,this.y);
		 }
	}

	@Override
	public void turn(int angle) {
	this.angle = (this.angle+angle)%360;
	
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
	this.etat=false;
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		this.etat=true;

		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	

}

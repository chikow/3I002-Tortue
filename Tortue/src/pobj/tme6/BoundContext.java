package pobj.tme6;

import javafx.scene.paint.Color;

public class BoundContext implements IContext{
	int minx, miny, maxx, maxy;
	
	
	public BoundContext(){
		minx=Integer.MAX_VALUE;
		miny=Integer.MAX_VALUE;
		maxx=Integer.MIN_VALUE;
		maxy=Integer.MIN_VALUE;

		
	}
	public int getMinX(){
		return this.minx;
	}
	public int getMinY(){
		return this.miny;

	}
	public int getMaxX(){
		return this.maxx;

	}
	public int getMaxY(){
		return this.maxy;

	}
	@Override
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		// TODO Auto-generated method stub
		minx = Math.min(minx,Math.min(x1, x2));
		maxx = Math.max(maxx, Math.max(x1, x2));
		miny = Math.min(miny, Math.min(y1, y2));
		maxy = Math.max(maxy, Math.max(y1, y2));
		
	}

}

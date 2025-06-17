
public class FastEnemy extends Enemy{
	public FastEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=1;
	}
	
	
	public void draw(MyFrame f) {
		f.setColor(255, 167, 94);
		f.fillOval(x+8, y, 8, 8);
		f.fillOval(x+16, y, 8, 8);
		f.fillOval(x, y+8, 8, 8);
		f.fillOval(x, y+16, 8, 8);
		f.fillOval(x+24, y+8, 8, 8);
		f.fillOval(x+24, y+16, 8, 8);
		f.fillOval(x+8, y+24, 8, 8);
		f.fillOval(x+16, y+24, 8, 8);
		
		f.setColor(255, 277, 132);
		f.fillOval(x+8, y+8, 17, 17);
		
		f.setColor(0, 0, 0);
		f.fillOval(x+10, y+15, 3, 3);
		f.fillOval(x+18, y+15, 3, 3);
		
		f.setColor(255, 167, 94);
		f.fillOval(x+13, y+18, 4, 4);
		f.fillOval(x+16, y+18, 4, 4);
		
		f.setColor(255, 160, 0);
		f.fillOval(x+15, y+16, 3, 3);
	}
	
	public void move() {
		super.move();
		vy=vy+1;
	}
}

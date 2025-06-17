
public class CuteEnemy extends Enemy{

	public CuteEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=2;
	}
	
	
	public void draw(MyFrame f) {
		f.setColor(100, 200, 100);
		f.fillOval(x, y, 40, 30);
		f.setColor(255, 255, 255);
		f.fillOval(x+5, y+10, 10, 10);
		f.fillOval(x+25, y+10, 10, 10);
		f.setColor(0, 0, 0);
		f.fillOval(x+9, y+11, 5, 5);
		f.fillOval(x+26, y+14, 5, 5);
	}
	
	public void move() {
		super.move();
		if(x<GameWorld.player.x) {
			x--;
		}
		if(x>GameWorld.player.x) {
			x++;
		}
	}
	
	
}

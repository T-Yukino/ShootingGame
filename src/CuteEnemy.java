
public class CuteEnemy extends Enemy{

	public CuteEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=1;
		score=30;
	}
	
	
	public void draw(MyFrame f) {
		f.setColor(245, 242, 58);
		f.fillOval(x, y, 20, 20);
		f.setColor(255, 255, 255);
		f.fillOval(x+2, y+5, 6, 6);
		f.fillOval(x+12, y+5, 6, 6);
		f.setColor(0, 0, 0);
		f.fillOval(x+3, y+5, 5, 5);
		f.fillOval(x+13, y+5, 5, 5);
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

package labyrinth.data.user;

public class Player {
	protected int x = 0;
	protected int y = 0;
	protected String symbol;
	protected int lifePoint;
	
	public int getLifePoint() {
		return lifePoint;
	}
	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	
	public String getPosition() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
}

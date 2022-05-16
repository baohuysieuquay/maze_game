package labyrinth.data.map;

import labyrinth.data.user.Player;

public class Playground {
	private int x = 7;
	private int y = 7;
	private Obstacle obs;
	private String goal = "G";
	private Player p;
	
	public Playground(Obstacle obs, Player p) {
		this.obs = obs;
		this.p = p;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}

	public Player getP() {
		return this.p;
	}
	public void setP(Player p) {
		this.p = p;
	}



	public void drawPlayground() {
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				if ((i == 0) || (i == (this.x - 1))) {
					if (j == (this.y - 1)) {
						System.out.println("#");
					} else {
						System.out.print("#");
					}
				} else { 
					if (j == (this.y - 1)) {
						System.out.println("#");
					} else if (j == 0) {
						System.out.print("#");
					} else { // This part is the actual playground, others are just the walls
						if ((i == (this.x - 2)) && (j == (this.y - 2))) {
							System.out.print(this.goal);
						} else if ((i == this.p.getY() + 1) && (j == this.p.getX() + 1)) {
							System.out.print(this.p.getSymbol());
						} else if ((i == 2) && (j == 4)){
							System.out.print(this.obs.toString());
						} else if ((i == 3) && (j == 3)){
							System.out.print(this.obs.toString());
						} else if ((i == 4) && (j == 5)){
							System.out.print(this.obs.toString());
						} else if ((i == 5) && (j == 2)){
							System.out.print(this.obs.toString());
						} else {
							System.out.print(" ");
						}
						
					}
				}
			}
		}
		System.out.println("\n\nLife Points: " + this.p.getLifePoint() + "\n\n");
	}
	
}

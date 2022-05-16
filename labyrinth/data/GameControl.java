package labyrinth.data;

import labyrinth.data.map.Playground;

public class GameControl {
	public static void moveUp(Playground field) {
		int currentY = field.getP().getY();
		int currentLP = field.getP().getLifePoint();
		field.getP().setY(--currentY);
		if (((field.getP().getX() == 3) && (field.getP().getY() == 1)) || ((field.getP().getX() == 2) && (field.getP().getY() == 2)) || ((field.getP().getX() == 4) && (field.getP().getY() == 3)) || ((field.getP().getX() == 1) && (field.getP().getY() == 4))) {
			field.getP().setLifePoint(--currentLP);
			field.getP().setY(currentY);
			field.drawPlayground();
			System.out.println();
			System.out.println();
		} else {
			field.drawPlayground();
			System.out.println();
			System.out.println();
		}
	}
	
	public static void moveRight(Playground field) {
		int currentX = field.getP().getX();
		int currentLP = field.getP().getLifePoint();
		field.getP().setX(++currentX);
		if (((field.getP().getX() == 3) && (field.getP().getY() == 1)) || ((field.getP().getX() == 2) && (field.getP().getY() == 2)) || ((field.getP().getX() == 4) && (field.getP().getY() == 3)) || ((field.getP().getX() == 1) && (field.getP().getY() == 4))) {
			field.getP().setLifePoint(--currentLP);
			field.getP().setX(currentX);
			field.drawPlayground();
			System.out.println();
			System.out.println();
		} else {
			field.drawPlayground();
			System.out.println();
			System.out.println();
		}
	}
	
	public static void moveDown(Playground field) {
		int currentY = field.getP().getY();
		int currentLP = field.getP().getLifePoint();
		field.getP().setY(++currentY);
		if (((field.getP().getX() == 3) && (field.getP().getY() == 1)) || ((field.getP().getX() == 2) && (field.getP().getY() == 2)) || ((field.getP().getX() == 4) && (field.getP().getY() == 3)) || ((field.getP().getX() == 1) && (field.getP().getY() == 4))) {
			field.getP().setLifePoint(--currentLP);
			field.getP().setY(currentY);
			field.drawPlayground();
			System.out.println();
			System.out.println();
		} else {
			field.drawPlayground();
			System.out.println();
			System.out.println();
		}
	}
	
	public static void moveLeft(Playground field) {
		int currentX = field.getP().getX();
		int currentLP = field.getP().getLifePoint();
		field.getP().setX(--currentX);
		if (((field.getP().getX() == 3) && (field.getP().getY() == 1)) || ((field.getP().getX() == 2) && (field.getP().getY() == 2)) || ((field.getP().getX() == 4) && (field.getP().getY() == 3)) || ((field.getP().getX() == 1) && (field.getP().getY() == 4))) {
			field.getP().setLifePoint(--currentLP);
			field.getP().setX(currentX);
			field.drawPlayground();
			System.out.println();
			System.out.println();
		} else {
			field.drawPlayground();
			System.out.println();
			System.out.println();
		}
	}
	
	public static String gameOver(Playground field) {
		if ((field.getP().getX() == field.getX() - 3) && (field.getP().getY() == field.getY() - 3)) {
			return "You win";
		} else if (field.getP().getLifePoint() == 0){
			return "You die";
		} else {
			return " ";
		}
	}
}

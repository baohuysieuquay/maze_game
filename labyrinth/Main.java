package labyrinth;

import labyrinth.data.GameControl;
import labyrinth.data.map.*;
import labyrinth.data.user.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Obstacle obs = new Obstacle();
		Player bao = new Male();
		Playground map = new Playground(obs, bao);
		String g = GameControl.gameOver(map);
		map.drawPlayground();
		
		
		
		while (!g.equals("You win")) {
			
			System.out.println("Your move? w(Up) d(Right) s(Down) a(Left) ");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equals("w")) {
				GameControl.moveUp(map);
				g = GameControl.gameOver(map);
				if (g.equals("You die")) {
					System.out.println(g);
					break;
				}
			}
			if (input.equals("a")) {
				GameControl.moveLeft(map);
				g = GameControl.gameOver(map);
				if (g.equals("You die")) {
					System.out.println(g);
					break;
				}
			}
			if (input.equals("s")) {
				GameControl.moveDown(map);
				g = GameControl.gameOver(map);
				if (g.equals("You die")) {
					System.out.println(g);
					break;
				}
			}
			if (input.equals("d")) {
				GameControl.moveRight(map);
				g = GameControl.gameOver(map);
				if (g.equals("You die")) {
					System.out.println(g);
					break;
				}
			}
			if (input.equals("quit")) {
				break;
			} 
			if (input.equals("check")) {
				System.out.println(map.getP().getPosition());
			}
		}
		
		if ((map.getP().getX() == map.getX() - 3) && (map.getP().getY() == map.getY() - 3)) {
			System.out.println("You have won the game");
		} else {
			System.out.println("Game ended");
		}
		
		
		
		
		/*
		 System.out.println(bao.getPosition());
		GameControl.moveDown(map);
		System.out.println(bao.getPosition());
		GameControl.moveRight(map);
		System.out.println(bao.getPosition());
		GameControl.moveLeft(map);
		System.out.println(bao.getPosition());
		GameControl.moveUp(map);
		System.out.println(bao.getPosition());
		 */

	}

}
package dieBoese2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Thanh Tran 1921390
 * @version 0.1.5
 */
public class Game {

	protected Player p1, p2;
	protected Board board;
	protected Menu menu;

	public Game() {
		menu = new Menu();
		// menu settings
		menu.menuLoop();

		/**
		 * generates the Players (first PvP)
		 */
		p1 = new HumanPlayer('X');
		p2 = new HumanPlayer('O');

		/**
		 * creates the Board with desired size
		 */
		board = new Board(menu.getBoardSize());
	}

	protected static String readInput() {
		Scanner sc = new Scanner(System.in);
		String input;

		input = sc.next();
		sc.close();

		return input;
	}
}
package at.fhj.sodevel2.hiscores.api;

import java.util.ArrayList;
import java.util.List;

import at.fhj.sodevel2.hiscores.model.Player;

/**
 * Testdaten
 * @author krajn
 *
 */
public class PlayerImport {

	public static List<Player> getPlayers() {
		List<Player> players = new ArrayList<Player>();

		players.add(new Player("Bart"));
		players.add(new Player("Homer"));
		players.add(new Player("Marge"));
		players.add(new Player("Lisa"));
		players.add(new Player("Maggie"));
		
		
		Player p1= new Player("Bart");
		p1.updateScore(10);
		players.add(p1);
		players.add(p1);
		players.add(p1);
		
		Player p2= new Player("Homer");
		p2.updateScore(100);
		players.add(p2);
		
		Player 	p3= new Player("Bart");
		p3.updateScore(10);
		players.add(p3);
		
		
		
		return players;
	}

	public static Player[] getPlayerArray() {
		Player[] playerArray = new Player[5];
		
		for (int i = 0; i < playerArray.length; i++) {
			Player tmpPlayer= new Player("Elmar");
			tmpPlayer.updateScore(i);
			playerArray[i]= tmpPlayer;
		}
		
		return playerArray;

	}
}

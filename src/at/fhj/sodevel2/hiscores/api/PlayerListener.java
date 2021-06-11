package at.fhj.sodevel2.hiscores.api;

import at.fhj.sodevel2.hiscores.model.Player;

public interface PlayerListener {
	
	public void update(Player p);

	public int countCalls();
	
	
}

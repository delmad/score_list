package at.fhj.sodevel2.hiscores.api;

import java.util.List;
import java.util.Set;

public interface PlayerCollection {

	public Set<AbstractPlayer> getUniquePlayers();
	
	public List<AbstractPlayer> getAllPlayer();
	
	public void addPlayer(AbstractPlayer p);
	
	
}

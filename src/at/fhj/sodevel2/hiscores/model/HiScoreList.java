package at.fhj.sodevel2.hiscores.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import at.fhj.sodevel2.hiscores.api.AbstractPlayer;
import at.fhj.sodevel2.hiscores.api.PlayerCollection;

public class HiScoreList implements PlayerCollection {

	private List<AbstractPlayer> playerList;
	private Set<AbstractPlayer> playerSet;
	
	
	public HiScoreList(){
		
		playerList = new ArrayList<AbstractPlayer>();
		
		//mengen implementierung durch hashing-verfahern
		playerSet = new HashSet<AbstractPlayer>();
	}
	
	
	@Override
	public Set<AbstractPlayer> getUniquePlayers() {
		//return this.---> bei der impelementation von Interface 
		return this.playerSet;
	}

	@Override
	public List<AbstractPlayer> getAllPlayer() {
		return this.playerList;
	}

	@Override
	public void addPlayer(AbstractPlayer p) {
		this.playerList.add(p);
		this.playerSet.add(p);
		
	
	}
	
	
	

}

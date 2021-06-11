package at.fhj.sodevel2.hiscores.model;


import at.fhj.sodevel2.hiscores.api.AbstractPlayer;

/**
 * 
 * 
 * Base class for a Player 
 *
 */
public class Player extends AbstractPlayer{
	
	//constructor
	public Player(String name) {
		super();
		this.name = name;
		this.score= 0;
	}
	// Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}
	
	// abstracte Method
	public void updateScore(int points) {
		this.score = score+ points;
	}
	
	
	@Override
	public boolean equals(Object o) 
	{
	
		Player tmpPlayer = (Player) o;
		
		if (this.getName().equals(tmpPlayer.getName()) && (this.getScore()==tmpPlayer.getScore()))
		{
			return true;
		}
		else  {
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getScore()* this.getName().hashCode();
	}
	
}

package at.fhj.sodevel2.hiscores.api;
public abstract class AbstractPlayer {

	protected String name;
	protected int score;

	public AbstractPlayer() {
		super();
	}



	/**
	 *  set the score for the player
	 * @param points
	 */
	public abstract void updateScore(int points); 
	
	public String toString() {
		return "Player " + this.name + ", score="+ this.score; 
	}

}
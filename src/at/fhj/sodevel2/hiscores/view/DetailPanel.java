package at.fhj.sodevel2.hiscores.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import at.fhj.sodevel2.hiscores.api.PlayerListener;
import at.fhj.sodevel2.hiscores.model.Player;

public class DetailPanel extends JPanel implements PlayerListener,ListSelectionListener {
	private JLabel playerLabel;
	private JLabel scoreLabel;
	private JLabel counterLabel;
	private int count;
	
	public DetailPanel(){
		BoxLayout horizontal = new BoxLayout(this,BoxLayout.Y_AXIS);
		setLayout(horizontal);
		add(new JLabel("Player:"));
	}
	
	//zeige selecte player
	@Override
	public void update(Player p) {
		String homer = "Homer";
		if(p.getName()== homer){
			count ++;
		}
		System.out.println(p.toString());
		if(this != null && playerLabel != null){
			this.remove(playerLabel);
			this.remove(scoreLabel);
			this.remove(counterLabel);
		}
		playerLabel = new JLabel(p.getName());
		scoreLabel = new JLabel("Score " + Integer.toString(p.getScore()));
		counterLabel= new JLabel("Counter " + Integer.toString(count));
		add(playerLabel);
		add(scoreLabel);
		add(counterLabel);
		repaint();
		revalidate();
		
	}
	//zeige Aufrufe des Listenes
	@Override
	public int countCalls() {
		System.out.println("count: " + count);
		return count;
	}
//cim selekiras pozivas valueChange
	@Override
	public void valueChanged(ListSelectionEvent e) {
		JList<Player> lsm = (JList<Player>) e.getSource();
        Player p = lsm.getSelectedValue();
        if(e.getValueIsAdjusting()){
        	update(p);
        	
        }
	}

}

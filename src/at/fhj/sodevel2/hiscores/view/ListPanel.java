package at.fhj.sodevel2.hiscores.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import at.fhj.sodevel2.hiscores.api.AbstractPlayer;
import at.fhj.sodevel2.hiscores.api.PlayerImport;
import at.fhj.sodevel2.hiscores.model.HiScoreList;
import at.fhj.sodevel2.hiscores.model.Player;

/**
 * 
 * Listpanel to show data 
 *
 */
public class ListPanel extends JPanel {

	private JLabel listHeadline;
	private JButton loadFile;
	private JButton btnList, btnSet;
	private JList list;
	private File f;
	BoxLayout horizontal;

	// hiScorList
	HiScoreList hiScores;
	
	

	public ListPanel() {

		setBackground(Color.green);
		horizontal = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(horizontal);
		

		hiScores = new HiScoreList();
		for (Player p : PlayerImport.getPlayers()) {

			hiScores.addPlayer(p);
		}
		
		showList();

	}

	
	/**
	 * load list with all data
	 */
	private void showList() {

		if (list != null) {
			remove(list);
			list = null;
		}

		Vector<Player> vect = new Vector<Player>();

		for (AbstractPlayer p : hiScores.getAllPlayer()) {
			vect.add((Player) p);
		}

		list = new JList();
		list.setListData(vect);
		add(list);
		repaint();
		revalidate();
		
		
	}

	/**
	 * Show list with set data
	 * 
	 */
	private void showSet() {

		if (list != null) {
			remove(list);
			list = null;
		}

		Vector<Player> vect = new Vector<Player>();

		for (AbstractPlayer p : hiScores.getUniquePlayers()) {
			vect.add((Player) p);
		}

		list = new JList();
		list.setListData(vect);

		add(list);
		repaint();
		revalidate();
	}

	
	/**
	 * Test data
	 */
	private void testList() {
		Vector<String> vect = new Vector<String>();
		vect.add("anna");
		vect.add("bernd");
		vect.add("chris");

		list = new JList();
		list.setListData(vect);

		add(list);
		repaint();
		revalidate();
	}


	public JList getList() {
		return list;
	}


	public void setList(JList list) {
		this.list = list;
	}


	
	
	
	
	
	
}

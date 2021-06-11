package at.fhj.sodevel2.hiscores.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HiscoreFrame extends JFrame {

	private ListPanel myListPanel;
	private DetailPanel myDetailPanel;

	public HiscoreFrame() {
		setSize(300, 400);
		setTitle("Players");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setLayout(new BorderLayout());
		add(new JLabel("<html><H1> HiScores !</h1>"), BorderLayout.NORTH);
	
		myListPanel = new ListPanel();
		add(myListPanel, BorderLayout.CENTER);
		
		
		// TODO
		// add detailpanel
		myDetailPanel = new DetailPanel();
		add(myDetailPanel, BorderLayout.PAGE_END);
		// connect list with detail via Listern
		myListPanel.getList().addListSelectionListener(myDetailPanel);
    	setVisible(true);

	}


}

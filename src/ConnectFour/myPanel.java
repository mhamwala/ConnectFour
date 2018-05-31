package ConnectFour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myPanel extends JPanel implements ActionListener {

	private JLabel[] connectGrid = new JLabel[43];
	private JButton[] buttonGrid = new JButton[8];
	private JPanel buttonPanel;
	private JPanel gridPanel;
	private JLabel connect;
	private JLabel button;
	
	private Dimension connectDimen;
	private Dimension gridDimen;
	private Dimension buttonDimen;
	private Dimension butDimen;
	
	myPanel()
	{
		this.setLayout(new BorderLayout());
		
		connectDimen = new Dimension(800, 600);
		buttonDimen = new Dimension(700, 70);
		butDimen = new Dimension(700, 50);
		gridDimen = new Dimension(700, 490);
		
		buttonPanel = new JPanel();
		gridPanel = new JPanel();
		connect = new JLabel();
		button = new JLabel();
		
		//GridLayout columns = new GridLayout(4,4);

		gridPanel.setOpaque(true);
		gridPanel.setPreferredSize(connectDimen);
		gridPanel.setBackground(Color.darkGray);
		
		buttonPanel.setOpaque(true);
		buttonPanel.setPreferredSize(buttonDimen);
		buttonPanel.setBackground(Color.DARK_GRAY);
		
		connect.setPreferredSize(gridDimen);
		connect.setBackground(Color.white);
		connect.setLayout(new GridLayout(6, 7, 2, 2));
		//Loop for the connect four grid
		for(int i = 1; i < 43; i++) {
			connectGrid[i] = new JLabel(""+i);
			connectGrid[i].setBackground(Color.gray);
			connectGrid[i].setOpaque(true);
			connect.add(connectGrid[i]);
		}
		connect.setOpaque(true);
		
		button.setPreferredSize(butDimen);
		button.setBackground(Color.cyan);
		button.setLayout(new GridLayout(1, 7, 2, 2));
		for(int i = 1; i < 8; i++) {
			buttonGrid[i] = new JButton(""+i);
			buttonGrid[i].setBackground(Color.gray);
			buttonGrid[i].setOpaque(true);
			button.add(buttonGrid[i]);
		}
		button.setOpaque(true);
		
		buttonPanel.add(button, BorderLayout.CENTER);
		gridPanel.add(connect, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.NORTH);
		this.add(gridPanel, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

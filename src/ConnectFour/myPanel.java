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

	JLabel[] connectGrid = new JLabel[16];
	JButton addPiece;
	
	myPanel()
	{
		this.setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		JPanel gridPanel = new JPanel();
		JLabel connect = new JLabel();
		
		GridLayout columns = new GridLayout(4,4);

		Dimension bGridPanel = new Dimension(100, 400);
		Dimension cGridPanel = new Dimension(500, 100);
		Dimension grid = new Dimension(400, 200);
		
		buttonPanel.setOpaque(true);
		buttonPanel.setPreferredSize(cGridPanel);
		buttonPanel.setBackground(Color.lightGray);
		
		gridPanel.setOpaque(true);
		gridPanel.setPreferredSize(bGridPanel);
		gridPanel.setBackground(Color.darkGray);
		
		connect.setPreferredSize(grid);
		connect.setBackground(Color.white);
		connect.setLayout(new GridLayout(4, 4, 2, 2));
		//Loop for the connect four grid
		for(int i = 0; i < 42; i++) {
			connectGrid[i] = new JLabel();
			connectGrid[i].setBackground(Color.BLACK);
			connectGrid[i].setOpaque(true);
			connect.add(connectGrid[i]);
			
		}
		connect.setOpaque(true);
		
		gridPanel.add(connect);
		this.add(buttonPanel, BorderLayout.NORTH);
		this.add(gridPanel, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

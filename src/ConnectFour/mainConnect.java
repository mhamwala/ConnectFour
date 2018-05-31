package ConnectFour;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class mainConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 JFrame home = new JFrame("Connect Four");
		 //myPanel connectPanel = new myPanel();
		 
		 home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 home.setBackground(Color.BLACK);
		 home.setSize(800, 600);
		 home.setVisible(true);
		 //home.add(connectPanel, BorderLayout.CENTER);
}
}
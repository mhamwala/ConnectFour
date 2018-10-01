package ConnectFour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class mainConnect {

	public static void main(String[] args) {
		 JFrame home = new JFrame("Connect Four");
		 myPanel connectPanel = new myPanel();
		 
		 home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 home.setLayout(new BorderLayout());
		 home.setBackground(Color.BLACK);
		 home.setPreferredSize(new Dimension(900, 700));
		 home.pack();
		 home.setVisible(true);
		 home.add(connectPanel, BorderLayout.CENTER);
}
}
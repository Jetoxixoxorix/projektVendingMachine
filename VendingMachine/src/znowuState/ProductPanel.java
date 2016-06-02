package znowuState;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductPanel extends JPanel implements ActionListener {
	
	
	private JButton colaButton;
	private JButton batonButton;
	private JButton gumaButton;
	
	
	public ProductPanel() {
		colaButton = new JButton("Cola");
		batonButton = new JButton("Baton");
		gumaButton = new JButton("Guma");
		
		
		colaButton.addActionListener(this);
		batonButton.addActionListener(this);
		gumaButton.addActionListener(this);
	
		add(colaButton);
		add(batonButton);
		add(gumaButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source==colaButton) {
			
		}
		
		else if (source==batonButton){
			
		}
		
		else if (source==gumaButton){
			
		}	
	}
}

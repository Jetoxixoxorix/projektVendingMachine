package znowuState;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProductPanel extends JPanel implements ActionListener {
	
	
	private JButton colaButton;
	private JButton batonButton;
	private JButton gumaButton;
	
	
	public ProductPanel() {
		colaButton = new JButton("Cola - 1.50");
		batonButton = new JButton("Baton - 2");
		gumaButton = new JButton("Guma - 0.50");

		
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

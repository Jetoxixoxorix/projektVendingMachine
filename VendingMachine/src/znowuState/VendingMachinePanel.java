package znowuState;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VendingMachinePanel extends JPanel implements ActionListener {
	public static final int HEIGHT = 800;
	public static final int WIDTH = 400;
	private JButton colaButton;
	private JButton batonButton;
	private JButton gumaButton;
	
	public VendingMachinePanel() {
		colaButton = new JButton("Cola");
		batonButton = new JButton("Baton");
		gumaButton = new JButton("Guma");
		
		colaButton.addActionListener(this);
		batonButton.addActionListener(this);
		gumaButton.addActionListener(this);
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
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

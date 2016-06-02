package znowuState;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	public Frame(){
		super("Vending Machine");
		
		JPanel vendingMachinePanel = new VendingMachinePanel();
		add(vendingMachinePanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		}
	}


package znowuState;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuantityPanel extends JPanel {
	private JLabel colaQuanity;
	private JLabel batonQuantity;
	private JLabel gumaQuantity;
	
	public QuantityPanel(){
		
		colaQuanity = new JLabel("Ilosc coli :");
		batonQuantity = new JLabel("   Ilosc batonow:");
		gumaQuantity = new JLabel("   Ilosc gum: ");
		
		add(colaQuanity);
		add(batonQuantity);
		add(gumaQuantity);
	}
}

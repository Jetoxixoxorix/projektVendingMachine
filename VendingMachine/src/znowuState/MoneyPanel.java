package znowuState;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyPanel extends JPanel implements ActionListener {
	private JTextField moneyField;
	private JButton acceptButton;
	
	
	
	public MoneyPanel(){
		moneyField = new JTextField("Money");
		acceptButton = new JButton("Accept");
	
		acceptButton.addActionListener(this);
		
		add(moneyField);
		add(acceptButton);
	}
	public String getMoney(){
		return moneyField.getText();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	/*	Object source = e.getSource();
		if (source==acceptButton){
			ProductPanel.getMoney();
		}
		*/
	}
	
	
}

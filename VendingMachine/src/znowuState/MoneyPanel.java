package znowuState;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyPanel extends JPanel implements ActionListener {
	private JTextField moneyField;
	private JButton acceptButton;
	private JLabel moneyMoneyMoney;
	private JButton ejectButton;
	
	public MoneyPanel(){
		moneyField = new JTextField("Money");
		acceptButton = new JButton("Accept");
		moneyMoneyMoney = new JLabel("Money: ");
		ejectButton = new JButton("Eject");
	
		acceptButton.addActionListener(this);
		moneyField.setSize(100, 100);
		add(moneyField);
		add(acceptButton);
		add(moneyMoneyMoney);
		add(ejectButton);
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
		else if (source==ejectButton){
		
		}
		*/
	}
	
	
}

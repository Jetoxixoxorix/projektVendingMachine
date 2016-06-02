package znowuState;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyPanel extends JPanel implements ActionListener {
	private static JTextField moneyField;
	private JButton acceptButton;
	private JLabel moneyMoneyMoney;
	private JButton ejectButton;
	String kox = "0";
	
	public MoneyPanel(){
		moneyField = new JTextField("     ");
		acceptButton = new JButton("Accept");
		moneyMoneyMoney = new JLabel("Money: " + kox);
		ejectButton = new JButton("Eject");
	
		acceptButton.addActionListener(this);
	
		add(moneyField);
		add(acceptButton);
		add(moneyMoneyMoney);
		add(ejectButton);
	}
	public static String getMoney(){
		return moneyField.getText();
	}
	
	/*public static String moneyHaschanged(){
		
	}*/
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
		if (source==acceptButton){
			kox = MoneyPanel.getMoney();
			System.out.println(kox);
		}
		else if (source==ejectButton){
		
		}
		
	}
	
	
}

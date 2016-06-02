package znowuState;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class VendingMachine {
	
	private MoneyPanel moneyPanel;
	private ProductPanel productPanel;
	
	State stockState;
	State depositState;
	int count = 0;
	State state;
	double cash;
	
	
	
	public VendingMachine(double cash) {
		JFrame frame = new JFrame(this.getClass().toString());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LayoutManager lay = new GridLayout(2, 0);
		frame.setLayout(lay);

		moneyPanel = new MoneyPanel();
		productPanel = new ProductPanel();
		
		frame.add(moneyPanel);
		frame.add(productPanel);
		

		//moneyPanel.setFocusable(true);
		frame.pack();
		frame.setVisible(true);
	
		
		this.cash = cash;
		stockState = new StockState(this);
		depositState = new DepositState(this);
		state = depositState;
	}
	
	
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
		state.dispense();
	}
	
	public void ejectMoney(){
		state.ejectMoney();
	}
	
	
	public void setState(State state) {
		this.state = state; 
	}
	public State getStockState() {
		return stockState; 
	}
	public State getDepositState() {
		return depositState; 
	}
	public void releaseProduct() {
		
	}

}

package znowuState;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class VendingMachine {
	
	private MoneyPanel moneyPanel;
	private ProductPanel productPanel;
	private QuantityPanel quantityPanel;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 400;
	State stockState;
	State depositState;
	State state;
	double cash;
	
	
	/*public VendingMachine(double cash) {*/
	public VendingMachine() {
		/*JFrame frame = new JFrame(this.getClass().toString());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LayoutManager lay = new GridLayout(3, 0);
		frame.setLayout(lay);
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

		moneyPanel = new MoneyPanel();
		productPanel = new ProductPanel();
		quantityPanel = new QuantityPanel();
		
		frame.add(moneyPanel);
		frame.add(productPanel);
		frame.add(quantityPanel);
		
		frame.pack();
		frame.setVisible(true);
	*/
		
		/*this.cash = cash;*/
		stockState = new StockState(this);
		depositState = new DepositState(this);
		state = depositState;
	}
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
	}
	
	public void ejectMoney(){
		state.ejectMoney();
	}
	/*public void dispense(){
		state.dispense();
	}*/
	
	
	public void setState(State state) {
		this.state = state; 
	}
	public State getStockState() {
		return stockState; 
	}
	public State getDepositState() {
		return depositState; 
	}
	
}

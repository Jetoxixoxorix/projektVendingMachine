package znowuState;

public class VendingMachine {
	
	State stockState;
	State depositState;
	int count = 0;
	State state;
	double cash;
	
	public VendingMachine(double cash) {
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

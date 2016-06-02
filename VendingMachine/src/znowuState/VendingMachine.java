package znowuState;

public class VendingMachine {
	
	State stockState;
	State depositState;

	
	public VendingMachine() {

		stockState = new StockState(this);
		depositState = new DepositState(this);
	}
	
	int count = 0;
	State state = depositState;
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
		state.dispense();
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

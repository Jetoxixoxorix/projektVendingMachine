package znowuState;

public class VendingMachine {
	
	State stockState;
	State depositState;
	int count = 0;
	State state;

	public VendingMachine() {
		stockState = new StockState(this);
		depositState = new DepositState(this);
		state = depositState;
	}
	
	
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct(double cash) {
		state.pickProduct(cash);
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
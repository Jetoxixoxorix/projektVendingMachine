package znowuState;


public class DepositState implements State {

	VendingMachine vendingMachine;
	
	public DepositState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("Wrzuc hajs biedaku!");
		vendingMachine.setState(vendingMachine.getStockState());
	}

	@Override
	public void ejectMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

	
}

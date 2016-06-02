package znowuState;


public class DepositState implements State {

	VendingMachine vendingMachine;
	
	public DepositState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("Current balance: " + Test.cash);
		vendingMachine.setState(vendingMachine.getStockState());
		
	}

	@Override
	public void ejectMoney() {
		System.out.println("You ejected your money from depositstate");
		
	}

	@Override
	public void pickProduct() {
		System.out.println("Pick your product");	
		vendingMachine.setState(vendingMachine.getStockState());
	}

	@Override
	public void dispense() {
		System.out.println("You have to insert money first");
		vendingMachine.insertMoney();
	}

	
}

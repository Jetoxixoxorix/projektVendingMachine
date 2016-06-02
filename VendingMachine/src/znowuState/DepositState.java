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
		System.out.println("You ejected your money from depositstate");
		
	}

	@Override
	public void pickProduct() {
		System.out.println("pick your product from depositstate");	
		vendingMachine.setState(vendingMachine.getStockState());
	}

	@Override
	public void dispense() {
		System.out.println("dispense from depositstate");		
	}

	
}

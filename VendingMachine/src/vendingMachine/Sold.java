package vendingMachine;


public class Sold implements State {

	VendingMachine vendingMachine;
	
	public Sold(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertMoney() {
		System.out.print("Please wait, we're already giving you your product");		
		
	}

	@Override
	public void pickProduct() {
		System.out.print("You can pick one product at once");
		
	}

	@Override
	public void dispense() {
		vendingMachine.releaseProduct();
	if (vendingMachine.getCount() > 0) {
		vendingMachine.setState(vendingMachine.getHasMoneyState());
	} 
	}

	@Override
	public void ejectMoney() {
		// TODO Auto-generated method stub
		
	}
}
package vendingMachine;


public class HasMoney implements State {
	VendingMachine vendingMachine;
	
	
	public HasMoney(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	@Override
	public void insertMoney() {
		
	}

	@Override
	public void pickProduct() {
		System.out.print("Pick your product");
		if (int x > productID.getQuantity()) {
		vendingMachine.setState(vendingMachine.getSold());
		//tutaj od razu zmiana zapasu czy dalej ??
		} else {
			vendingMachine.setState(vendingMachine.noProduct());
		}
	}

	@Override
	public void dispense() {
		System.out.print("You have to pick your product first");
	}
	@Override
	public void ejectMoney() {
		// TODO Auto-generated method stub
		
	}

}

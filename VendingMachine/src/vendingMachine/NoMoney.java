package vendingMachine;

public class NoMoney implements State {
	VendingMachine vendingMachine;
	
	public NoMoney(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	@Override
	public void insertMoney() {
		System.out.print("You need to insert money to buy your product");
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
package znowuState;



public class StockState implements State {

	VendingMachine vendingMachine;
	
	int zapasCola = 5;
	int zapasBaton = 5;
	int zapasGuma = 10;
	
	public StockState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	//COLA
	public void setZapasCola(int zapasCola) {
		this.zapasCola = zapasCola;
	}
	public int getZapasCola(){
		return zapasCola;
	}
	
	//BATON
	public void setZapasBaton(int zapasBaton) {
		this.zapasBaton = zapasBaton;
	}
	public int getZapasBaton(){
		return zapasBaton;
	}
	
	//GUMA
	public void setZapasGuma(int zapasGuma) {
		this.zapasGuma = zapasGuma;
	}
	public int getZapasGuma(){
		return zapasGuma;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("You can't insert more money now");
	}

	@Override
	public void ejectMoney() {
		System.out.println("You ejected your money from VendingMachine");		
	}
	
	Product product = new Product(0,0);
	Product cola = new Product(getZapasCola(), 2.50);
	Product baton = new Product(getZapasBaton(), 1.00);
	Product guma = new Product(getZapasGuma(), 0.50);
	
	@Override
	public void pickProduct() {
		if (Test.towar == 1) {
			if (Test.cash >= cola.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.setState(vendingMachine.getDepositState());
				vendingMachine.insertMoney();
			}
		}
		else if (Test.towar == 2) {
			if (Test.cash >= baton.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.setState(vendingMachine.getDepositState());
			}
		}
		else if (Test.towar == 3) {
			if (Test.cash >= guma.getPrice()) {
				dispense();
			} else {
				System.out.println("Not enough money. Insert more money");
				vendingMachine.setState(vendingMachine.getDepositState());
			}
		}
		
	}

	@Override
	public void dispense() {
		if (Test.towar == 1) {
			if (cola.getQuantity() > 0) {
					cola.setQuantity(cola.getQuantity() - 1);
					Test.cash = Test.cash - cola.getPrice();
					System.out.println("Stock: " + cola.getQuantity());
					System.out.println("Current balance: " + Test.cash);
					vendingMachine.setState(vendingMachine.getDepositState());
				} else {
					System.out.println("out of stock. Pick other product");
					vendingMachine.setState(vendingMachine.getDepositState());
					vendingMachine.insertMoney();
				}
		}
		else if (Test.towar == 2) {
			if (baton.getQuantity() > 0) {
					baton.setQuantity(baton.getQuantity() - 1);
					Test.cash = Test.cash - baton.getPrice();
					System.out.println("Stock: " + baton.getQuantity());
					System.out.println("Current balance: " + Test.cash);
					vendingMachine.setState(vendingMachine.getDepositState());
				} else {
					System.out.println("out of stock. Pick other product");
					vendingMachine.setState(vendingMachine.getDepositState());
					vendingMachine.insertMoney();
				}
		}
		if (Test.towar == 3) {
			if (guma.getQuantity() > 0) {
					guma.setQuantity(guma.getQuantity() - 1);
					Test.cash = Test.cash - guma.getPrice();
					System.out.println("Stock: " + guma.getQuantity());
					System.out.println("Current balance: " + Test.cash);
					vendingMachine.setState(vendingMachine.getDepositState());
				} else {
					System.out.println("out of stock. Pick other product");
					vendingMachine.setState(vendingMachine.getDepositState());
					vendingMachine.insertMoney();
				}
		}
		
	}

}

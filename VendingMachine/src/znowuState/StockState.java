package znowuState;



public class StockState implements State {

	VendingMachine vendingMachine;
	
	int zapasCola = 20;
	int zapasBaton = 0;
	int zapasGuma = 20;
	
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
		System.out.println("co");
	}

	@Override
	public void ejectMoney() {
		System.out.println("You ejected your money from stockstate");		
	}
	

	Product product = new Product();
	
	
	@Override
	public void pickProduct() {
		if (Test.cash >= product.getPrice()) {
			if (product.getQuantity() > 0) {
				product.setQuantity(product.getQuantity() - 1);
				Test.cash = Test.cash - product.getPrice();
				System.out.println("Stock: " + product.getQuantity());
				System.out.println("Current balance: " + Test.cash);
				vendingMachine.setState(vendingMachine.getDepositState());
			} else {
				System.out.println("out of stock. pick other product");
			}
			
		} else {
			System.out.println("Not enough money. Pick other product");
			vendingMachine.setState(vendingMachine.getDepositState());
		}

		
	}

	// tutaj mozna w sumie to rozbic na dwie petle z if w pickproduct tylko z tym czy test cash>productprice a w dispense juz tak typowo na odjecie produktu z zapasu nie ???? 
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
/*	void releaseProduct() {
		System.out.print("Take your product from the slot");
		if (product == 1) {
			//cola = new Product(zapasCola);
			if (zapasCola > 0) {
				zapasCola = zapasCola - 1;
				setState(getHasMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}
		if (product == 2) {
			baton = new Product(zapasBaton);
			if (zapasBaton > 0) {
				zapasBaton = zapasBaton - 1;
				setState(getHasMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}
		if (product == 3) {
			guma = new Product(zapasGuma);
			if (zapasGuma > 0) {
				zapasGuma = zapasGuma - 1;
				setState(getHasMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}*/

}

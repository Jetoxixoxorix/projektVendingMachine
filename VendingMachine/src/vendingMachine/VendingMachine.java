package vendingMachine;

/*
public class VendingMachine {

	State noMoney;
	State hasMoney;
	State noProduct;
	State hasProduct;
	State sold;
	
	State state = noMoney;
	int count = 0;
	
	public VendingMachine(int productQuantity) {
		noMoney = new NoMoney(this);
		hasMoney = new HasMoney(this);
		this.count = productQuantity;
		if (productQuantity > 0) {
			state = noMoney;
		}
	}
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	void releaseProduct() {
		System.out.print("Take your product from the slot");
		if (count > 0) {
			count = count - 1;
		}
	}
	
	public int getCount(){
		return count;
	}
	//getter dla kazedo stanu trzeba
	public void setNoMoney(){
		state.getNoM
	}
}
*/

// moje zmiany
public class VendingMachine{

	State noMoney;
	State hasMoney;
	State noProduct;
	State hasProduct;
	State sold;
	Product cola;
	Product baton;
	Product guma;
	
	int product;
	
	final String COLA = "1";
	
	int zapasCola = 20;
	int zapasBaton = 20;
	int zapasGuma = 20;
	
	int count = 0;
	State state = noMoney;
	
	public VendingMachine() {
		noMoney = new NoMoney(this);
		hasMoney = new HasMoney(this);
		sold = new Sold(this);
	}
	
	public void insertMoney() {
		state.insertMoney();
	}
	
	public void pickProduct() {
		state.pickProduct();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	void releaseProduct() {
		System.out.print("Take your product from the slot");
		if (product == 1) {
			cola = new Product(20);
			if (zapasCola > 0) {
				zapasCola = zapasCola - 1;
				setState(getNoMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}
		if (product == 2) {
			baton = new Product(20);
			if (zapasBaton > 0) {
				zapasBaton = zapasBaton - 1;
				setState(getNoMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}
		if (product == 3) {
			guma = new Product(20);
			if (zapasGuma > 0) {
				zapasGuma = zapasGuma - 1;
				setState(getNoMoneyState());
			}
			else {
				System.out.print("Out of stock. Pick other product");
				setState(getHasMoneyState());
			}
		}
		/*if (cola.getCount() > 0) {
			cola.setCount(cola.getCount() - 1);
			setState(getNoMoneyState());
		}*/
		
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount(){
		return count;
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
	public void setZapasGuma(int zapasGumaa) {
		this.zapasGuma = zapasGuma;
	}
	public int getZapasGuma(){
		return zapasGuma;
	}
	
	
	public State getNoMoneyState() {
		return noMoney; 
	}
	public State getHasMoneyState() {
		return hasMoney; 
	}
	public State getNoProductState() {
		return noProduct; 
	}
	public State getHasProductState() {
		return hasProduct; 
	}
	public State getSoldState() {
		return sold; 
	}
	
}



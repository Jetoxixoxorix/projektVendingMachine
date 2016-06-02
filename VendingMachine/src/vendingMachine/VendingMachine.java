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

	State hasMoney;
	State noProduct;
	State hasProduct;
	State sold;
	Product cola;
	Product baton;
	Product guma;
	
	int product;
	double money;
	
	final String COLA = "1";
	
	int zapasCola = 20;
	int zapasBaton = 0;
	int zapasGuma = 20;
	
	int count = 0;
	State state;
	
	public VendingMachine(double money) {

		hasMoney = new HasMoney(this);
		sold = new Sold(this);
		this.money = money;
		state = hasMoney;
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
			cola = new Product(zapasCola);
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
	
	public void setMoney(double money){
		this.money = money;
	}
	
	public double getMoney(){
		return money;
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



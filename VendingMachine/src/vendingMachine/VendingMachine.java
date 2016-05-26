package vendingMachine;


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
	/*public void setNoMoney(){
		state.getNoM
	}*/
}


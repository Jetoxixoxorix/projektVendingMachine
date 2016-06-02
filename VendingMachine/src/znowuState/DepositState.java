package znowuState;

import java.util.Scanner;

public class DepositState implements State {
	public static double money;
	public static double allCash;
	
	VendingMachine vendingMachine;
	
	public DepositState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("Wrzuc hajsy");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextDouble();
		allCash += money;
    	/*allCash = Test.cash + money;*/
		System.out.println("Current balance: " + allCash);
		if (allCash > 0){
			vendingMachine.setState(vendingMachine.getStockState());
		}
		else{
			System.out.println("There is no money in Vending Machine!");
		}
		
	}

	@Override
	public void ejectMoney() {
		/*System.out.println("You ejected your money from depositstate");*/
		/*Test.cash = 0;*/
		/*vendingMachine.insertMoney();*/
		System.out.println("There is no money to eject");
	}

	@Override
	public void pickProduct() {
		/*System.out.println("Pick your product");*/
		System.out.println("Insert some money first!");
		/*vendingMachine.setState(vendingMachine.getStockState());*/
	}

	@Override
	public void dispense() {
		System.out.println("You have to insert money and choose product");
		/*vendingMachine.insertMoney();*/
	}

	
}

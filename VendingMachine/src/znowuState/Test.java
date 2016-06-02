package znowuState;

import java.util.Scanner;

public class Test {
	
	public static double cash;
	public static int towar;

	public static void main(String[] args) {

		

	    System.out.println("insert money and pick your product");    

        Scanner scanner = new Scanner(System.in);
    	double startMoney = scanner.nextInt();  
     	
    	
    	VendingMachine vendingMachine = new VendingMachine(startMoney);
	    
	    cash = startMoney;
     	vendingMachine.insertMoney();

	    System.out.println("pick your product: 1 - cola, 2 - baton, 3 - guma");    

        Scanner scanner2 = new Scanner(System.in);
    	int firstProduct = scanner.nextInt();  
    	towar = firstProduct;
    	
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.ejectMoney();
    	
    	
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    
    	
  
  
	}
	
}

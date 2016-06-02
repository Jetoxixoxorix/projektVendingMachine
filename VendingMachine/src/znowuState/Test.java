package znowuState;

import java.util.Scanner;

public class Test {
	
	public static double cash;

	public static void main(String[] args) {

		

	    System.out.println("insert money and pick your product");    

        Scanner scanner = new Scanner(System.in);
    	double startMoney = scanner.nextInt();  
     	
    	
    	VendingMachine vendingMachine = new VendingMachine(startMoney);
	    
	    cash = startMoney;
     	vendingMachine.insertMoney();
    	
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	vendingMachine.pickProduct();
    	System.out.println(cash);
  
  
	}
	
}

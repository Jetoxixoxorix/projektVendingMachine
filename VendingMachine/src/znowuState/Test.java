package znowuState;

import java.util.Scanner;

public class Test {
	
	/*public static double cash;*/
	/*public static int towar;*/

	public static void main(String[] args) {

	    System.out.println("Insert money and pick your product!");    

        /*Scanner scanner = new Scanner(System.in);
    	double startMoney = scanner.nextDouble();  
     	*/
    	
    	/*VendingMachine vendingMachine = new VendingMachine(startMoney);*/
    	VendingMachine vendingMachine = new VendingMachine();
	    
	    /*cash = startMoney;*/
     	

	/*    System.out.println("pick your product: 1 - cola, 2 - baton, 3 - guma");    

        Scanner scanner2 = new Scanner(System.in);
    	int firstProduct = scanner2.nextInt();  
    	towar = firstProduct;*/
    	
    	vendingMachine.insertMoney();
    	vendingMachine.pickProduct();
    	
    	
  
	}
	
}

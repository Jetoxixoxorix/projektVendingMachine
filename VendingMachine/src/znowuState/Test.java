package znowuState;

import java.util.Scanner;

public class Test {
	
public static double mamona; 

	public static void main(String[] args) {

		 	
		VendingMachine vendingMachine = new VendingMachine();
	        
     	vendingMachine.insertMoney();
        Scanner scanner = new Scanner(System.in);
    	double hajs = scanner.nextInt();  
     	
    	System.out.println("Wrzucona kwota:\n"+ hajs);
    	
     	vendingMachine.pickProduct(hajs);
     	hajs = mamona;
    	vendingMachine.pickProduct(hajs);
    	vendingMachine.pickProduct(hajs);
    	vendingMachine.pickProduct(hajs);
    	vendingMachine.pickProduct(hajs);
    	vendingMachine.pickProduct(hajs);
    	vendingMachine.pickProduct(hajs);
  
  
	}

}

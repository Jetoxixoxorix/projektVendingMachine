package znowuState;

import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) {
		String command;
	    System.out.println("Insert money and pick your product!");    
        Scanner scanner = new Scanner(System.in);
    	int count = 0;
        VendingMachine vendingMachine = new VendingMachine();
        
   
        finish:
        while(count >= 0){
        	System.out.println("What you are gonna do? (i - insert money, p - pick product, e - eject money, q - quit)");
        	command = scanner.nextLine();
        	switch (command.charAt(0)){
	        	case 'i':
	        		vendingMachine.insertMoney();
	        		break;
	        	case 'p':
	        		vendingMachine.pickProduct();
	        		break;
	        	case 'e':
	        		vendingMachine.ejectMoney();
	        		break;
	        	case 'q':
	        		break finish;
        	}
        	count++;
        }
	}
	
}

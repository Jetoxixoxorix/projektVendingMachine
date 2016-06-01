package vendingMachine;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Witaj, wrzurz hajs a nastepnie wybierz produkt:\n");
	        
	        VendingMachine vendingMachine = new VendingMachine(12);
	        
	        	System.out.println("Wrzucona kwota:\t" + vendingMachine.getMoney());
	        	
//	        	System.out.println(vendingMachine.getCount());
//	        	vendingMachine.insertMoney();
//	        	vendingMachine.pickProduct();
	        	

	        	System.out.println("Wybierz produkt:\n"+"1 - cola, 2 - baton, 3 - guma");
	        	int product = scanner.nextInt();
	        	if (product == 1) {
	        		System.out.println("Wybrales cole");
	        		// sprawdzamy czy jest na stanie
	        		if (vendingMachine.getZapasCola() > 0) {
	        			vendingMachine.setZapasCola(vendingMachine.getZapasCola()-1);
	        			System.out.println("Nowa ilosc: " + vendingMachine.getZapasCola());
	        		} else {
	        			System.out.print("Brak towaru");
	        		}
	        		
	        		//jesli jest to robimy dispense a potem aktualizujemy o 1 zapas	
	        	}	        	
	        	
	        	//tylko to jest lipa bo to powinno byc jakby w metodzie zrobione typu baton.releaseProduct(); tylko jak to zrobic ?

	        	if (product == 2) {
	        		System.out.println("Wybrales baton");
	        		// sprawdzamy czy jest na stanie
	        		if(vendingMachine.getZapasBaton() > 0){
	        			vendingMachine.setZapasBaton(vendingMachine.getZapasBaton()-1);
	        			System.out.println("Nowa ilosc: " + vendingMachine.getZapasBaton());
	        		} else {
	        			System.out.println("Brak towaru");
	        		}
	        		
	        		//jesli jest to robimy dispense a potem aktualizujemy o 1 zapas	
	        	}
	        	if (product == 3) {
	        		System.out.println("Wybrales gume");
	        		// sprawdzamy czy jest na stanie
	        		vendingMachine.releaseProduct();
	        		System.out.println(vendingMachine.getZapasGuma());
	        		//jesli jest to robimy dispense a potem aktualizujemy o 1 zapas	
	        	}
		
	        } 
	        
	}



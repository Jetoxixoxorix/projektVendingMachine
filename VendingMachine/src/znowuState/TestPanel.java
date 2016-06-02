package znowuState;

import java.awt.EventQueue;

public class TestPanel {
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable(){

				@Override
				public void run() {
					new VendingMachine();
				}
			});
		}
	}
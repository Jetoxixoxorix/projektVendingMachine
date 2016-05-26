package vendingMachine;


public interface State {

	//tu dajemy metody  takie ogolne, ze bedzie wrzucanie hajsu itd.
	public void insertMoney();
	public void pickProduct();
	public void dispense();
}

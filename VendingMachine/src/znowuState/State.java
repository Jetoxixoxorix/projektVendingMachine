package znowuState;

public interface State {

	public void insertMoney();
	public void ejectMoney();
	public void pickProduct(double cash);
	public void dispense();
}

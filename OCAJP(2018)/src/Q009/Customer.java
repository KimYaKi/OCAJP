package Q009;

public class Customer {
	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kwh) {
		acct.addKwh(kwh);
	}
}

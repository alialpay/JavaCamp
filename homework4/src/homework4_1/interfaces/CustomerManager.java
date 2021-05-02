package homework4_1.interfaces;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		// iþ kodlarý
		customerDal.add();
		
	}
}

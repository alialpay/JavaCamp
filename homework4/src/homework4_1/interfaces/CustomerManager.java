package homework4_1.interfaces;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		// i� kodlar�
		customerDal.add();
		
	}
}

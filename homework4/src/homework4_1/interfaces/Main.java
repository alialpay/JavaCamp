package homework4_1.interfaces;

public class Main {

	public static void main(String[] args) {
		
		 //CustomerDal customerDal = new OracleCustomerDal();

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
	}

}

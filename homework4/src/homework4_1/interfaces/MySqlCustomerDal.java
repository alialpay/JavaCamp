package homework4_1.interfaces;

public class MySqlCustomerDal implements CustomerDal, Repository{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}

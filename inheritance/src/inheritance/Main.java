package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer ali = new IndividualCustomer();
		ali.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "456118";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";

		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(ali);
//		customerManager.add(abc);

		Customer[] customers = { ali, abc, hepsiBurada };
		customerManager.addMultiple(customers);

	}

}

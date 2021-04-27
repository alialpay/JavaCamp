package homework2_2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop", 3000, 2,"Siyah");
		Product product2 = new Product();
		product2.setName("Mouse");
		product2.setId(2);
		product2.setDescription("Kablosuz");
		product2.setPrice(500);
		product2.setStockAmount(35);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

	}

}

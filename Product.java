package static_Factory_Method;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	public static Product  createProduct(int productId, String productName, double price, int quantity)
	{
		
		return new Product(productId,productName,price,quantity);
	}
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public double calculateTotalAmount()
	{
		int totalAmount=(int)price*quantity;
		int discount=0;
		if(totalAmount>1000)
		{
			discount=(totalAmount*10/100);
		}
		else if(totalAmount>500) 
		{
			discount=(totalAmount*10/100);

		}
		
		double totalPrice=totalAmount-discount;
		return totalPrice;

	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", totalPrice=" + calculateTotalAmount() + "]";
	}
	


}

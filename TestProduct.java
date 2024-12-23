package static_Factory_Method;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ask the user how many Product objects:");  
		Scanner sc=new Scanner(System.in);
		int numbers=sc.nextInt();
		for(int i=1;i<=numbers;i++)
		{
			System.out.println("enter product id:");
			int productId=sc.nextInt();
			System.out.println("enter productName:");
			String productName=sc.next();
			System.out.println("enter price:");
			double price=sc.nextDouble();
			System.out.println("enter quantity:");
			int quantity=sc.nextInt();
			Product p=Product.createProduct(productId,productName,price,quantity);
			System.out.println(p);
			
		}
		sc.close();
		

	}

}

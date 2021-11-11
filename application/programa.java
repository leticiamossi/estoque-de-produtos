package orientacao_objetos_exemplo02.application;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos_exemplo02.entities.Product;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Price: ");
		double price = Double.parseDouble(sc.nextLine());
		System.out.printf("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product x = new Product(name, price); 
		
		x.addProducts(quantity);
		System.out.println("Product data: " + x.toString());  //".toString" foi um método customizado na classe Product
		
		System.out.printf("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		x.addProducts(quantity);
		System.out.println("\nUpdate data: " + x.toString());
		
		System.out.printf("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		x.removeProducts(quantity);
		System.out.println("\nUpdate data: " + x.toString());
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		product.name = input.nextLine();
		product.price = input.nextDouble();
		product.quantity = input.nextInt();
		
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f\n", product.name, product.price , product.quantity, product.total());
		
		System.out.println("Enter the number of product to be added in stock:");
		int alterQuantity = input.nextInt();
		product.addProducts(alterQuantity);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f\n", product.name, product.price , product.quantity, product.total());

		System.out.println("Enter the number of product to be removed from stock:");
		alterQuantity = input.nextInt();
		product.removeProducts(alterQuantity);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f\n", product.name, product.price , product.quantity, product.total());
		
		input.close();

	}

}
/*
%f = ponto flutuante
%d = inteiro
%s = texto */
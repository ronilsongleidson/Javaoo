package br.com.javaoo.semoo;

import br.com.javaoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product p = new Product();
        p.setName(scanner.next());
        p.setPrice(scanner.nextInt());
        p.setQuantity(scanner.nextInt());
        p.addProducts(scanner.nextInt());

        System.out.println("Enter Product data");
        System.out.println("Name : " + p.getName());
        System.out.println("Price : " + p.getPrice());
        System.out.println("quantity : " + p.getQuantity());
        System.out.println();
        p.addProducts(scanner.nextInt());
        System.out.println("Product data: " + p.getName() + ","+ " $ " + p.getPrice()+ "," + p.getQuantity()+ " units" + "," + " Total: $ " + p.totalValueInStok());
        System.out.println();
        System.out.println("Enter the number of de products to be added in stok: ");
        System.out.println("Update data: " + p.getName() + ","+ " $ " + p.getPrice()+ "," + p.getQuantity()+ " units" + "," + " Total: $ " + p.totalValueInStok());
        System.out.println("Enter the number of de products to be remove in stok: ");
        p.removeProducts(scanner.nextInt());
        System.out.println("Update data: " + p.getName() + ","+ " $ " + p.getPrice()+ "," + p.getQuantity()+ " units" + "," + " Total: $ " + p.totalValueInStok());

    }
}

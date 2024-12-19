package exercicioPolimorfismo;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException { //na parte do date o java pediu pra colocar o throws
		// TODO Auto-generated method stub
		int productNumber;
		List<Product> productList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products:");
		productNumber = sc.nextInt();		
		for (int i=1;i<=productNumber;i++) {
			System.out.println("Common, used or imported?");
			char cr = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine(); //aquela linhazinha marota pra dar certo o nextLine
			String name = sc.nextLine();
			System.out.println("Price");
			Double price = sc.nextDouble();
			switch (cr) {
				case 'c':
					productList.add(new Product(name, price));					
				break;
				case 'i':
					System.out.println("Enter the customs fee:");
					Double custom_fee = sc.nextDouble();
					productList.add(new ImportedProduct(name, price, custom_fee));	
				break;
				case 'u':
					System.out.println("Enter the Manufacture date:(dd/MM/yyyy)");
					LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));					
					
					
					productList.add(new UsedProduct(name, price, date));	
				break;
				}		
			}
		for(Product product : productList) {
			System.out.println(product.price_tag());
		}

	}

}

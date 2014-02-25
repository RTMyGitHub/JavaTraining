package com.training.corejava.movie;

import java.util.Scanner;

public class MovieStore {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();

		System.out.println("Welcome to Blockbuster!!");
		System.out
				.println("Please enter your movie name,type (BlueRay/DVD) and number of days to rent in a comma separated way");
		System.out.println("Once you are done, type checkout and enter");

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			if(line.equalsIgnoreCase("checkout"))
			{
				break;
			}

			String[] tokens = line.split(",");

			if (tokens.length < 3) {
				System.out.println("Invalid input provided");
			} else {
				String movieTitle = tokens[0];
				String movieType = tokens[1];
				int numberOfDays = Integer.parseInt(tokens[2]);

				MovieLibrary library = new MovieLibrary();
				boolean inStock = library.inStock(movieTitle);

				if (!inStock) {
					System.out.println("Sorry, this movie is not available");
				} else {
					cart.add(movieTitle, movieType, numberOfDays);
				}

			}

		}
		
		System.out.println("Please enter your promotion code now..");
		
		while(scanner.hasNext())
		{
			String promotionCode = scanner.next();
			Promotion promotion = null;
			
			try {
				promotion = new Promotions().getPromotion(promotionCode);
			} catch (InvalidPromotionException e) {
				System.out.println("Sorry, but this promotion code is either not valid or expired.");
				System.exit(0);
			}

			InvoiceGenerator generator = new InvoiceGenerator();
			
			String invoice = generator.generate(cart.getRentals(), promotion);
			
			System.out.println("Please find below your invoice.");
			System.out.println(invoice);
			
			System.out.println("Have a good day!!");
			System.exit(0);
		}
		
		scanner.close();
		
	}

}

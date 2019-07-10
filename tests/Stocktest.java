import org.junit.jupiter.api.Test;

import bucketplace.Stock;

public class Stocktest {
	@Test
	void addListTestBoissonNotFound() {
		// Setup
		Stock stock = new Stock();
		String boisson = "Coco";
		Double quantite = 0.25;
		Integer expectedvalue = 0;
		stock.newList();

		// Run
		stock.addList(boisson, quantite);
	}
}

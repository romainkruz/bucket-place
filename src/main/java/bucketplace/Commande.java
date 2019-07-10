package bucketplace;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Commande {
	final static Scanner userInput = new Scanner(System.in);

	void commanderConso() {
		System.out.println("Que voulez-vous commander ?");
		final String choixCommande = userInput.nextLine();
		System.out.println(choixCommande);
		System.out.println("Continuer la commande ? (Oui : 1 / Non : 2)");
		int continuer = userInput.nextInt();
		if (continuer == 1) {
			userInput.nextLine();
			commanderConso();
		}
	}

	public static int Addition(Map<Produits, Double> myEnums) {
		int res = 0;

		int result = 0;
		for (Entry<Produits, Double> entry : myEnums.entrySet()) {
			Produits boisson = entry.getKey();
			Object quantite = entry.getValue();
			res = boisson.getPrix();
			result += res;
		}
		return result;
	}
}

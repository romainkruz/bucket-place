package bucketplace;

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
}

package bucketplace;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	private static final String LOG_MSG_START = "Application launched";
	final static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		LOG.info(LOG_MSG_START);
		System.out.println("Bonjour bienvenu au Bucket Place !");
		System.out.println("Taper 1 pour passer une commande ou taper 2 pour accéder à la carte :");
		final Integer choix = userInput.nextInt();
		Commande commande = new Commande();

		switch (choix) {
		// Dans le case 1, le client connaît déjà la carte donc il fait directement ses
		// choix
		case 1:
			commande.commanderConso();
			break;
		// Dans le case 2, le client ne connaît pas la carte donc on lui affiche la
		// liste des produits disponibles
		case 2:
			for (Produits produits : Produits.values()) {
				System.out.println(produits);
			}
			commande.commanderConso();
			break;
		default:
			break;
		}
	}
}

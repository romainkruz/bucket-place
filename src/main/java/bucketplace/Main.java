package bucketplace;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	private static final String LOG_MSG_START = "Application launched";

	public static void main(String[] args) {
		LOG.info(LOG_MSG_START);
		System.out.println("Bonjour bienvenu au Bucket Place !");

		final Scanner userInput = new Scanner(System.in);
		System.out.println("Taper 1 pour passer une commande ou taper 2 pour accéder à la carte :");
		final Integer choix = userInput.nextInt();

		switch (choix) {
		case 1:

			break;
		case 2:

			break;
		default:
			break;
		}
	}

}

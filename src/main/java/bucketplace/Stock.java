package bucketplace;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class Stock {

	public Map<String, Double> stockDispo = new HashMap<String, Double>();
	public Map<String, Double> list;

	private static String ALCOOL = "Vodka:Whisky:Ricard:BiereBrune:BiereBlonde:BiereBlanche";
	private static String NO_ALCOOL = "Coca:Oasis:JusDeFruit";
	private static String MSG_COMMANDE = "Note : Recommander {0} il ne reste que {1}";

	private void setStockPlein() {
		stockDispo.put("Coca", 5.0);
		stockDispo.put("Oasis", 5.0);
		stockDispo.put("Vodka", 5.0);
		stockDispo.put("Whisky", 5.0);
		stockDispo.put("Ricard", 5.0);
		stockDispo.put("JusDeFruit", 5.0);
		stockDispo.put("BiereBlonde", 5.0);
		stockDispo.put("BiereBrune", 5.0);
		stockDispo.put("BiereBlanche", 5.0);
	}

	private void newList() {
		list = new HashMap<String, Double>();
	}

	private void addList(String boisson, double quantite) {
		if (list.containsKey(boisson)) {
			double quantiteNew = list.get(boisson) + quantite;
			if (quantiteNew <= stockDispo.get(boisson)) {
				list.put(boisson, quantiteNew);
			} else {
				System.out.println("! Cette boisson n'est plus disponible !");
			}
		} else {
			if (quantite <= stockDispo.get(boisson)) {
				list.put(boisson, quantite);
				System.out.println(boisson + "ajouté !");
			} else {
				System.out.println("! Cette boisson n'est plus disponible !");
			}
		}
	}

	private void setStockAfterCommand() {
		for (Map.Entry<String, Double> line : list.entrySet()) {
			stockDispo.put(line.getKey(), line.getValue());
			if (line.getValue() <= 2.5) {
				LOG.info(MessageFormat.format(MSG_COMMANDE, line.getKey(), line.getValue()));
			}
		}
	}
}
package bucketplace;

public enum Produits {
	Coca(10),
	Oasis(10),
	JusDeFruits(10),
	Vodka(40),
	Wisky(40),
	Ricard(40),
	BiereBlanche(25),
	BiereBrune(25),
	BiereBlonde(25);
	
	private final int prix;
	 
	/** Le constructeur qui associe une valeur à l'enum */
	private Produits(int prix) {
		this.prix = prix;
	}
 
	/** La methode accesseur qui renvoit la valeur de l'enum */
	public int getPrix() {
		return this.prix;
	}
	
}

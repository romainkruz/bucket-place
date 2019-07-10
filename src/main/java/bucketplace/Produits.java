package bucketplace;

public enum Produits {
	COCA(10),
	OASIS(10),
	JUSDEFRUITS(10),
	VODKA(40),
	WISCKY(40),
	RICARD(40),
	BIEREBLANCHE(25),
	BIEREBRUNE(25),
	BIEREBLONDE(25);
	
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

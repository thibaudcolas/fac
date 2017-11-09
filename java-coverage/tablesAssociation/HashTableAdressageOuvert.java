package tablesAssociation;

public class HashTableAdressageOuvert implements ITableAssociation {
	/**
	 * La taille initiale du tableau de stockage des éléments
	 */
	private final static int SIZE = 1024 ;
	/**
	 * Le tableau où l'on stocke les éléments de la table.
	 */
	private Pair [] t ;
	/**
	 * Nombre de paires stockées dans la table.
	 */
	private int nbKeys = 0 ;
	/**
	 * Taux de remplissage
	 */
	final static double alpha = 0.5 ;
	/**
	 * Constructeur sans paramètre : construit une table vide.
	 */
	public HashTableAdressageOuvert() { t = new Pair[SIZE] ; }
	/**
	 * Fonction de hachage. Se base sur le hashcode de java.
	 * @param key la clef à hacher.
	 * @return la clef hachée.
	 */
	private int hash(String key) { return Math.abs(key.hashCode()) % t.length ; }

	/**
	 * Recherche de l'indice de la case où est stockée la clef passée en paramètre. 
	 * Provoque une erreur si la clef n'est pas trouvée.
	 * @param key la clef pour laquelle on cherche l'indice
	 * @return indice de la case du tableau t où se trouve la clef.
	 */
	private int getSlot(String key) {
		int h0 = hash(key) ;
		int h = h0 ;
		do {
			/* Si t[h] est « vide » ou contient la clé key, on a trouvé */
			if (t[h] == null || key.equals(t[h].key)) return h ;
			/* Sinon, on passe à la case suivante */
			h++ ;
			if (h >= t.length) h = 0 ;
		} while (h != h0) ;
		throw new Error("Table pleine") ; // On a fait le tour complet sans trouver
	}

	public int get(String key) {
		Pair p = t[getSlot(key)] ;
		if (p == null) {
			return 0 ;
		} else {
			return p.val ;
		}
	}



	public void put(String key, int val) {
		int h = getSlot(key) ;
		Pair p = t[h] ;
		if (p == null) {
			nbKeys++ ;
			t[h] = new Pair(key, val) ;
			if (t.length * alpha < nbKeys) resize() ;
		} else {
			p.val = val ;
		}
	}
	/**
	 * Redimensionne le tableau t. A utiliser quand le taux de remplissage n'est plus respecté.
	 * Lors du redimensionnement, on multiplie par 2 la taille initiale.
	 */
	private void resize() {
		int old_sz = t.length ;
		int new_sz = 2*old_sz ;
		Pair [] oldT = t ;

		t = new Pair[new_sz] ;
		for (int k = 0 ; k < old_sz ; k++) {
			Pair p = oldT[k] ;
			if (p != null) t[getSlot(p.key)] = p ;
		}
	}

}

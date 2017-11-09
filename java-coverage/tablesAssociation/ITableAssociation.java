package tablesAssociation;
public interface ITableAssociation {
  /**
   * Permet d'ajouter une paire clef/valeur à la table d'association. 
   * S'il existe déjà dans la table un élément de même clef, cet élément est écrasé.
   * @param key : la clef de l'élément à ajouter
   * @param val : la valeur de l'élément à ajouter
   */
  void put(String key, int val) ;
  
  /**
   * Permet de retrouver une valeur (entière) dans la table à partir d'une clef. 
   * Si la clef n'existe pas dans la table, alors on retourne 0.
   * @param key la clef pour laquelle on cherche la valeur
   * @return l'élément recherché, ou 0 s'il n'existe pas.
   */
  int get(String key) ;
}
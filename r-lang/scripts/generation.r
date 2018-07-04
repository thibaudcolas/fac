# On définit un nombre de départ
nombre_depart <- 0

# Et on y applique différentes opérations. Vous devez normalement toutes les connaitre
print("Traitement")
resultat <- nombre_depart + 10
resultat <- cos(sin(resultat))
resultat <- resultat ^ resultat
resultat <- log2(resultat)
resultat <- sqrt(((resultat * 10) / (resultat + 5)) * -5)

# On a fini nos différents traitements et on enregistre le résultat dans un fichier externe
print("Sauvegarde")
save(resultat, file="donnees/resultat.RData")
print("Fini =)")

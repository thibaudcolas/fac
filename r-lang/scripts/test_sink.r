# Si vous avez quitté R, votre dossier de travail peut avoir été perdu. 
# Dans le doute, on le redéfinit. Le nom est évidemment à adapter.
print("Ce résultat apparaitra sur l'écran.")
print(5 * 2)

# On redirige maintenant vers un fichier de sortie. Si il n'existe pas il sera créé par R
sink("resultats/sortie_essai_sink.txt")
print("Les résultats sont maintenant enregistrés dans notre fichier de sortie.")
print(8 * 2)

# On redirige à nouveau la sortie vers la solution par défaut: l'écran
sink()
print("On affiche de nouveau la sortie sur l'écran")

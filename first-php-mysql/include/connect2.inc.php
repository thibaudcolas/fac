<?php
	$host="localhost";
// Généralement la machine est localhost
// C'est à dire la machine sur laquelle le script est hébergé
	$user = "root";
	$bdd = "commande";
	$passwd = "mysql";
	
	mysql_connect($host, $user, $passwd)
		or die("Erreur de connexion au serveur");
	mysql_select_db($bdd) or die("Erreur de connexion  à la base de données");
	
?>
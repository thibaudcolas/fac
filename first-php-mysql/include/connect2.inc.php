<?php
	$host="localhost";
// G�n�ralement la machine est localhost
// C'est � dire la machine sur laquelle le script est h�berg�
	$user = "root";
	$bdd = "commande";
	$passwd = "mysql";
	
	mysql_connect($host, $user, $passwd)
		or die("Erreur de connexion au serveur");
	mysql_select_db($bdd) or die("Erreur de connexion  � la base de donn�es");
	
?>
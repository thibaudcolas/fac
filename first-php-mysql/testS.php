<?php
// Configuration
	ini_set("register_globals","off");
// Le tableau des valeurs
	$valeurs=array("1" , "2" , "3" );
// On récupère l'éventuel choix de l'utilisateur
	if (isset($_POST["cmbValeurs"]))
	{
		$choix=$_POST["cmbValeurs"];
	}
// On calcule la liste des valeurs à afficher
	$HTMLvaleurs="";
	for($i=0;$i<count($valeurs);$i++)
	{
// Si option courante est égale au choix, on la séléctionne
		if (isset($choix) && $choix==$valeurs[$i])
		{
			$HTMLvaleurs.="<option selected>$valeurs[$i]</option>\n";
		}
		else $HTMLvaleurs.="<option>$valeurs[$i]</option>\n";
	}
// On calcule la seconde partie de la page
	$article="";
	if(isset($choix))
	{
		$article= $choix;
	}
// On affiche la réponse
	//include "testS3.php";
?>
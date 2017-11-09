<?php
// Definition des variables utilisées dans le contenu
$contenu = $titre = $scripts_bas = '';

// Choix de la page à inclure
$p = 'defaut';
if(isset($_GET['p']) && preg_match('#^([a-z0-9]+)$#',$_GET['p']) && file_exists(CHEMIN.'inc/pages/'.$_GET['p'].'.php'))
	$p = $_GET['p'];
	
// Inclusion de la page
include CHEMIN.'inc/pages/'.$p.'.php';
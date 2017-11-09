<?php
// Compile les fichiers CSS
header("Content-type: text/css"); 
define('DOSSIER_CSS', 'style/');

$fichiers = array();
$dir = opendir(DOSSIER_CSS);
while($fichier = readdir($dir)){
	if(substr($fichier,-4) == '.css')
		$fichiers[] = $fichier;
}
closedir($dir);

asort($fichiers);

$retour_css = '';

foreach ($fichiers as $fichier)
	$retour_css .= file_get_contents(DOSSIER_CSS.$fichier);

echo $retour_css;
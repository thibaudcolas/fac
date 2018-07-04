<?php
$liste_fichiers = '';

$div_vieux_fichiers = FALSE;

$fichiers = glob($content_dir.'*');
// Tri des fichiers du plus récent au plus ancien
usort($fichiers, create_function('$a,$b', 'return filemtime($b) - filemtime($a);'));

foreach ($fichiers as $fichier) {
	// Si un fichier dépasse le temps max, on masque les fichiers.
	if(filemtime($fichier) + TEMPS_VIEUX_FICHIERS < time() && !$div_vieux_fichiers){
		$div_vieux_fichiers = TRUE;
		$liste_fichiers .= '<p><a href="#" id="a_vieux_fichiers">Afficher les vieux fichiers</a></p><div id="vieux_fichiers">';
	}
	$nomfichier = basename($fichier);
	$liste_fichiers .= '<p>'.date('d/m/Y H:i',filemtime($fichier)).' - <a href="'.$url_dir.$nomfichier.'">'.$nomfichier.'</a></p>';	
}

$contenu .= '<h2>Mes fichiers</h2>
<div id="liste_fichiers">
'.$liste_fichiers.'
'.($div_vieux_fichiers ? '</div>' : '').'
</div>';

// Afficher / Masquer les vieux fichiers
if($div_vieux_fichiers)
$scripts_bas .= '
var vieux_fichiers = document.getElementById(\'vieux_fichiers\');
var a_vieux_fichiers = document.getElementById(\'a_vieux_fichiers\');
vieux_fichiers.style.display = \'none\';
a_vieux_fichiers.onclick = function(){toggle(\'vieux_fichiers\');return false;};
';
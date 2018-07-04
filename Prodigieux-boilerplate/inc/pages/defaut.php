<?php
// si formulaire soumis avec un fichier
if(isset($_FILES['fichier'])) 
	include CHEMIN.'inc/pages/defaut/upload.php';

// Formulaire d'upload
include CHEMIN.'inc/pages/defaut/formulaire.php';

// Liste des fichiers envoy&eacute;s
include CHEMIN.'inc/pages/defaut/parcourir.php';


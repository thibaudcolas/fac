<?php
$retour = '';
chmod($content_dir,0777);
$extension = strrchr($_FILES['fichier']['name'],'.');
$name_file = md5(microtime(true)).$extension;
$tmp_file = $_FILES['fichier']['tmp_name'];
$type_file = $_FILES['fichier']['type'];
if(!is_uploaded_file($tmp_file))
	$retour ="Le fichier est introuvable";
else{
	if( !in_array($extension,$extensions))
		$retour = "Le fichier n'est pas une image";
	else{
		if(preg_match('#[\x00-\x1F\x7F-\x9F/\\\\]#', $name_file) )
			$retour = "Nom de fichier non valide";
		else {
			if(!move_uploaded_file($tmp_file,$content_dir.$name_file))
				$retour = "Impossible de copier le fichier dans le repertoire de destination";
			else{
				$test_contenu = file_get_contents($content_dir.$name_file);
				if(strstr($test_contenu,'<?php') || strstr($test_contenu,'<html>')){
					$retour = "Le fichier est invalide";
					unlink($content_dir.$name_file);
				}
			}
		}
	}
}


$contenu .= '<p>'.(empty($retour) ? 'Ok pour l\'upload' : 'Erreur : '.$retour).'</p>';


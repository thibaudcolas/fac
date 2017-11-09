<?php 
$temps = microtime(true);
define('CHEMIN', realpath('.').'/');
include CHEMIN.'inc/config.php';
include CHEMIN.'inc/header.php';
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title><?php echo TITRE; ?></title>
	<link rel="stylesheet" href="ext/style.php" type="text/css" />
</head>
<body>
<div class="row" id="header">
	<div class="column grid_33"><h1><?php echo TITRE; ?></h1></div>
	<div class="column grid_66">
	<ul id="menu">
		<li><a href="<?php echo URL; ?>">Accueil</a></li>
		<li><a href="<?php echo URL; ?>?p=options">Options</a></li>
		<li><a href="<?php echo URL; ?>?p=aide">Aide</a></li>
	</ul>
	</div>
</div>
<div id="contenu">
	<?php echo $contenu; ?>
</div>

<p id="footer"><strong><?php echo TITRE; ?></strong> - <?php echo round(microtime(true)-$temps,3); ?>s.</p>
<script type="text/javascript">
function toggle(cible){
	var la_cible = document.getElementById(cible).style;
	if(la_cible.display == 'none') la_cible.display = '';
	else la_cible.display = 'none';
}

<?php echo $scripts_bas; ?></script>
</body>
</html>

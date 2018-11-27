<html>
	<head>
		<title>Génération de formulaire</title>
	</head>
	<body>
		<h2>Choisissez un nombre</h2>
		<hr />
		<form name="frmvaleurs" method="post" action="valeurs03.php">
			<select name="cmbValeurs" size="1">
				<?php
// Affichage de la liste de valeurs
					echo $HTMLvaleurs;
				?>
			</select>
			<input type="submit" value="Envoyer" name="cmdEnvoyer">
		</form>
		
		<?php
			include "testS.php";
		?>
	</body>
</html>
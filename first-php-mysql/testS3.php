<html>
	<head>
		<title>Fichier de test 3</title>
	</head>
	<body>
		<h2>test requete</h2>
		<hr />
		
		<?php
			$chemin="include/connect2.inc.php";
			include $chemin;
			$query="SELECT * FROM commandes where article=" . $article . ";" ;
			$Result = mysql_query($query);
		?>
		
		<table>
			<th>Id comande</th>
			<th>Article</th>
			<th>Quantité</th>
			<th>Client</th>
			<?php
				while ($row = mysql_fetch_assoc($Result)) {
			?>
			<tr>
					<td><?php echo $row["id_commande"]; ?></td>
					<td><?php echo $row["article"]; ?></td>
					<td><?php echo $row["quantite"]; ?></td>
					<td><?php echo $row["client"]; ?></td>
			</tr>
			<?php 
			}
			?>
		</table>
		
		<?php
			mysql_close();
		?>
		
	</body>
</html>
<html>
	<head>
		<title>Fichier de test 2</title>
	</head>
	<body>
		<h2>tibaud t'es vraiment trop con !</h2>
		<hr />
		
		<?php
			$chemin="include/connect2.inc.php";
			include $chemin;
			$query="SELECT * FROM articles";
			$Result = mysql_query($query);
		?>
		
		<table>
			<?php
				while ($row = mysql_fetch_assoc($Result)) {
			?>
			<tr>
					<td><?php echo $row["id_article"]; ?></td>
					<td><?php echo $row["article"]; ?></td>
					<td><?php echo $row["prix"]."€"; ?></td>
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
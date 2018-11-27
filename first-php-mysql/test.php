<html>
	<head>
		<title>Fichier de test</title>
	</head>
	<body>
		<h2>On va tester !</h2>
		<hr />
		
		<?php
			$chemin="include/connect.inc.php";
			include $chemin;
			$query="SELECT * FROM maTable";
			$Result = mysql_query($query);
		?>
		
		<table>
			<?php
				while ($row = mysql_fetch_assoc($Result)) {
			?>
			<tr>
					<td><?php echo $row["id_maTable"]; ?></td>
					<td><?php echo $row["ch1"]; ?></td>
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
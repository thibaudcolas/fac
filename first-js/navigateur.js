function identificationNav() 
{
	document.write("Votre navigateur : <br /><hr /><br />");
	document.write("<hr /><br />");
	document.write("Le code name de votre navigateur est " + navigator.appCodeName + "<br />");
	document.write("Le nom ou la marque de votre navigateur est " + navigator.appName + "<br />");
	document.write("Les informations sur la version sont " + navigator.appVersion + "<br />");
	document.write("Le navigateur a comme user-agent name " + navigator.userAgent + "<br />");
}
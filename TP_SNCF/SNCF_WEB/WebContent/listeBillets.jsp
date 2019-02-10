<%@page import="com.sncf.entities.Billet"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Site de reservation sncf</title>
</head>
<body>
<TABLE BORDER>
	<TR>
		<TH>Départ</TH> <TH>Arrivée</TH> <TH>Le prix</TH> <TH> Action </TH>
	</TR>
	<% List<Billet> listeBillets = (List<Billet>)request.getAttribute("listeBillets");
	%>
	
	<%for(Billet b : listeBillets){%>
		<TR><TD><%=b.getDepartVille() %></TD> <TD><%=b.getArriveeVille() %></TD> <TD><%=b.getPrix() %></TD> <TD><a href="./reservationBillet.html">Acheter</a></TD></TR>
		
	<% }	%>
		
	
	
</TABLE>	
</body>
</html>
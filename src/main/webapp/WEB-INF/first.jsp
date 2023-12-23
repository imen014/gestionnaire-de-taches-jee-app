<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Idea</title>
</head>
<body>



<div>
<h1>First Idea</h1>
<form action="FirstServlet" method="POST">
<label for="domain_choice">choisir domaine voulues</label>
<select name="domain_choice">
<option>
<h6>Education</h6>
</option>
<option>
<h6>Travail</h6>
</option>
<option>
<h6>Loisirs</h6>
</option>
</select> <br/><br/>

<label for="FirstIdeaInfo"> Quelle est votre premiére idée ?</label>
<input type="text" name="FirstIdeaInfo" id="FirstIdeaInfo" /> <br/><br/>

<label for="courage"> Avez-Vous le courage à faire ?</label>
<input type="text" name="courage" id="courage" /> <br/><br/>

<label for="estimPeriod"> Dans Combien de jours ?</label>
<input type="text" name="estimPeriod" id="estimPeriod" /> <br/><br/>

<label for="estimPoucentageReussite"> Estime pourcentage de reussite ?</label>
<input type="text" name="estimPoucentageReussite" id="estimPoucentageReussite" />
<br/><br/>
<label for="dateDebut"> Quand voulez-vous debuter à ça ?</label>
<input type="date" name="dateDebut" id="dateDebut" /><br/><br/>

<input type="submit" value="Valider" />


</form>
</div>
</body>
</html>
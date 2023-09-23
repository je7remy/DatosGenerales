<%-- 
Document   : index
Created on : 04-mar-2020, 9:02:48
Author     : jeremy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>IATESA</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- coneciones css -->
<link href="Css/boostrap.css" rel="stylesheet" type="text/css"/>
<link href="Css/indexCSS.css" rel="stylesheet" type="text/css"/>
<link href="Css/all.css" rel="stylesheet" type="text/css"/>
 
<!-- Bootstrap CSS -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/popper.min.js" type="text/javascript"></script>
<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="js/all.js" type="text/javascript"></script>

<nav class="navbar navbar-expand-lg fixed-top">
<a class="nav-link logo" href="#">IATESA</a>
<br>
<br>
<br>
<div class="collapse navbar-collapse" id="navbarSupportedContent">
<ul class="enlaces navbar-nav ml-auto">
<li class="nav-item">
<a class="nav-link " href="#">| Estudiantes |</a>
</li>
<li class="nav-item">
    <a class="nav-link " href="#">Docentes |</a>
</li>
<li class="nav-item">
    <a class="nav-link " href="#">Calificaciones |</a>
</li>
<li class="nav-item">
    <a class="nav-link " href="#">Documentación |</a>
</li>
<li class="nav-item">
    <a class="nav-link " href="#">Coordinación Pedagógica |</a>
</li>
<li class="nav-item">
    <a class="nav-link " href="#">Empresa |</a>
</li>

</ul>
</div>
</nav>


<br>
<br>
<br>
<br>

<style>
.img-file>input {
display: none;}
</style>



<ul class="list-group">
<div class="container">
<section class="form_wrap">
<div class="col-md-12">
<div class="well well-sm">

<fieldset>


  <br>

<div class="img-file">   
<center> <h2 class="klk">✍ Registrar Regional &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   
<a title="Consultas y reportes" href="http://localhost:8080/System%20colllege/ConsultaRegional.jsp">
<img src="https://icon-library.net/images/upload-photo-icon/upload-photo-icon-29.jpg" 
width="50px" height="50px" alt="Regional" /></a>
</h2></center>
 </div>
<br>
<br>



<h6>
<div class="form-row">
<div class="col-md-4 mb-3">
<label for="validationDefault01">ID Regional</label>
<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text"><i class="fas fa-key"></i></span>
</div>                  
<input readonly type="number" class="form-control" id="validationDefault01" placeholder="01" >
  </div>
</div>

<div class="col-md-4 mb-3">
<label for="validationDefault02">Regional</label>
<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">📝</span>
</div>                  
<input type="Number" class="form-control" id="validationDefault02" placeholder="0506" required>
</div>
</div>
<div class="col-md-4 mb-4">
<label for="validationDefault02">Director</label>
<div class="input-group">
<div class="input-group-prepend">
    <span class="input-group-text"><i class="fas fa-user-tie"></i></span>
</div>              
<input type="text" class="form-control" id="validationDefault03" placeholde="Ej: Silvestre" required>
</div> </div>

<div class="col-md-6 mb-4">
<label for="validationDefault03">Direccion</label>
<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">🚗</span>
</div>              
<input type="text" class="form-control" id="validationDefault04"  placeholde="Ej: Las Martinez" required>
</div>
</div>
<div class="col-md-6 mb-5">
<label for="validationDefault02">Correo</label>
<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">@</span>
</div>                 
<input type="email" class="form-control" id="validationDefault05" placeholde="Ej: Je7remy@gmail.com"required >
</div>
</div>
<div class="col-md-4 mb-5">
<label for="validationDefault05">Telefono</label>
<div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">📳</span>
</div>          
<input type="Tel"  pattern="\([0-9]{3}\) [0-9]{3}[ -][0-9]{4}" class="form-control" placeholde="Ej: (829) 359 0768" id="validationDefault06" required>
</div>
</div>    
</div>
</h6>
<button class="btn btn-primary" type="submit">Enviar Formulario</button>
<button class="btn btn-danger" type="submit">Cancelar</button>
</fieldset>
</div> </div></section> </div> 

</ul>





</body>
<!--
<ul class="list-group">
<div class="container">
<section class="form_wrap">
<div class="col-md-12">
<div class="well well-sm">

<fieldset>
    <br>
    <center>  <h3>IATESA</h3> </center>
    <h2>Sub Menu</h2>  
    <h4>Registrar</h4>
    
    
</fieldset>
</div></div></section></div></ul>
-->
<footer>

<h3>IATESA</h3>

<ul class="enlaces nav-footer navbar-nav ml-auto">

<li class="nav-item">
<a class="nav-link " href="#">| Estudiantes |</a>  
</li>
<li class="nav-item">
<a class="nav-link " href="#">Docentes |</a>  
</li>
<li class="nav-item">
<a class="nav-link " href="#">Calificaciones |</a>   
</li>
<li class="nav-item">
<a class="nav-link " href="#">Documentación |</a>    
</li>
<li class="nav-item">
<a class="nav-link " href="#">Coordinación Pedagógica |</a>  
</li>
<li class="nav-item">
<a class="nav-link " href="#">Empresa |</a> 
</li>

</ul>

<div class="footer-redes">
<a href="#"><i class="fab fa-facebook"></i></a>
<a href="#"><i class="fab fa-twitter"></i></a>
<a href="#"><i class="fab fa-instagram"></i></a>
</div>
<p> 2020-2021 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms JEREMY</a></p>  
<br>
</footer>






</html>
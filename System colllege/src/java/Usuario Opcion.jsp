<%-- 
Document   : Usuario Opcion
Created on : 06-mar-2020, 10:28:22
Author     : jeremy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>IATESA</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- conecciones css -->
<link href="Css/Style.css" rel="stylesheet" type="text/css"/>
<link href="Css/indexCSS.css" rel="stylesheet" type="text/css"/>
<link href="Css/boostrap.css" rel="stylesheet" type="text/css"/>
<!-- Bootstrap CSS -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="/docs/4.4/dist/js/bootstrap.bundle.min.js" integrity="sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg fixed-top">
    
<a class="nav-link logo" href="#">IATESA</a>
<br> <br> <br>
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
<br> <br> <br> <br>
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
<center> <h1 class="klk">Usuario Opcion &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   
<a title="Busqueda" href="#">
<img src="https://icon-library.net/images/upload-photo-icon/upload-photo-icon-29.jpg" 
width="50px" height="50px" alt="Regional" /></a>
</h1></center>
</div> 
<br> <br>
<h2>
<div class="form-row">
<div class="col-md-4 mb-3">
<label for="validationDefault01">Secuencia</label>
<input readonly type="number" class="form-control" id="validationDefault01" value="ID" required placeholder=" 01">
</div>
<div class="col-md-4 mb-3">
<label for="validationDefault02">ID Usuario</label>
<input readonly type="Number" class="form-control" id="validationDefault02" value="Regional" required placeholder=" 01">
</div>
<div class="col-md-4 mb-4">
<label for="validationDefault02">ID Menu</label>
<input readonly type="number" class="form-control" id="validationDefault03" value="" required placeholder="01">
</div>
<div class="col-md-4 mb-4">
<label for="validationDefault03">ID Opcion</label>
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
<label class="form-check-label" for="defaultCheck1">
Profesor
</label>
</div>
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
<label class="form-check-label" for="defaultCheck1">
Estudiante
</label>
</div>
</div>
<!--   <select class="custom-select" multiple>
<option selected>Open this select menu</option>
<option value="1">One</option>
<option value="2">Two</option>
<option value="3">Three</option>
</select> -->
<div class="col-md-4 mb-5">
<label for="validationDefault02">Estado</label>
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
<label class="form-check-label" for="defaultCheck1">
Activo
</label>
</div>
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
<label class="form-check-label" for="defaultCheck1">
Inactivo
</label>
</div>
</div>
</div>
</h2>
<div class="form-group">
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
<label class="form-check-label" for="invalidCheck2">
¿Acepta todas las condiciones?
</label>
</div>
</div>
<button class="btn btn-primary" type="submit">Enviar Formulario</button>
</fieldset>
</div>  </div> </section> </div>
</ul>
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
<p> 2020-2021 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>  
<br>
</footer>
</html>
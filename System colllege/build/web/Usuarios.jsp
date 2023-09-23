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
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- coneciones css -->
<link href="Css/boostrap.css" rel="stylesheet" type="text/css"/>
<link href="Css/indexCSS.css" rel="stylesheet" type="text/css"/>
<link href="Css/Usuarios.css" rel="stylesheet" type="text/css"/>
<script src="js/all.js" type="text/javascript"></script>
       
<!-- Bootstrap CSS -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!------ Include the above in your HEAD tag ---------->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

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
 
        <div class="wrapper">
            <nav id="sidebar">
                <div class="sidebar-header">
                        
                        <label>⚙ Configuracion de acceso</label> 
                    
                </div>
                <ul class="list-unstyled components">
                   <li>
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Sub menu</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
         
                            <li><a href="#">Estudiantes</a></li>
                            <li><a href="#">Docentes</a></li>
                            <li><a href="#">Datos generales</a></li>
                            <li><a href="#">Documentación</a></li>
                            <li><a href="#">Calificaciones</a></li>
                            <li><a href="#">Coordinación Pedagógica</a></li>
                        </ul>
                   </li>
                    <li>
                         <div class="sidebar-header">
                    <h3>Estudiante</h3>
                     <div class="form-check">
                     <input class="form-check-input" type="checkbox" id="gridCheck">
                     <label class="form-check-label" for="gridCheck">
                     Registrar Estudiante
                     </label> <br>
                     <input class="form-check-input" type="checkbox" id="gridCheck">
                     <label class="form-check-label" for="gridCheck">
                     Registrar Tutor
                     </label>
                     </div>
                </div>    
                       <div class="sidebar-header">
                    <h3>Docente</h3>
                     <div class="form-check">
                     <input class="form-check-input" type="checkbox" id="gridCheck">
                     <label class="form-check-label" for="gridCheck">
                     Registrar Docente
                     </label>
                     </div>
                </div>
         
                    </li>
                  <div class="sidebar-header">
                    <h3>Consultas y Reportes</h3>
                     <div class="form-check">
                     <input class="form-check-input" type="checkbox" id="gridCheck">
                     <label class="form-check-label" for="gridCheck">
                     CGRAL de Estudiante
                     </label> <br>
                     <input class="form-check-input" type="checkbox" id="gridCheck">
                     <label class="form-check-label" for="gridCheck">
                     Tutor/Estudiante
                     </label>
                         </div>
                </div>
                    
                </ul>
            </nav>
            <div class="content">
              
             

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
  <center>
<div class="img-file">
<h1 class="klk">✍ Registrar Usuarios &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   
<a title="Consultas y reportes" href="http://localhost:8080/System%20colllege/ConsultaUsuarios.jsp">
<img src="https://icon-library.net/images/upload-photo-icon/upload-photo-icon-29.jpg" 
width="50px" height="50px" alt="Usuarios" /></a>
</h1>
</div>

<br>
<br>



<h5>
&nbsp; &nbsp;  <div class="form-row">
  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class="col-md-5 mb-3">
      <label for="exampleFormControlSelect1">ID Empleado</label>
      <div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text"><i class="fas fa-key"></i></span>
</div>                  
      <br>
    <select class="form-control" id="exampleFormControlSelect1">
                <option value="01">01 Silvestre Cruz</option>
                <option value="02">02 Nieves</option>
                <option value="03">03 Gabriel </option>
                <option value="04">04 Rosely</option>
                <option value="05">05 Luis Alfredo</option> 
    </select>
      </div>
</div>

  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class="col-md-5 mb-3">
    <label for="validationDefault02">Usuario</label>
    <div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text"><i class="fas fa-user-tie"></i></span>
</div>                  
    <br>
<input type="text" class="form-control" id="validationDefault02" placeholder="" required>
    </div></div><br><br><br>
  
  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class="col-md-5 mb-5">
    <label for="validationDefault02">Clave</label>
    <div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">🔒</span>
</div>                  
    <br>
<input type="password" class="form-control" id="validationDefault03" placeholde="Ej: Silvestre" required>
</div>
  </div>
 &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class="col-md-5 mb-5">
    <label for="validationDefault03">Confirmar clave</label>
    <div class="input-group">
<div class="input-group-prepend">
<span class="input-group-text">🔐</span>
</div>                  
    <br>
<input type="password" class="form-control" id="validationDefault04"  placeholde="Ej: Las Martinez" required>
    </div></div>
</div>

</h5>
  </center>   
<button class="btn btn-primary" type="submit">Enviar Formulario</button>
<button class="btn btn-danger" type="submit">Cancelar</button>
</fieldset></div></div></section></div></ul></div></div>
 
        

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

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>


</html>
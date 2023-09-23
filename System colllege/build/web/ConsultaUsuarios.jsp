<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
    <link rel="shortcut icon" href="#" /> 
    <title>IATESA </title>
    <title>Reporte Usuarios</title>
      
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <!-- CSS personalizado -->
    <link rel="stylesheet" href="main.css">  
      
    <!--datables CSS básico-->
    <link rel="stylesheet" type="text/css" href="datatables/datatables.min.css"/>
    <!--datables estilo bootstrap 4 CSS-->  
    <link rel="stylesheet"  type="text/css" href="datatables/DataTables-1.10.18/css/dataTables.bootstrap4.min.css">
           
    <!--font awesome con CDN-->  
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">  
    <!-- coneciones css -->
<link href="Css/all.css" rel="stylesheet" type="text/css"/>
<link href="Css/boostrap.css" rel="stylesheet" type="text/css"/>
<link href="Css/indexCSS.css" rel="stylesheet" type="text/css"/>
<link href="Css/BusquedaRegional.css" rel="stylesheet" type="text/css"/>
<!-- Bootstrap CSS -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="js/all.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="js/popper.min.js" type="text/javascript"></script>  
  </head>
    
  <body> 
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
    
    <br><br><br><br><br>
    <br>
<center> 

        <h3><i class="fas fa-search"></i> Consulta Usuarios</h3></center> <br> <br>
       <header>
      <!--<h1 class="text-center text-light">DATATABLES</h1>
         <h2 class="text-center text-light">Cómo <span class="badge badge-warning">Personalizar</span></h2> -->
     </header>    
    <div style="height:50px"></div>
     
    <!--Ejemplo tabla con DataTables-->
    <div class="container">
        <div class="row">
                <div class="col-lg-12">
                    <div class="table-responsive">        
                        <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                   <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Empleado</th>
      <th scope="col">Usuario</th>
      <th scope="col">Clave</th>
      <th scope="col">Confirmar Clave</th>
     
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">01</th>
      <td>Silvestre Cruz</td>
      <td>Silvestre Cruz</td>
      <td>*********</td>
      <td>*********</td>
    
    </tr>
    <tr>
      <th scope="row">02</th>
      <td>Nieves</td>
      <td>Nieves</td>
     <td>*********</td>
      <td>*********</td>
     
    </tr>
    <tr>
      <th scope="row">03</th>
     <td>Gabriel</td>
      <td>Gabriel</td>
       <td>*********</td>
      <td>*********</td>
     
    </tr>
    <tr>
      <th scope="row">04</th>
      <td>Rosely</td>
      <td>Rosely</td>
      <td>*********</td>
      <td>*********</td>
    
    </tr>
    <tr>
      <th scope="row">05</th>
      <td>Luis Alfredo</td>
      <td>Luis Alfredo</td>
       <td>*********</td>
      <td>*********</td>
    </tr>
   
  </tbody>
   </table>                  
                    </div>
                </div>
        </div>  
    </div>    
     
    <!-- jQuery, Popper.js, Bootstrap JS -->
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="popper/popper.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
      
    <!-- datatables JS -->
    <script type="text/javascript" src="datatables/datatables.min.js"></script>    
     
    <!-- para usar botones en datatables JS -->  
    <script src="datatables/Buttons-1.5.6/js/dataTables.buttons.min.js"></script>  
    <script src="datatables/JSZip-2.5.0/jszip.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/pdfmake.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/vfs_fonts.js"></script>
    <script src="datatables/Buttons-1.5.6/js/buttons.html5.min.js"></script>
     
    <!-- código JS propìo-->    
    <script type="text/javascript" src="main.js"></script>  
    <br>
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
<p> 2020-2021 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms Jeremy</a></p>  
<br>  
</footer>

    
  </body>
</html>

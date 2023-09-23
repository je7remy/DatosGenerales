<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
    <link rel="shortcut icon" href="#" /> 
    <title>IATESA </title>
   
      
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

        <h3><i class="fas fa-search"></i> Busqueda Regional</h3></center> <br> <br>
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
      <th scope="col">Regional</th>
      <th scope="col">Director</th>
      <th scope="col">Direccion</th>
      <th scope="col">Correo</th>
      <th scope="col">Telefono</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">01</th>
      <td>0506</td>
      <td>Silvestre Cruz</td>
      <td>Las Martinez (La vega)</td>
       <td>Silvestre@gmail.com</td>
      <td>829-359-0768</td>
    </tr>
    <tr>
      <th scope="row">02</th>
      <td>0507</td>
      <td>Nicolas Navarro</td>
      <td>Rio Seco (La Vega)</td>
       <td>Nicolas@gmail.com</td>
      <td>829-485-6234</td>
    </tr>
    <tr>
      <th scope="row">03</th>
     <td>0568</td>
      <td>Emer Sanchez</td>
      <td>Guaco (La Vega)</td>
       <td>Emersanchez@gmail.com</td>
      <td>829-432-8976</td>
    </tr>
    <tr>
      <th scope="row">04</th>
      <td>0509</td>
      <td>Rick Sanchez</td>
      <td>Villa rosa (Santo Domingo)</td>
       <td>RickSanchez@gmail.com</td>
      <td>829-654-0912</td>
    </tr>
    <tr>
      <th scope="row">05</th>
      <td>0511</td>
      <td>Thornton</td>
      <td>Villa Francisca segunda (La vega)</td>
       <td>Thorton@gmail.com</td>
      <td>829-567-3498</td>
    </tr>
     <tr>
      <th scope="row">06</th>
      <td>05012</td>
      <td>Thor</td>
      <td>Samana</td>
       <td>samana@gmail.com</td>
      <td>809-773-1298</td>
    </tr>
  </tbody>
                        </table>          <br>          <br>      <br>       
                    </div>
                </div>
        </div>  
    </div>    <center>
<button class="btn btn-primary" type="submit">Aceptar</button>
<button class="btn btn-danger" type="submit">Cancelar</button> </center>
 <br>      <br>  
    <!-- jQuery, Popper.js, Bootstrap JS -->
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="popper/popper.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
      
    <!-- datatables JS -->
    <script type="text/javascript" src="datatables/datatables.min.js"></script>    
     
    <!-- para usar botones en datatables JS -->  
  <!--  <script src="datatables/Buttons-1.5.6/js/dataTables.buttons.min.js"></script>  
    <script src="datatables/JSZip-2.5.0/jszip.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/pdfmake.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/vfs_fonts.js"></script>
    <script src="datatables/Buttons-1.5.6/js/buttons.html5.min.js"></script>
     -->
    <!-- código JS propìo-->    
    
    <script src="Busquedas.js" type="text/javascript"></script>
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

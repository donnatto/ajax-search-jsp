<%-- 
    Document   : index
    Created on : 20/06/2019, 09:27:21 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="resources/js/script.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>Buscar elementos</h1>
        <form>
            <input type="text" name="txtNombre" id="txtNombre" placeholder="Ingresar nombre" onkeyup="buscar()">
        </form>
        <div>
            <table class="table table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Stock</th>
                        
                    </tr>
                </thead>
                <tbody  class="resultado" id="resultado">
                    
                </tbody>
            </table>
        </div>
    </body>
    
</html>

<%-- 
    Document   : index
    Created on : 17-may-2022, 9:30:44
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="container">
        <h1>Registro de personas</h1>

        <form action="recibirr.do" method="POST">
            <center>
            <table>
                <tr>
                    <td> DUI:</td> <td><input type="text" name="txtDui" value="" /></td>
                </tr>
                
                      
                <tr>
               <td>  Apellidos:</th> <td><input type="text" name="txtApellidos" value="" /></td>
                </tr>
                
                <tr>
                    
               <td> Nombres:</td> <td><input type="text" name="txtNombres" value="" /></td>
                </tr>
                  
                <tr>
               <td>
                   <input type="submit" value="Registrar Nueva Persona"/>      
               </td>
                </tr>
                   </table>
                </center>
        </form>
        <br>
        <br>
        <h1>Eliminar Registro</h1>
        <h4> Por favor ingrese el N° de Dui del registro que desea eliminar</h4>
         <form action="eliminar.do" method="POST">
            <center>
            <table>
                <tr>
                    <td> DUI:</td> <td><input type="text" name="txtDui" value="" /></td>
                </tr>
                             
                <tr>
               <td>
                    <button type="submit" class="btn btn-primary" value="Eliminar">Submit</button>    
               </td>
                </tr>
                   </table>
                </center>
        </form>
        
        
        
        
    </body>
</html>

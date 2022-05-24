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
    </head>
    <body>
        <h1 style="text-align:center; color:#33ff33">Registro de personas</h1>

        <form action="recibirr.do" method="POST">
            <center>
            <table border="1px">
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
        <h1 style="text-align:center; color:yellow">Eliminar Registro</h1>
        <h4 style="text-align:center; color:red"> Por favor ingrese el N° de Dui del registro que desea eliminar</h4>
         <form action="eliminar.do" method="POST">
            <center>
            <table border="1px">
                <tr>
                    <td> DUI:</td> <td><input type="text" name="txtDui" value="" /></td>
                </tr>
                             
                <tr>
               <td>
                   <input type="submit" value="Eliminar"/>      
               </td>
                </tr>
                   </table>
                </center>
        </form>
        
        
        
        
    </body>
</html>

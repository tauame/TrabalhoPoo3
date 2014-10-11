<%-- 
    Document   : recursos
    Created on : 07/10/2014, 23:58:22
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro e manutenção dos recursos</h1>
        
        <form action="recursos" method="post">
            <table>
                <tr>
                    <td> Nome: </td>
                    <td> <input type="text" name="nomeRecursos" /> </td>
                </tr>
                <tr>
                    <td> Tipo: </td>
                    <td> <input type="text" name="tipo" /> </td>
                </tr>
                <tr>
                    <td> Origem: </td>
                    <td> <input type="text" name="origemRec"/> </td>
                </tr>
                <tr>
                    <td> Status: </td>
                    <td> <input type="text" name="statusRec"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Cadastrar"/> </td>
                </tr>
            </table>
        </form>  
        
        <h3> <a href="Menu.do"> Voltar </a> </h3>
        
    </body>
</html>

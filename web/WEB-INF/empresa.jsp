<%-- 
    Document   : empresa
    Created on : 07/10/2014, 23:57:43
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
        <h1>Cadastro e manutenção de empresas</h1>
        
        <form action="empresa" method="post">
            <table>
                <tr>
                    <td> Nome Fantasia: </td>
                    <td> <input type="text" name="nomeEmp" /> </td>
                </tr>
                <tr>
                    <td> Razão social: </td>
                    <td> <input type="text" name="razao" /> </td>
                </tr>
                <tr>
                    <td> CNPJ: </td>
                    <td> <input type="text" name="cnpj"/> </td>
                </tr>
                <tr>
                    <td> Ramo: </td>
                    <td> <input type="text" name="ramo"/> </td>
                </tr>
                <tr>
                    <td> Números de funcionários: </td>
                    <td> <input type="text" name="numFunc"/> </td>
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

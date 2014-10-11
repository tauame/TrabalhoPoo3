<%-- 
    Document   : projeto
    Created on : 07/10/2014, 23:57:59
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
        <h1>Cadastro e manutenção dos projetos da empresa</h1>
        
        <form action="projeto" method="post">
            <table>
                <tr>
                    <td> Nome do Projeto: </td>
                    <td> <input type="text" name="nomeProj" /> </td>
                </tr>
                <tr>
                    <td> Área: </td>
                    <td> <input type="text" name="area" /> </td>
                </tr>
                <tr>
                    <td> Departamentos envolvidos: </td>
                    <td> <input type="text" name="dptoEnv"/> </td>
                </tr>
                <tr>
                    <td> Orçamento disponível: </td>
                    <td> <input type="text" name="orcDisp"/> </td>
                </tr>
                <tr>
                    <td> Orçamento utilizado: </td>
                    <td> <input type="text" name="orcUtil"/> </td>
                </tr>
                <tr>
                    <td> Data início: </td>
                    <td> <input type="text" name="dataIni"/> </td>
                </tr>
                <tr>
                    <td> Data término: </td>
                    <td> <input type="text" name="dataTerm"/> </td>
                </tr>
                <tr>
                    <td> Status: </td>
                    <td> <input type="text" name="statusProj"/> </td>
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

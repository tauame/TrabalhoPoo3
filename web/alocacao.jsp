<%-- 
    Document   : alocacao
    Created on : 07/10/2014, 23:58:55
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
        <h1>Vínculo das tarefas com recursos</h1>
        
        <form action="alocacao" method="post">
            <table>
                <tr>
                    <td> Tarefa: </td>
                    <td> <input type="text" name="tarefa" /> </td>
                </tr>
                <tr>
                    <td> Recurso: </td>
                    <td> <input type="text" name="recurso" /> </td>
                </tr>
                <tr>
                    <td> Tempo de alocação: </td>
                    <td> <input type="text" name="tempoAloc"/> </td>
                </tr>
                <tr>
                    <td> Start alocação: </td>
                    <td> <input type="text" name="startAloc"/> </td>
                </tr>
                <tr>
                    <td> End alocação: </td>
                    <td> <input type="text" name="endAloc"/> </td>
                </tr>
                <tr>
                    <td> Status: </td>
                    <td> <input type="text" name="atatusAloc"/> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Cadastrar"/> </td>
                </tr>
            </table>
        </form>  
        
        <h3> <a href="index.jsp"> Voltar </a> </h3>
        
    </body>
</html>

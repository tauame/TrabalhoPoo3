<%-- 
    Document   : tarefas
    Created on : 07/10/2014, 23:58:39
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
        <h1>Cadastro e manutenção das tarefas</h1>
        
        <form action="tarefas" method="post">
            <table>
                <tr>
                    <td> Título: </td>
                    <td> <input type="text" name="titulo" /> </td>
                </tr>
                <tr>
                    <td> Descrição: </td>
                    <td> <input type="text" name="descricao" /> </td>
                </tr>
                <tr>
                    <td> Origem: </td>
                    <td> <input type="text" name="origemTar"/> </td>
                </tr>
                <tr>
                    <td> Tempo estimado: </td>
                    <td> <input type="text" name="tempoEst"/> </td>
                </tr>
                <tr>
                    <td> Custo estimado: </td>
                    <td> <input type="text" name="custoEst"/> </td>
                </tr>
                <tr>
                    <td> Comentários: </td>
                    <td> <input type="text" name="comentarios"/> </td>
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

<%-- 
    Document   : login.jsp
    Created on : Sep 15, 2014, 11:47:21 AM
    Author     : tauame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="scripts/jquery-2.1.1.js"></script>
        <script type="text/javascript" src="scripts/jquery-sha1.js"></script>
        <title>Login - Finanças</title>
        
        <style>
            .login-box{
                margin-left: auto;
                margin-right: auto;
                width: 384px;
                background-color: graytext;
                font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
                font-size: 15px;
                font-weight: 300;
                padding: 10px;
                border-radius: 20px;
                
            }
            label{
                width:80px;
                display:inline-block;
                text-align: right;
            }
            input#login, input#senha{
                width:272px;
            }
            input.submit{
                right:0px;
                margin-right: 20px;
            }
            
            .error{
                color:red;
                
            }
        </style>
    </head>
    <body>
        <form class="login-box" action="Login.do" method="POST" onsubmit="criptografar()">
            
            <p class="error">
                <% 
                    String errorMsg = (String) request.getAttribute("error-msg");
                if(errorMsg!=null){
                    out.print(errorMsg);
                }
                %>
            </p>
            
            <p>
                <label for="login">Login:</label>
                <input id="login" type="text" name="login"/>
            </p>
            <p>
                <label for="senha">Senha:</label>
                <input type="password" id="senha" name="senha"/>
            </p>
            <div align="right">
                <input type="hidden" name="ativo" value="true"/>
                <input type="hidden" name="acao" value="login"/>
                <input class="submit" type="submit" value = "Entrar"/>
            </div>
        </form>
        <script type="text/javascript">

        function criptografar(){
            document.getElementById("senha").value = $.sha1(document.getElementById("senha").value + "salt1");
        }

    </script>
    </body>
</html>

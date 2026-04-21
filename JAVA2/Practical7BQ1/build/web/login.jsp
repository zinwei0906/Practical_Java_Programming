<html>
    <head>
        <title>Login</title>
        <style>
            input[type=text],input[type=password]{
                width: 20%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
        </style>
    </head>

    <body>
        <form action="j_security_check" method="POST">
            Username : <input type="text" name="j_username"/><br>
            Password : <input type="password" name="j_password"/>
            <br/><br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>

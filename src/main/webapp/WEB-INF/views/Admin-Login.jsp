<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head><title>Admin-Login</title>
                
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
    </head>


    <body>
    
       <br><br><br><br>
        <center><img src="images/logo.png" alt="Grizzly Logo" />
  
    <br><br>
    <form  method="POST" action="Admin-Login.html">
            <div class="form-group row topnav1 ">
                    <label for="fname" class="col-sm-5 col-form-label"></label>
                    <div class="col-sm-2">
        <input type="text" name="userName" placeholder="Username" class="form-control form-rounded" id="userId" required > 
    </div>
   </div>
            <div class="form-group row topnav1 ">
                    <label for="fname" class="col-sm-5 col-form-label"></label>
                    <div class="col-sm-2">
        <input type="text" name="password" placeholder="Password" class="form-control form-rounded" id="password" required > 
    </div>
   </div>

<div class="form-group row">
        <label for="zip" class="col-sm-5 col-form-label"></label>
        <div class="col-sm-2">
                <input type="submit" class="btn btn-secondary form-rounded" value="Login">
                <span style="color:red"><b>${invalidPassword}</b></span>
                <span style="color:red"><b>${invalidUser}</b></span>
             
            </div>
           
</div>
 <span style="color:red"><b>${logoutMessage}</b></span>
  

    </form>
    </body>
</html>

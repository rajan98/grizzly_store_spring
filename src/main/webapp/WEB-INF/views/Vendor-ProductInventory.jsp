<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%            
        response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
        response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
        response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
%>
<!DOCTYPE html>
<html lang="en">
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
        <nav class="navbar navbar-expand-md navbar-light bg-light">
                <img src="images/smlogo.png"></img>
                                 
                    <form class="mx-2 my-auto d-inline w-20">
                        <div class="input-group">
                            <input type="text" class="form-control form-rounded border border-right-0" placeholder="Search...">
                            <span class="input-group-append">
                            <button class="btn btn-outline-secondary border border-left-0" type="button">
                                <i class="fa fa-search"></i>                              
                            </button>
                          </span>
                        </div>
                    </form>

               <ul class="navbar-nav ml-auto">
                   <li class="nav-item">
                       <a class="nav-link" href="#"><span class="fa fa-bell"></span></a>
                   </li>
                   <li class="nav-item">
                       <span class="navbar-text">
                           Welcome, Vendor Name...
                       </span>
                   </li>
                   </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <form class="mx-2 my-auto w-full">
                                <button class="btn btn-secondary form-rounded" type="button">Logout</button>
                            </form>
                        </li>
                    </ul>
                        
            </nav>

<div class="container-fluid">
    <div class="row">
            <div class="col-md-3 bg-light">
                <nav class="navbar navbar-expand-md navbar-dark bg-secondary">
                    <span class="navbar-text navbar-">PROFILE</span>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a href="" style="color: aliceblue">Edit</a>
                        </li>
                    </ul>
                </nav>

<br><center>
    <picture>
        <img src="images/profile.png" alt="Profile picture" width="50px"></img>
    </picture><br>
    <b>M/S John Doe</b>
<br>
<span style="color:lighgray">3.7</span>
<br><br>
Contact<br> 978601XXXX
<br><br>
<address>
        Address:<br>
        NYC, NY, USA,XXXX,
</address>
<br><br><br>
<form class="mx-2 my-auto w-full">
    <button class="btn btn-secondary form-rounded" type="button">Contact Grizzly</button>
</form>
</center>
  </div>

                <div class="col-md-9 bg-light">
            
                    <div class="btn-group col-md-12">
                        <div class="container">
                            
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs" role="tablist">
                              <li class="nav-item">
                                <a class="nav-link " data-toggle="tab" href="#home">PRODUCTS</a>
                              </li>
                              <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#menu1">INVENTORY</a>
                              </li>
                             
                            </ul>
                          
                            <!-- Tab panes -->
                            <div class="tab-content">
                              <div id="home" class="container tab-pane fade"><br>
        
                              </div>
                              <div id="menu1" class="container tab-pane active"><br>
                                <div class="col-md-12 bg-light">
                                    <form class="mx-2 my-auto d-inline w-20">
                                            <div class="input-group">
                                                <input list="category" name="browser" class="form-rounded" placeholder=" Choose Action">
                                                <datalist id="category">
                                                  <option value="Personal Care" selected>
                                                  <option value="Laptops">
                                                  <option value="Art Supplies">
                                                 </datalist>    
    
    
                                                        &emsp;&nbsp;&nbsp;
                                                        <input type="text" class="form-rounded border border-right-0" placeholder=" Product Name/ID">
                                                        <span class="input-group-append">
                                                        <button class="btn btn-outline-secondary border border-left-0" type="button">
                                                            <i class="fa fa-search"></i>                              
                                                        </button>
                                                      </span>
                                                      &emsp;&emsp;
                                                          <input list="category"  class="form-rounded" name="browser" placeholder="Sort by">
                                                          <datalist id="category">
                                                            <option value="Personal Care" selected>
                                                            <option value="Laptops">
                                                            <option value="Art Supplies">
                                                           </datalist>  &emsp;&emsp;&emsp;&emsp;
                                                           <button class="btn btn-secondary form-rounded" type="submit">Add Product</button>
    
                            </div>
        
                                         <br>                     
                                         <table border="1" class="table table-bordered">
                                                <tr>
                                                    <td>
                                                        <center><span style="color: gray">Product List</span>
                                                    </td>
                                                    <td>
                                                        <center> <span style="color: gray">ID</span>
                                                    </td>
    
                                                    <td>
                                                            <center> <span style="color: gray">In Stock</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: gray">Req.</span>
                                                            </td>
                                                            <td>
                                                                    <center><span style="color: gray">Buffer</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">Price/Item</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">Pending</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">Rating</span>
                                                                </td>
                                                                <td>
                                                                                                                      

                                                                    </td>
                                                </tr>
                                        
                                                <tr>
                                                        <td>
                                                                <div class="checkbox checkbox-info checkbox-circle">
                                                                        <input id="checkbox10" type="checkbox" >
                                                                        <label for="checkbox10">
                                                                            Macbook Pro
                                                                        </label>
                                                                    </div>   
                                                        </td>
                                                        <td>
                                                            <center> <span style="color: gray">TRX0098</span>
                                                        </td>
    
                                                        <td>
                                                            <center> <span style="color: gray">34</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: gray">11</span>
                                                            </td>
                                                            <td>
                                                                    <center><span style="color: gray">45</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">1350.00</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">3</span>
                                                                </td>
                                                                <td>
                                                                        <span style="color: gray">4.7</span>
                                                                    </td>
                                                                    <td>
                                                                            <center>
                                                            
                                                                                     <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                                </center>
                                                                        </td>
                                                    </tr>
                                        
                                        
                                                <tr>
                                                        <td>
                                                                <div class="checkbox checkbox-info checkbox-circle">
                                                                        <input id="checkbox11" type="checkbox" >
                                                                        <label for="checkbox11">
                                                                            Shaver
                                                                        </label>
                                                                    </div>    
                                                        </td>
                                                        <td>
                                                            <center> <span style="color: gray">BS6785</span>
                                                        </td>
                                                        <td>
                                                            <center> <span style="color: gray">23</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: gray">0</span>
                                                            </td>
                                                            <td>
                                                                    <center><span style="color: gray">10</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">4700.00</span>
                                                                </td>
                                                                <td>
                                                                    <center><span style="color: gray">1</span>
                                                                </td>
                                                                <td>
                                                                        <span style="color: gray">4.8</span>
                                                                    </td>
                                                                    <td><center>
                                                                        <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                        </center>
                                                                        </td>
                                                    </tr>
                                                    <tr>
                                                            <td>
                                                                    <div class="checkbox checkbox-info checkbox-circle">
                                                                            <input id="checkbox12" type="checkbox" >
                                                                            <label for="checkbox12">
                                                                                Macbook Pro
                                                                            </label>
                                                                        </div>   
                                                            </td>
                                                            <td>
                                                                <center> <span style="color: gray">MAC4567</span>
                                                            </td>
                                                            <td>
                                                                <center> <span style="color: gray">15</span>
                                                            </td>
                                                            <td>
                                                                    <center><span style="color: gray">0</span>
                                                                </td>
                                                                <td>
                                                                        <center><span style="color: gray">5</span>
                                                                    </td>
                                                                    <td>
                                                                        <center><span style="color: gray">1,53,000</span>
                                                                    </td>
                                                                    <td>
                                                                        <center><span style="color: gray">1</span>
                                                                    </td>
                                                                    <td>
                                                                            <span style="color: gray">4.9</span>
                                                                        </td>
                                                                        <td>
                                                                                <center>
                                                                                    <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                                    </center>
                                                                            </td>
                                                        </tr>
                                                        <tr>
                                                                <td>
                                                                        <div class="checkbox checkbox-info checkbox-circle">
                                                                                <input id="checkbox13" type="checkbox" >
                                                                                <label for="checkbox13">
                                                                                    IMac 27"
                                                                                </label>
                                                                            </div>   
                                                                </td>
    
                                                                <td>
                                                                    <center> <span style="color: gray">IMAC3452</span>
                                                                </td>
                                                                <td>
                                                                    <center> <span style="color: gray">12</span>
                                                                </td>
                                                                <td>
                                                                        <center><span style="color: gray">0</span>
                                                                    </td>
                                                                    <td>
                                                                            <center><span style="color: gray">5</span>
                                                                        </td>
                                                                        <td>
                                                                            <center><span style="color: gray">97,000</span>
                                                                        </td>
                                                                        <td>
                                                                            <center><span style="color: gray">0</span>
                                                                        </td>
                                                                        <td>
                                                                                <span style="color: gray">4.6</span>
                                                                            </td>
                                                                            <td>
                                                                                    <center>
                                                                                        <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                                        </center>
                                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                    <td>
                                                                            <div class="checkbox checkbox-info checkbox-circle">
                                                                                    <input id="checkbox14" type="checkbox" >
                                                                                    <label for="checkbox14">
                                                                                        Micron Pens
                                                                                    </label>
                                                                                </div>   
                                                                    </td>
                                                                    <td>
                                                                        <center> <span style="color: gray">SPMP345</span>
                                                                    </td>
    
                                                                    <td>
                                                                        <center> <span style="color: gray">60</span>
                                                                    </td>
                                                                    <td>
                                                                            <center><span style="color: gray">15</span>
                                                                        </td>
                                                                        <td>
                                                                                <center><span style="color: gray">75</span>
                                                                            </td>
                                                                            <td>
                                                                                <center><span style="color: gray">450.00</span>
                                                                            </td>
                                                                            <td>
                                                                                <center><span style="color: gray">4</span>
                                                                            </td>
                                                                            <td>
                                                                                    <span style="color: gray">4.1</span>
                                                                                </td>
                                                                                <td>
                                                                                        <center>
                                                                                            <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                                            </center>
                                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                        <td>
                                                                                <div class="checkbox checkbox-info checkbox-circle">
                                                                                        <input id="checkbox15" type="checkbox" >
                                                                                        <label for="checkbox15">
                                                                                            Paint Markers
                                                                                        </label>
                                                                                    </div>   
                                                                        </td>
                                                                        <td>
                                                                            <center> <span style="color: gray">PMC4567</span>
                                                                        </td>
                                                                        <td>
                                                                            <center> <span style="color: gray">45</span>
                                                                        </td>
                                                                        <td>
                                                                                <center><span style="color: gray">15</span>
                                                                            </td>
                                                                            <td>
                                                                                    <center><span style="color: gray">60</span>
                                                                                </td>
                                                                                <td>
                                                                                    <center><span style="color: gray">4200.00</span>
                                                                                </td>
                                                                                <td>
                                                                                    <center><span style="color: gray">2</span>
                                                                                </td>
                                                                                <td>
                                                                                        <span style="color: gray">4.2</span>
                                                                                    </td>
                                                                                    <td>
                                                                                            <center>
                                                                                                <button class="btn btn-secondary form-rounded" type="button">&nbsp;Manage&nbsp; </button>
                                                                                                </center>
                                                                                        </td>
                                                                    </tr>
                                            </table>
    
                            </div>
                   
                                  </div>
                              </div>
                                    </div>
                          </div>
                    </div>
                    <br>
    </div>    

           
</body>
</html>
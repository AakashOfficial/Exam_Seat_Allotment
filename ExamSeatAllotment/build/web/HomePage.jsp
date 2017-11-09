<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        
        <title>MAIN MENU</title>
         <link rel="stylesheet" href="bootstrap.css">
         <link rel="stylesheet" href="bootstrap.min.css">
          
                <link rel="stylesheet" href="login_css.css">
                <script>
function openWin() {
     var mywindow=
    window.open("class_management.jsp","_self");
  
}
</script>
   <script>
function openWin5() {
     var mywindow5=
    window.open("User_management.jsp","_self");
  
}
</script>

 <script>
function openWin2() {
     var mywindow2=
    window.open("exam_option.jsp","_self");
  
}
</script>
<script>
function openWin3() {
     var mywindow3=
    window.open("student_management.jsp","_self");
  
}
</script>
        <style type="text/css">      
                    
             html { width: 100%; height:100%; overflow:scroll; }
             body { 

	font-family: 'Open Sans', sans-serif;
	background: #092756;
        
	background: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%),-moz-linear-gradient(top,  rgba(57,173,219,.25) 0%, rgba(42,60,87,.4) 100%), -moz-linear-gradient(-45deg,  #670d10 0%, #092756 100%);
	background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -webkit-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -webkit-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
	background: -o-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -o-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -o-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
	background: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -ms-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -ms-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
	background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), linear-gradient(to bottom,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), linear-gradient(135deg,  #670d10 0%,#092756 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D', endColorstr='#092756',GradientType=1 );
}
         
input { 
	width: 100%; 
	margin-bottom: 10px; 
	background: rgba(0,0,0,0.3);
	border: none;
	outline: none;
	padding: 10px;
	font-size: 13px;
	color: #fff;
	text-shadow: 1px 1px 1px rgba(0,0,0,0.3);
	border: 1px solid rgba(0,0,0,0.3);
	border-radius: 4px;
	box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
	-webkit-transition: box-shadow .5s ease;
	-moz-transition: box-shadow .5s ease;
	-o-transition: box-shadow .5s ease;
	-ms-transition: box-shadow .5s ease;
	transition: box-shadow .5s ease;
}
input:focus { box-shadow: inset 0 -5px 45px rgba(100,100,100,0.4), 0 1px 1px rgba(255,255,255,0.2); }

.Button h1 { color: #fff; text-shadow: 0 0 10px rgba(0,0,0,0.3); letter-spacing:1px; text-align:center; }

           
            legend{font-variant: small-caps;font-weight:bold}
            legend{font-variant: small-caps;font-weight:bold}
            fieldset{width:500px;font-family: Arial;
                     background-color:skyblue;color: rgb(0,100,50)}
            label{display: block;position:relative;line-height: 5;
                   margin: auto;}
            
            .Button{
                padding: 10px 15px;
                position: relative;
                text-align: center;
                font-style:normal;
                font-size:15px;
                border-color:black;
                cursor: pointer;
                color:white;
                background-color:background;
                border-radius: 15px;
                box-shadow: 0 2px #092756;
                left:auto;
                margin-right: 40px;
                margin-left: 40px;
                right: 10px;
                height: 80px;
                width:220px;
            }
            .Button: hover {background-color: #3e8e41}
            .Button: active {
                background-color: #3e8e41;
                box-shadow: 0 5px #092756;
                transform: translateY(4px);
            }
            </style>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       <nav class="navbar navbar-inverse" style="background-color: background;color: #fff">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">CLASS ALLOTMENT</a>
    </div>
    <ul class="nav navbar-nav">
        <li><a href="#">HOME PAGE</a></li>
     
      <li><a href="#">USER NAME</a></li>
    </ul>
  </div>
</nav>
           
        </ul>
        </br>
        </br>
        
       <center>          
           <input class="Button" type="button" value="CLASS MANAGEMENT" class="submitButton" onclick="openWin()"/>    <input class="Button" type="button" value="USER MANAGEMENT" class="submitButton" onclick="openWin5()"/>
           </br>
           </br>
           </br>
           </br>
           </br>
           
           <input class="Button" type="button" value="CREATE ALLOTMENT" class="submitButton" onclick="openWin2()"  />        <input class="Button" type="button" value="VIEW ALLOTMENT" class="submitButton"/>
       </br>
           </br>
           </br>
           </br>
           </br>
           
           <input class="Button" type="button" value="STUDENT MANAGEMENT" class="submitButton" onclick="openWin3()"/>        <input class="Button" type="button" value="SQL PROMPT" class="submitButton"/>
       
       
       
       </center>
       
       </body>
       </html>


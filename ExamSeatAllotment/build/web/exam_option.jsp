<!DOCTYP<link rel="stylesheet" href="bootstrap-theme.min.css">
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.SQLException"%>
<%@page import="SeatAllotment.Connectivity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap-theme.min.css">
        <link rel="stylesheet" href="pignose.calendar.css">
        <script src="pignose.calendar.js"></script>
        <script language="javascript">
            $(document).ready(function(){
                $("#datepicker").datepicker();
            });
        </script>
       
             <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Open+Sans);
.btn { display: inline-block; *display: inline; *zoom: 1; padding: 4px 10px 4px; margin-bottom: 0; font-size: 13px; line-height: 18px; color: #333333; text-align: center;text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75); vertical-align: middle; background-color: #f5f5f5; background-image: -moz-linear-gradient(top, #ffffff, #e6e6e6); background-image: -ms-linear-gradient(top, #ffffff, #e6e6e6); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff), to(#e6e6e6)); background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6); background-image: -o-linear-gradient(top, #ffffff, #e6e6e6); background-image: linear-gradient(top, #ffffff, #e6e6e6); background-repeat: repeat-x; filter: progid:dximagetransform.microsoft.gradient(startColorstr=#ffffff, endColorstr=#e6e6e6, GradientType=0); border-color: #e6e6e6 #e6e6e6 #e6e6e6; border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25); border: 1px solid #e6e6e6; -webkit-border-radius: 4px; -moz-border-radius: 4px; border-radius: 4px; -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); -moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05); cursor: pointer; *margin-left: .3em; }
.btn:hover, .btn:active, .btn.active, .btn.disabled, .btn[disabled] { background-color: #e6e6e6; }
.btn-large { padding: 9px 14px; font-size: 15px; line-height: normal; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px; }
.btn:hover { color: #333333; text-decoration: none; background-color: #e6e6e6; background-position: 0 -15px; -webkit-transition: background-position 0.1s linear; -moz-transition: background-position 0.1s linear; -ms-transition: background-position 0.1s linear; -o-transition: background-position 0.1s linear; transition: background-position 0.1s linear; }
.btn-primary, .btn-primary:hover { text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25); color: #ffffff; }
.btn-primary.active { color: rgba(255, 255, 255, 0.75); }
.btn-primary { background-color: #4a77d4; background-image: -moz-linear-gradient(top, #6eb6de, #4a77d4); background-image: -ms-linear-gradient(top, #6eb6de, #4a77d4); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6eb6de), to(#4a77d4)); background-image: -webkit-linear-gradient(top, #6eb6de, #4a77d4); background-image: -o-linear-gradient(top, #6eb6de, #4a77d4); background-image: linear-gradient(top, #6eb6de, #4a77d4); background-repeat: repeat-x; filter: progid:dximagetransform.microsoft.gradient(startColorstr=#6eb6de, endColorstr=#4a77d4, GradientType=0);  border: 1px solid #3762bc; text-shadow: 1px 1px 1px rgba(0,0,0,0.4); box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.5); }
.btn-primary:hover, .btn-primary:active, .btn-primary.active, .btn-primary.disabled, .btn-primary[disabled] { filter: none; background-color: #4a77d4; }
.btn-block { width: 100%; display:block; }

* { -webkit-box-sizing:border-box; -moz-box-sizing:border-box; -ms-box-sizing:border-box; -o-box-sizing:border-box; box-sizing:border-box; }

html { width: 100%; height:100%; overflow:scroll; }

body { 
	width: 100%;
	height:100%;
       
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
.buttonHolder
{
  padding-right: 45%;
  padding-left: 45%
}
    </style>
   
<script>
    
function goBack() {
    window.history.back();
}
</script>
<script lang="javascript">
    var i=0;
    
    function addNew() {

            // Get the main Div in which all the other divs will be added
            var mainContainer = document.getElementById('mainContainer');

            // Create a new div for holding text and button input elements
            var newDiv = document.createElement('div');
             newDiv.setAttribute("name","class"+i);
             
            // Create a new text input
            var newDropdown = document.createElement('select');
            newDropdown.setAttribute("id","class"+i);
            newDropdown.setAttribute("name","class"+i);
            i=i+1;
        <%
            Connectivity c=new Connectivity();
            c.connect();
            String l="use mysql";
            String getclass="select * from class";
            c.st.executeQuery(l);
            c.rs=c.st.executeQuery(getclass);
            while(c.rs.next())
            {
                //out.println("feefef");%>
                var newDropdownOption = document.createElement("option");
                newDropdownOption.value = "<%out.print(c.rs.getString(1));%>";
                 newDropdownOption.text = "<%out.print(c.rs.getString(1));%>";
                 newDropdown.add(newDropdownOption);

           <% }
            
            
            
            %>
//            newDropdownOption = document.createElement("option");
//             newDropdownOption1 = document.createElement("option1");
//            newDropdownOption.value = "value1";
//            newDropdownOption1.value = "value2";
//            newDropdownOption.text = "opt1";
//              newDropdown.add(newDropdownOption);
//                  newDropdownOption1.text = "opt2";
//                  newDropdown.add(newDropdownOption1);
           

            var newDelButton = document.createElement('input');
            //newDelButton.data="dropdown";
           // newDelButton.class="btn btn-primary dropdown-toggle";
            newDelButton.type = "button";
            newDelButton.value = "REMOVE";
          
            // Append new text input to the newDiv
           newDiv.appendChild(newDropdown);

            // Append new button inputs to the newDiv
            //newDiv.appendChild(newAddButton);
            newDiv.appendChild(newDelButton);

            // Append newDiv input to the mainContainer div
            mainContainer.appendChild(newDiv);

            // Add a handler to button for deleting the newDiv from the mainContainer
            //newAddButton.onclick = addNew;

            newDelButton.onclick = function() {
                    mainContainer.removeChild(newDiv);
            };
        }
</script>      
<script lang="javascript">
    var j=0;
    function addNew1() {

            // Get the main Div in which all the other divs will be added
            var mainContainer1 = document.getElementById('mainContainer1');

            // Create a new div for holding text and button input elements
            var newDiv1 = document.createElement('div');
             newDiv1.setAttribute("name","sub"+j);
             j=j+1;
            // Create a new text input
             var newDropdown = document.createElement('select');
            newDropdown.setAttribute("id","sub"+i);
            newDropdown.setAttribute("name","sub"+i);
            j=j+1;
        <%
            
            Connectivity co=new Connectivity();
            co.connect();
            String l1="use mysql";
            String getsubjectcode="select * from subjectcode";
            co.st.executeQuery(l1);
            co.rs=co.st.executeQuery(getsubjectcode);
            while(co.rs.next())
            {
                //out.println("feefef");%>
                var newDropdownOption = document.createElement("option");
                newDropdownOption.value = "<%out.print(co.rs.getString(1));%>";
                 newDropdownOption.text = "<%out.print(co.rs.getString(1));%>";
                 newDropdown.add(newDropdownOption);

           <% }
            
            
            
            %>
            // Create buttons for creating and removing inputs
            //var newAddButton = document.createElement('input');
            //newDelButton.data="dropdown";
            //newDelButton.class="btn btn-primary dropdown-toggle";
            //newAddButton.type = "button";
            //newAddButton.value = "ADD";

            var newDelButton = document.createElement('input');
            //newDelButton.data="dropdown";
           // newDelButton.class="btn btn-primary dropdown-toggle";
            newDelButton.type = "button";
            newDelButton.value = "REMOVE";
          
            // Append new text input to the newDiv
           newDiv1.appendChild(newDropdown);

            // Append new button inputs to the newDiv
            //newDiv.appendChild(newAddButton);
            newDiv1.appendChild(newDelButton);

            // Append newDiv input to the mainContainer div
            mainContainer1.appendChild(newDiv1);

            // Add a handler to button for deleting the newDiv from the mainContainer
            //newAddButton.onclick = addNew;

            newDelButton.onclick = function() {
                    mainContainer1.removeChild(newDiv1);
            };
        }
</script>      
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <br/>
        <br/>
    
        
         <button onclick="goBack()" style=" position: absolute;right: 10%;left:90%;background-color:background;padding-left: 2em; padding-right: 2em;
                 padding-top: 0.5em;padding-bottom: 0.5em; border-radius: 6px;color: white;border-color: background">Back</button>
        <br/>
        <br/>
        <br/>
        <form action="fetch_allotment.jsp" method="POST" class="form-group">
            <div class="col-sm-6">
                    <label for="date1" style="color: white">DATE:</label>
                    
                    <input type="date" class="form-control " id="date" name=date"
                           placeholder="enter date" style="background-color: rgba(0,0,0,0.3); color: white">
                </div>
            
                <div class=" col-sm-6 ">
                    <label for="text" style="color: white" >FN/AFN:</label>
                    <input type="text" class="form-control" id="fan" name="fan"
                           placeholder="enter time" style="background-color: rgba(0,0,0,0.3); color: white">
                </div>
            
            <br/>
        </div>
         <br/>
               <br/>
               <br/>
               <br/>
                <br/>
               <br/>
               <br/>
               <br/>
        <div class="row">
       <div class="dropdown pull-left" id="mainContainer"style="display: inline-block;left: 20%;">
    
           <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" 
                   style="padding-left: 20px;padding-right: 20px;padding-top: 10px;padding-bottom: 10px; " onclick="addNew();">
          ADD CLASS  </button>
               
</div>
       
                <div class="dropdown" id="mainContainer1" style="display: inline-block;left: 65%;">
    
           <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" 
                   style="padding-left: 15px;padding-right: 15px;padding-top: 10px;padding-bottom: 10px;
                   " onclick="addNew1();">
          ADD SUBJECT  </button>
               
</div>
        </div>
                <br/>
                <br/>
                        <br/>
                        <br/>
                        <br/>
                 
                    <div class="buttonHolder" >
                    <button type="submit" class="btn btn-default" style="padding-left: 2em; padding-right: 2em; float: left">
                    Submit
                </button>
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                    </div>
        </form>
    </body>
</html>

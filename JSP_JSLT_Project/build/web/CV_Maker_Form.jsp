<%-- 
    Document   : a
    Created on : Dec 6, 2016, 4:17:22 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CV Maker Form</title>
    </head>
    <body>
        <form action="ServletPDF">
            <h1 align="center"><b>Contact Information</b></h1><br/>

            Enter Your Name :   <input type="text" name="uname">
            Location : <input type="text" name="location">
            Contact : <input type="text" name="contact">
           
            <br/><br/>
             <h1 align="center"><b>Career Objective</b></h1><br/>
            Career Objective : ​<textarea id="txtArea" name="objective" rows="7" cols="70"></textarea><br/><br/>
            
            <h1 align="center"><b>Scholastic Records</b></h1><br/>
            Title of the Graduate : <input type="text" name="graduate_title">
            Year of passing : <input type="text" name="graduate_pass_year">
            Institution : <input type="text" name="graduate_institution">
            Result : <input type="text" name="graduate_result"><br/><br/>
            
            
            HSC : <input type="text" name="hsc">
            Year of passing : <input type="text" name="hsc_pass_year">
            Institution : <input type="text" name="hsc_institution">
            Result : <input type="text" name="hsc_result"><br/><br/>
            
            
            SSC : <input type="text" name="ssc">
            Year of passing : <input type="text" name="ssc_pass_year">
            Institution : <input type="text" name="ssc_institution">
            Result : <input type="text" name="ssc_result"><br/><br/>
            
            <h1 align="center"><b>Summary Of Skills</b></h1><br/>
            Programming Languages : <input type="text" name="pl">
            
            
             <h1 align="center"><b>Projects Work Experience</b></h1><br/>
            Project Name : <input type="text" name="project_name">
            Language Used :<input type="text" name="language_used">
            
            
           <br/><br/><input type="submit" value="CreateCV">   



        </form>


    </body>
</html>

<%-- 
    Document   : Generate_Pdf_JSP
    Created on : Dec 7, 2016, 3:06:09 PM
    Author     : User
--%><%@page import="com.itextpdf.text.pdf.*"%>
<%@page import="com.itextpdf.text.*"%>
<%@page import="java.io.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
         try {
            File file = new File("F:/itext-test2.pdf");
            FileOutputStream fileout = new FileOutputStream(file);
            Document document = new Document();
            PdfWriter.getInstance(document, fileout);
            document.addAuthor("Me");
            document.addTitle("My iText Test");
            document.open();
            Paragraph paragraph = new Paragraph();
            paragraph.add("Hello World");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        %>
    </body>
</html>

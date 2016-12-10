<%-- 
    Document   : view_notes
    Created on : Dec 4, 2016, 4:17:16 PM
    Author     : User
--%>

<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View My Notes</title>
    </head>
    <body>


        <table border="1">
            <%
            try {
                String user = (String) session.getAttribute("user");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personalNotes",
                        "root", "12345");
                Statement st = con.createStatement();
                ResultSet rs;
                rs = st.executeQuery("select note.my_note,note.date from personalNotes.note where note.uname='" + user + "'");
                out.println("<font color='blue'>Details of My Notes</font>");

                out.print("<tr><th>My Note</th><th>Date</th></tr>");
                while (rs.next()) {

                    out.print("<tr>");

                    out.print("<td>" + rs.getString(1) + "</td>");
                    out.print("<td>" + rs.getString(2) + "</td>");
                    out.print("</tr>");


            %>			

            <%}

                } 
            catch (SQLException e) 
                {
                    e.printStackTrace();
                }

            %></table>
          
    </body>
</html>

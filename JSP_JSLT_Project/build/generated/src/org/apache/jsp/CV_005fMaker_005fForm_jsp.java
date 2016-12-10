package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CV_005fMaker_005fForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CV Maker Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ServletPDF\">\n");
      out.write("            <h1 align=\"center\"><b>Contact Information</b></h1><br/>\n");
      out.write("\n");
      out.write("            Enter Your Name :   <input type=\"text\" name=\"uname\">\n");
      out.write("            Location : <input type=\"text\" name=\"location\">\n");
      out.write("            Contact : <input type=\"text\" name=\"contact\">\n");
      out.write("           \n");
      out.write("            <br/><br/>\n");
      out.write("             <h1 align=\"center\"><b>Career Objective</b></h1><br/>\n");
      out.write("            Career Objective : ​<textarea id=\"txtArea\" name=\"objective\" rows=\"7\" cols=\"70\"></textarea><br/><br/>\n");
      out.write("            \n");
      out.write("            <h1 align=\"center\"><b>Scholastic Records</b></h1><br/>\n");
      out.write("            Title of the Graduate : <input type=\"text\" name=\"graduate_title\">\n");
      out.write("            Year of passing : <input type=\"text\" name=\"graduate_pass_year\">\n");
      out.write("            Institution : <input type=\"text\" name=\"graduate_institution\">\n");
      out.write("            Result : <input type=\"text\" name=\"graduate_result\"><br/><br/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            HSC : <input type=\"text\" name=\"hsc\">\n");
      out.write("            Year of passing : <input type=\"text\" name=\"hsc_pass_year\">\n");
      out.write("            Institution : <input type=\"text\" name=\"hsc_institution\">\n");
      out.write("            Result : <input type=\"text\" name=\"hsc_result\"><br/><br/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            SSC : <input type=\"text\" name=\"ssc\">\n");
      out.write("            Year of passing : <input type=\"text\" name=\"ssc_pass_year\">\n");
      out.write("            Institution : <input type=\"text\" name=\"ssc_institution\">\n");
      out.write("            Result : <input type=\"text\" name=\"ssc_result\"><br/><br/>\n");
      out.write("            \n");
      out.write("            <h1 align=\"center\"><b>Summary Of Skills</b></h1><br/>\n");
      out.write("            Programming Languages : <input type=\"text\" name=\"pl\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <h1 align=\"center\"><b>Projects Work Experience</b></h1><br/>\n");
      out.write("            Project Name : <input type=\"text\" name=\"project_name\">\n");
      out.write("            Language Used :<input type=\"text\" name=\"language_used\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <br/><br/><input type=\"submit\" value=\"CreateCV\">   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

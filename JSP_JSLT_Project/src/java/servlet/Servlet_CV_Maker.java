package servlet;

import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.DrawInterface;
import java.awt.Color;
import java.awt.Desktop;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_CV_Maker extends HttpServlet {

    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("application/pdf");
//Getting input from form
        String name = request.getParameter("uname");
        String location = request.getParameter("location");
        String contact = request.getParameter("contact");

        String objective = request.getParameter("objective");

        String graduate_title = request.getParameter("graduate_title");
        String graduate_pass_year = request.getParameter("graduate_pass_year");
        String graduate_institution = request.getParameter("graduate_institution");
        String graduate_result = request.getParameter("graduate_result");

        String hsc_title = request.getParameter("hsc");
        String hsc_pass_year = request.getParameter("hsc_pass_year");
        String hsc_institution = request.getParameter("hsc_institution");
        String hsc_result = request.getParameter("hsc_result");

        String ssc_title = request.getParameter("ssc");
        String ssc_pass_year = request.getParameter("ssc_pass_year");
        String ssc_institution = request.getParameter("ssc_institution");
        String ssc_result = request.getParameter("ssc_result");

        String pl = request.getParameter("pl");
        
        String projectName= request.getParameter("project_name");
        String langUsed= request.getParameter("language_used");

        try {
//CV Heading and Contact Address
            File file = new File("F:/test2.pdf");
            FileOutputStream fileout = new FileOutputStream(file);
            Document document = new Document();
            PdfWriter.getInstance(document, fileout);

            document.open();
//Name and Address
            Paragraph title1 = new Paragraph("CURRICULUM VITAE OF\n");

            Chapter chapter1 = new Chapter( 1);
            chapter1.setNumberDepth(0);
            document.add(chapter1);
         
            document.add(title1);
            Paragraph n=new Paragraph(name);
            document.add(n);
            Paragraph l=new Paragraph(location);
            document.add(l);
            Paragraph con=new Paragraph("Contact    :"+contact);
            document.add(con);
            document.add(new Paragraph("\n"));
//Career objective
            Paragraph career_objective = new Paragraph("Career Objective");
            document.add(career_objective);

            //Description
            Paragraph object = new Paragraph(objective,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.BOLD, new CMYKColor(79, 0, 100, 75)));
            document.add(object);

//Scholastic Records     
            Paragraph scholastic_records = new Paragraph("Scholastic Records");
            document.add(scholastic_records);

            Paragraph pra_graduate_title = new Paragraph(graduate_title,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            10, Font.UNDERLINE, new CMYKColor(79, 0, 100, 75)));
            document.add(pra_graduate_title);

            Paragraph pra_graduate_pass_year = new Paragraph("Year of passing   :\t" + graduate_pass_year,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(pra_graduate_pass_year);

            Paragraph pra_graduate_institution = new Paragraph("Institution             :\t" + graduate_institution,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(pra_graduate_institution);

            Paragraph pra_graduate_result = new Paragraph("Result                  :\t" + graduate_result,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(pra_graduate_result);
              //document.add(new Paragraph("\n"));

            Paragraph hs_title = new Paragraph(hsc_title,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            10, Font.UNDERLINE, new CMYKColor(79, 0, 100, 75)));
            document.add(hs_title);

            Paragraph hsc_graduate_pass_year = new Paragraph("Year of passing   :\t" + hsc_pass_year,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(hsc_graduate_pass_year);

            Paragraph hs_institution = new Paragraph("Institution             :\t" + hsc_institution,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(hs_institution);

            Paragraph hs_result = new Paragraph("Result                  :\t" + hsc_result,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(hs_result);

            Paragraph ss_title = new Paragraph(ssc_title,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            10, Font.UNDERLINE, new CMYKColor(79, 0, 100, 75)));
            document.add(ss_title);

            Paragraph ssc__pass_year = new Paragraph("Year of passing   :\t" + ssc_pass_year,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(ssc__pass_year);

            Paragraph ss_institution = new Paragraph("Institution             :\t" + ssc_institution,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(ss_institution);

            Paragraph ss_result = new Paragraph("Result                  :\t" + ssc_result,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(ss_result);
//Summary of skills
            Paragraph skill = new Paragraph("Summary Of Skills\n");
            document.add(skill);
            
            Paragraph progra_lan = new Paragraph("Programming Languages        :\t" + pl,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(progra_lan);
//Project works experience
            Paragraph project_experience = new Paragraph("Projects Work Experience\n");
            document.add(project_experience);
            
            
            Paragraph project_name = new Paragraph("Project Name    :\t" + projectName,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(project_name);
            
            Paragraph lang_used = new Paragraph("Technology Used  :\t" + langUsed,
                    FontFactory.getFont(FontFactory.HELVETICA,
                            9, Font.NORMAL, new CMYKColor(79, 0, 100, 75)));
            document.add(lang_used);

            document.add(new Paragraph("\n"));
   
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

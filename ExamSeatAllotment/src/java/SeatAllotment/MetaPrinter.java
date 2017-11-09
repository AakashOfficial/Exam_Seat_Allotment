/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeatAllotment;

/**
 *
 * @author Gopan
 */
import com.itextpdf.text.BaseColor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;

public class MetaPrinter {
    String dat;
    
    MetaPrinter(String d)
    {
        dat=d;
    }
    public static final String DEST ="results/"; 
   void  printer()
    {
        
        String dw;
     for(int i=0;i<ClassMetadataArray.count;i++)   
     {
         dw=DEST+"Meta-classes-"+dat+"/";
         System.out.println("MetaClass()\n");
        File file= new File(dw);
        file.getParentFile().mkdirs();
    Document document = new Document(PageSize.A4.rotate());
        String d =ClassMetadataArray.meta[i].batch; 
        System.out.println("SeatAllotment.colom_3.Col()");
     Font font = new Font(FontFamily.HELVETICA, 20, Font.BOLD);
        
        String dest=dw+d+".pdf";
       try{ 
       PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        document.add(new Paragraph("                                                           "+d+"\n    "+dat,font));
        document.add(new Paragraph("                                                           ",font));
        PdfPTable table = new PdfPTable(3); // 3 columns.
        table.setWidthPercentage(100); //Width 100%
        table.setSpacingBefore(10f); //Space before table
        table.setSpacingAfter(10f); //Space after table
 
        //Set Column widths
        float[] columnWidths = { 2f, 2f,2f};
        table.setWidths(columnWidths);
      
       for(int j=0;j<ClassMetadataArray.meta[i].NoOfClasses;j++)
       {
          
           
           String seat=" "+ClassMetadataArray.meta[i].rollStart[j];
           String range=" "+ ClassMetadataArray.meta[i].rollEnds[j];
           String room=ClassMetadataArray.meta[i].classname[j];
           System.out.println(range+"   "+room+"\n");
        PdfPCell cell2 = new PdfPCell(new Paragraph(room,font));
        cell2.setBorderColor(BaseColor.BLACK);
        cell2.setBorder(PdfPCell.NO_BORDER);
        cell2.setPaddingLeft(5f);
        cell2.setPaddingRight(5f);
        cell2.setPaddingBottom(5);
        cell2.setPaddingTop(5);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell2.setCellEvent(new MyBorder());
        cell2.setFixedHeight(50f);
 
        PdfPCell cell3 = new PdfPCell(new Paragraph(seat,font));
        cell3.setBorder(PdfPCell.NO_BORDER);
        cell3.setPaddingLeft(10);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell3.setCellEvent(new MyBorder());
        cell3.setFixedHeight(50f);
 
        
        PdfPCell cell4 = new PdfPCell(new Paragraph(range,font));
        cell4.setBorder(PdfPCell.NO_BORDER);
        cell4.setPaddingLeft(10);
        cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell4.setCellEvent(new MyBorder());
        cell4.setFixedHeight(50f);
 
        //To avoid having the cell border and the content overlap, if you are having thick cell borders
        //cell1.setUserBorderPadding(true);
        //cell2.setUserBorderPadding(true);
        //cell3.setUserBorderPadding(true);
 
       // table.addCell(cell);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
       }
       document.add(table);
 
      
        document.close();
        writer.close();
     
      }
       catch(Exception e)
       {
          System.out.println(e.getMessage());
       }  
     }   
    }
    
}


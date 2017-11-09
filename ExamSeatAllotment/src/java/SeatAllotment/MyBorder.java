/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author rggop
 */

public class MyBorder implements PdfPCellEvent {
    public void cellLayout(PdfPCell cell, Rectangle position,
        PdfContentByte[] canvases) {
        float x1 = position.getLeft() + 2;
        float x2 = position.getRight() -5;
        float y1 = position.getTop()-5;
        float y2 = position.getBottom() + 2;
        PdfContentByte canvas = canvases[PdfPTable.LINECANVAS];
        canvas.rectangle(x1, y1, x2 - x1, y2 - y1);
        canvas.stroke();
    }
}
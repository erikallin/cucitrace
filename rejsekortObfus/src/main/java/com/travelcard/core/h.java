package com.travelcard.core;

import com.orsonpdf.k;
import com.orsonpdf.m;
import com.orsonpdf.u;
import com.travelcard.datagenerator.util.a;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;


public class h
{
  private List<g> de;
  
  private static JFreeChart a(PieDataset paramPieDataset)
  {
    JFreeChart localJFreeChart = ChartFactory.createPieChart("repStationStatistics.pdf", 
    
      paramPieDataset, 
      false, 
      true, 
      false);
    


    localJFreeChart.setBackgroundPaint(
      new GradientPaint(new Point(0, 0), new Color(20, 20, 20), new Point(400, 200), Color.DARK_GRAY));
    

    TextTitle localTextTitle1 = localJFreeChart.getTitle();
    localTextTitle1.setHorizontalAlignment(HorizontalAlignment.LEFT);
    localTextTitle1.setPaint(new Color(240, 240, 240));
    localTextTitle1.setFont(new Font("Arial", 1, 26));
    
    PiePlot localPiePlot = (PiePlot)localJFreeChart.getPlot();
    localPiePlot.setBackgroundPaint(null);
    localPiePlot.setInteriorGap(0.04D);
    localPiePlot.setOutlineVisible(false);
    

    localPiePlot.setSectionPaint("Others", a(new Color(200, 200, 255), Color.BLUE));
    localPiePlot.setSectionPaint("Samsung", a(new Color(255, 200, 200), Color.RED));
    localPiePlot.setSectionPaint("Apple", a(new Color(200, 255, 200), Color.GREEN));
    localPiePlot.setSectionPaint("Nokia", a(new Color(200, 255, 200), Color.YELLOW));
    
    localPiePlot.setSectionOutlinesVisible(true);
    


    localPiePlot.setLabelFont(new Font("Courier New", 1, 20));
    localPiePlot.setLabelLinkPaint(Color.WHITE);
    localPiePlot.setLabelLinkStroke(new BasicStroke(2.0F));
    localPiePlot.setLabelOutlineStroke(null);
    localPiePlot.setLabelPaint(Color.WHITE);
    localPiePlot.setLabelBackgroundPaint(null);
    

    TextTitle localTextTitle2 = new TextTitle("Source: http://www.bbc.co.uk/news/business-15489523", 
      new Font("Courier New", 0, 12));
    localTextTitle2.setPaint(Color.WHITE);
    localTextTitle2.setPosition(RectangleEdge.BOTTOM);
    localTextTitle2.setHorizontalAlignment(HorizontalAlignment.RIGHT);
    localJFreeChart.addSubtitle(localTextTitle2);
    return localJFreeChart;
  }
  















  private static RadialGradientPaint a(Color paramColor1, Color paramColor2)
  {
    Point2D.Float localFloat = new Point2D.Float(0.0F, 0.0F);
    float f = 200.0F;
    float[] arrayOfFloat = { 0.0F, 1.0F };
    return new RadialGradientPaint(localFloat, f, arrayOfFloat, new Color[] { paramColor1, paramColor2 });
  }
  






  public h()
  {
    this.de = new ArrayList();
    a locala = new a();
    this.de = locala.x(10);
  }
  



  public void by()
  {
    k localk = new k();
    localk.x("Station Statistics Report");
    localk.y("Travel Card System");
    u localu = localk.a(new Rectangle(612, 468));
    m localm = localu.aI();
    JFreeChart localJFreeChart = a(bA());
    localJFreeChart.setPadding(new RectangleInsets(4.0D, 8.0D, 2.0D, 2.0D));
    ChartPanel localChartPanel = new ChartPanel(localJFreeChart, false);
    localChartPanel.setMouseWheelEnabled(true);
    localChartPanel.setPreferredSize(new Dimension(600, 300));
    localJFreeChart.draw(localm, new Rectangle(0, 0, 612, 468));
    localk.a(new File("repStationStatistics.pdf"));
  }
  




  public List<g> bz()
  {
    return this.de;
  }
  



  public boolean F(String paramString)
  {
    File localFile = new File(paramString);
    return localFile.exists();
  }
  



  public void b(List<g> paramList)
  {
    this.de = paramList;
  }
  



  private PieDataset bA()
  {
    int i = 0;
    int j = 0;
	for (g s : de) {
      i += s.bj();
      j += s.bw();
    }
    Object localObject = new DefaultPieDataset();
    ((DefaultPieDataset)localObject).setValue("checkIn", i);
    ((DefaultPieDataset)localObject).setValue("checkOut", j);
    
    return (PieDataset)localObject;
  }
}
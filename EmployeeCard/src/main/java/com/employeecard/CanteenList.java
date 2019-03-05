package com.employeecard;

import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;

import com.employeecard.datagenerator.RandomCanteen;
import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;

public class CanteenList {
	
	
	private static JFreeChart createChart(PieDataset dataset) {

		JFreeChart chart = ChartFactory.createPieChart(Constants.REPORT_CANTEEN_STATISTICS, // chart
																							// title
				dataset, // data
				false, // no legend
				true, // tooltips
				false // no URL generation
		);

		// set a custom background for the chart
		chart.setBackgroundPaint(
				new GradientPaint(new Point(0, 0), new Color(20, 20, 20), new Point(400, 200), Color.DARK_GRAY));

		// customise the title position and font
		TextTitle t = chart.getTitle();
		t.setHorizontalAlignment(HorizontalAlignment.LEFT);
		t.setPaint(new Color(240, 240, 240));
		t.setFont(new Font("Arial", Font.BOLD, 26));

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setBackgroundPaint(null);
		plot.setInteriorGap(0.04);
		plot.setOutlineVisible(false);

		// use gradients and white borders for the section colours
		plot.setSectionPaint("Others", createGradientPaint(new Color(200, 200, 255), Color.BLUE));
		plot.setSectionPaint("Samsung", createGradientPaint(new Color(255, 200, 200), Color.RED));
		plot.setSectionPaint("Apple", createGradientPaint(new Color(200, 255, 200), Color.GREEN));
		plot.setSectionPaint("Nokia", createGradientPaint(new Color(200, 255, 200), Color.YELLOW));
		// plot.setDefaultSectionOutlinePaint(Color.WHITE);
		plot.setSectionOutlinesVisible(true);
		// plot.setDefaultSectionOutlineStroke(new BasicStroke(2.0f));

		// customise the section label appearance
		plot.setLabelFont(new Font("Courier New", Font.BOLD, 20));
		plot.setLabelLinkPaint(Color.WHITE);
		plot.setLabelLinkStroke(new BasicStroke(2.0f));
		plot.setLabelOutlineStroke(null);
		plot.setLabelPaint(Color.WHITE);
		plot.setLabelBackgroundPaint(null);

		// add a subtitle giving the data source
		TextTitle source = new TextTitle("Source: http://www.bbc.co.uk/news/business-15489523",
				new Font("Courier New", Font.PLAIN, 12));
		source.setPaint(Color.WHITE);
		source.setPosition(RectangleEdge.BOTTOM);
		source.setHorizontalAlignment(HorizontalAlignment.RIGHT);
		chart.addSubtitle(source);
		return chart;

	}

	/**
	 * A utility method for creating gradient paints.
	 * 
	 * @param c1
	 *            color 1.
	 * @param c2
	 *            color 2.
	 * 
	 * @return A radial gradient paint.
	 */
	
	
	
	
	
	private static RadialGradientPaint createGradientPaint(Color c1, Color c2) {
		Point2D center = new Point2D.Float(0, 0);
		float radius = 200;
		float[] dist = { 0.0f, 1.0f };
		return new RadialGradientPaint(center, radius, dist, new Color[] { c1, c2 });
	}
	
	
	
	

	private List<Canteen> availableCanteens;

	
	public CanteenList() {
		availableCanteens = new ArrayList<Canteen>();
		RandomCanteen gen = new RandomCanteen();
		availableCanteens = gen.generate(10);
	}
	
	
	
	

	public void generateCanteenStatisticsReport() {
		PDFDocument pdfDoc = new PDFDocument();
		pdfDoc.setTitle("Canteen Statistics Report");
		pdfDoc.setAuthor("Employee Card System");
		Page page = pdfDoc.createPage(new Rectangle(612, 468));
		PDFGraphics2D g2 = page.getGraphics2D();
		JFreeChart chart = createChart(createDatasetCanteenStatistics());
		chart.setPadding(new RectangleInsets(4, 8, 2, 2));
		ChartPanel panel = new ChartPanel(chart, false);
		panel.setMouseWheelEnabled(true);
		panel.setPreferredSize(new Dimension(600, 300));
		chart.draw(g2, new Rectangle(0, 0, 612, 468));
		pdfDoc.writeToFile(new File(Constants.REPORT_CANTEEN_STATISTICS));

	}

	
	
	
	
	public List<Canteen> getEmployeeIDs() {
		return availableCanteens;
	}

	
	
	
	
	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return tmpDir.exists();
	}

	
	
	
	
	public void setCanteenIDs(List<Canteen> canteens) {
		this.availableCanteens = canteens;
	}

	
	
	
	
	private PieDataset createDatasetCanteenStatistics() {
		int sumWithdrawals = 0;
		int sumDeposits = 0;
		for (Canteen s : availableCanteens) {
			sumWithdrawals += s.getCountWithdrawals();
			sumDeposits += s.getCountDeposits();
		}
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("withdrawal", sumWithdrawals);
		dataset.setValue("deposit", sumDeposits);

		return dataset;
	}
}

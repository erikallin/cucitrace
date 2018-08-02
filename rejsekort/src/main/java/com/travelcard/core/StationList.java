package com.travelcard.core;

import java.awt.Rectangle;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;
import com.travelcard.datagenerator.util.RandomStations;

public class StationList {
	private List<Station> availableStations;

	public List<Station> getUserIDs() {
		return availableStations;
	}

	public void setStationIDs(List<Station> stations) {
		this.availableStations = stations;
	}

	public StationList() {
		availableStations = new ArrayList<Station>();
		RandomStations gen = new RandomStations();
		availableStations = gen.generate(10);
	}

	public void generateStationStatisticsReport() {
		PDFDocument pdfDoc = new PDFDocument();
		pdfDoc.setTitle("Station Statistics Report");
		pdfDoc.setAuthor("Travel Card System");
		createDatasetStationStatistics();
		Page page = pdfDoc.createPage(new Rectangle(612, 468));
		PDFGraphics2D g2 = page.getGraphics2D();
		createDatasetStationStatistics();
//print pie chart in document
		pdfDoc.writeToFile(new File(Constants.REPORT_STATION_STATISTICS));

	}


	private void createDatasetStationStatistics() {
		int sumCheckIn=0;
		int sumCheckOut=0;
		for (Station s : availableStations) {
			sumCheckIn+= s.getCountCheckIn();
			sumCheckOut+= s.getCountCheckOut();
		}
		//create pie chart (2 values)
		//draw pie chart
	}

	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return tmpDir.exists();
	}



}

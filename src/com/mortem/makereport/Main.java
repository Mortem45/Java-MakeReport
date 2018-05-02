/**
 *
 */
package com.mortem.makereport;

import com.mortem.makereport.Report;

/**
 * @author mortem45
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Report report = new Report();
		//Nombre del reporte
		report.setNameFile("reporte");
		//extencion del archivo
		report.setExtension("txt");
		//titulo para el reporte
		report.setTitle(":: REPORTE:: \n");
		//contenido
		String content = report.getTitle();
		for (int i = 0; i < 5; i++) {
			content += "\nReporte : " + i;
			
		}
		report.setContent(content);
		report.makeReport();
	}

}

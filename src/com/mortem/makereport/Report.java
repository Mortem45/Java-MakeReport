package com.mortem.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <h1>MakeReport</h1>
 * <p>
 * Es una clase para la generacion de reportes, donde se le puede poner un titulo,
 *  un nombre y la extencion.
 * @author mortem45
 *
 */

public class Report {
	
	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * {@code MakeReport()} un metodo encargado de  generar el archivo con su contenido.
	 * @param title: el titulo que se le dara al archivo.
	 * @param nameFile: El nombre que tendra el archivo.
	 * @param content: el contenido que ira dentro del documento.
	 * @param extension: la extecion que tendra el archivo.
	 * 
	 * @author mortem45
	 * */
	public void makeReport() {
		if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
			//Crear el archivo
			try {
				
				File file = new File(getNameFile()+"."+getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} else {
			System.out.println("Ingresa los datos del archivo");
		}
	}
	
	
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

}











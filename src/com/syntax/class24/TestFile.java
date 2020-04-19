package com.syntax.class24;

public class TestFile {

	public static void main(String[] args) {
		
		File javafile=new JavaFile();
		javafile.close();
		javafile.edit();
		javafile.open();
		
		File word=new WordFile();
		word.close();
		word.edit();
		word.open();
		
		File pdf=new PDFFile();
		pdf.close();
		pdf.edit();
		pdf.open();
	
		

	}

}

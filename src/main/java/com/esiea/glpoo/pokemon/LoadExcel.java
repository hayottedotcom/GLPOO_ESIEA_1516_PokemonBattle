package com.esiea.glpoo.pokemon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class LoadExcel {
	static String boule1,boule2;
	int index1,index2;
	static int cpt=4;
	static HSSFRow row1,row2;
	LoadExcel(){
			
			Random();
			POIFSFileSystem fs;
			try {
				fs = new POIFSFileSystem(new FileInputStream("src/main/excel/euromillions_3.xls"));
				HSSFWorkbook wb = new HSSFWorkbook(fs);
				HSSFSheet sheet = wb.getSheetAt(0);
			    row1 = sheet.getRow(index1);
			    row2 = sheet.getRow(index2);
			    boule1=row1.getCell(4).toString();
			    boule2=row2.getCell(4).toString();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    //boule1.replaceAll(".0", "");
		    //boule1.replaceAll("", "");
			//System.out.println(row.getCell(4));
			//System.out.println(index);
	
	}
	public static void nextBoule(){
		cpt++;
		boule1=row1.getCell(cpt).toString();
	    boule2=row2.getCell(cpt).toString();
	}
	public void Random(){
		 index1= (int) (Math.random() * 100 );
		 index2= (int) (Math.random() * 100 ); 
	}

}

package com.esiea.glpoo.pokemon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class LoadExcel {
	String boule1,boule2;
	LoadExcel(){
		
		 try {
			int index1= (int) (Math.random() * 100 );
			int index2= (int) (Math.random() * 100 );
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("src/main/excel/euromillions_3.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
		    HSSFRow row1 = sheet.getRow(index1);
		    HSSFRow row2 = sheet.getRow(index2);
		    boule1=row1.getCell(4).toString();
		    boule2=row2.getCell(4).toString();
		    //boule1.replaceAll(".0", "");
		    //boule1.replaceAll("", "");
			//System.out.println(row.getCell(4));
			//System.out.println(index);
			System.out.println(boule1.replaceAll(".0", ""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.esiea.glpoo.pokemon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class LoadExcel {
	String boule1;
	LoadExcel(){
		
		 try {
			int index= (int) (Math.random() * 100 );
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("src/main/excel/euromillions_3.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
		    HSSFRow row = sheet.getRow(index);
		    boule1=row.getCell(4).toString();
			System.out.println(row.getCell(4));
			System.out.println(index);
			System.out.println(boule1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

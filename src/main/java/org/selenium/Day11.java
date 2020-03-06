package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day11 {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Sridharannamalai\\eclipse-workspace\\Test\\Data\\Book1.xlsx");
	FileInputStream stream =new FileInputStream(f);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s=w.getSheet("Sheet1");
	Row r=s.getRow(1);
	Cell c=r.getCell(2);
	System.out.println(c);
	}
	}


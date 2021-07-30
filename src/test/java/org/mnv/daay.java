package org.mnv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import okhttp3.internal.Util;

public class daay {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\mavdaaay\\target\\mavenlaunch.xlsx");
	FileInputStream fin =new FileInputStream(file);
	Workbook wk=new XSSFWorkbook(fin);
	Sheet sh=wk.getSheet("sheet1");
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row row=sh.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell=row.getCell(j);
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				String s = cell.getStringCellValue();
				System.out.println(s);
				
			}
			else if(DateUtil.isCellDateFormatted(cell));
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat format =new SimpleDateFormat("dd-mmm-yyyy");
			String format2 = format.format(dateCellValue);
			
			System.out.println(format2);
			
			
		}else {
	
		}
	
			
		 
		{		
			
		}
	}
	Row r=sh.getRow(1);
	Cell c=r.getCell(1);
	String l = c.getStringCellValue();
	System.out.println(l);
			
			
			
}
}

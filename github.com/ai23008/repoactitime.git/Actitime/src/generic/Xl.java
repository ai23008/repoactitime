package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.examples.NewWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Xl {
	
	
	public static int getRowCount(String path,String sheet) {
		int rc=0;
		Workbook wb;
		try {
			wb = WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(sheet).getLastRowNum();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return rc;
			
		
	}
	public static String getData(String path,String sheet,int r,int c) {
		String V="";
		Workbook wb;
		try {
			wb = WorkbookFactory.create(new FileInputStream(path));
			V =wb.getSheet(sheet).getRow(r).getCell(c).toString();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return V;
		
	}
	

}

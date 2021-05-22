package helloworld_amit;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelTest {
  @Test (enabled=false)
  public void readAllRowsColumn() throws Exception {
	  System.out.println("hi");
	  
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/TestData/Maintenance  for 313.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheetAt(0);
	  int lastRowNum = sh.getLastRowNum();
	  int lastColumnNumber = sh.getRow(0).getLastCellNum();
	  System.out.println("Last Row Number is "+lastRowNum);
	  System.out.println("Last Column Number is "+lastColumnNumber);
	  
	  for (int i=0; i<lastRowNum; i++) {
		  for (int j=0; j<lastColumnNumber; j++) {
		  sh.getRow(i).getCell(j).setCellType(CellType.STRING);
		  }
	  }
	  for (int i=0; i<lastRowNum; i++) {
		  for (int j=0; j<lastColumnNumber; j++) {
		  System.out.print("Value at "+(i+1)+" Row are "+sh.getRow(i).getCell(j).getStringCellValue()+" , ");
		  }
		  System.out.println();
	  }
  }
  
  @Test (enabled=false)
  public void aumFirstColumn() throws Exception {
	  System.out.println("SUM OF FIRST COLUMN");
	  
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/TestData/Maintenance  for 313.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheetAt(0);
	  int lastRowNum = sh.getLastRowNum();
	  double sum =0;
	  for (int i=0; i<lastRowNum; i++) {
		  sum = sum+sh.getRow(i).getCell(0).getNumericCellValue();
	  }
	  
	  System.out.println("SUM OF FIRST COLUMN are "+sum);
	  
	  
  }
  
  
  @Test (enabled=false)
  public void firstColumnData() throws Exception {
	  System.out.println("FIRST COLUMN DATA ARE");
	  
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/TestData/Maintenance  for 313.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheetAt(0);
	  int lastRowNum = sh.getLastRowNum();
	  List<Double> columnData = new ArrayList<Double>();
	  
	  for (int i=0; i<lastRowNum; i++) {
		  columnData.add(sh.getRow(i).getCell(0).getNumericCellValue());
	  }
	  
	  for (double data : columnData) {
		  System.out.println(data);
	  }
	  
  }
}

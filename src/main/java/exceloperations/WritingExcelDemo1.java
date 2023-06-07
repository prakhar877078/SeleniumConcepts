package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo1 {

	public static void main(String[] args) throws IOException {

		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp_info");
		
		Object empdata[][] = {
				
				{"EmpId","Name","Job"},
				{101,"David","Engineer"},
				{102,"Prakhar","Engineer"},
				{103,"Pranjal","Engineer"}
		};
		
		//Using For Loop
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filepath = ".\\Datafile\\employee.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		
		outstream.close();
		System.out.println("employee.xlsx file written successfully....");
		
	}

}

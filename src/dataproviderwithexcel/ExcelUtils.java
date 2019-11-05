package dataproviderwithexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFWorkbook wb;
	
	private static XSSFSheet sh;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static Object[][] setexcel(String FilePath, String SheetName) throws Exception {

		String[][] celldata = null;

		try {

			FileInputStream ExcelFile = new FileInputStream(FilePath);

			// Access the required test data sheet

			wb = new XSSFWorkbook(ExcelFile);

			sh = wb.getSheet(SheetName);

			 int totalRows = sh.getLastRowNum();
			//int totalRows = sh.getPhysicalNumberOfRows() + 1;

			// you can write a function as well to get Column count

			int totalCols = 3;

			celldata = new String[totalRows][totalCols];

			int ci = 0; 

			for (int i = 1; i <= totalRows; i++, ci++) {

				int cj =0;
				
				for (int j = 1; j <= totalCols; j++, cj++) {
					
					Cell = sh.getRow(i).getCell(j);
					
					if(Cell.getCellType()==4) {
						break;
					}else {

					celldata[ci][cj] = sh.getRow(i).getCell(j).getStringCellValue();
					
					System.out.print(celldata[ci][cj] + " ");
					
					}
				}
				System.out.println();

			}

		}

		catch (FileNotFoundException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return (celldata);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = sh.getRow(RowNum).getCell(ColNum);
			// String CellData = Cell.getStringCellValue();
			//
			// return CellData;

			int dataType = Cell.getCellType();

			if (dataType == 4) {

				return "";

			} else {

				String CellData = Cell.getStringCellValue();

				return CellData;

			}
		} catch (Exception e) {

			return "";

		}

	}
}

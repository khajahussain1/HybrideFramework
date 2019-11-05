package dataproviderwithexceltestcasewise;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Find_max_number_in_a_colm {
	
	private String path = System.getProperty("user.dir") + "/src/testData/Testcasewise.xlsx";

	private String sheetname = "Sheet1";

	@Test
	public void setexcelfile() throws IOException, ParseException {
		
		FileInputStream fi = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet s = wb.getSheet(sheetname);

		int r = 0, m = 0;

		int trows = s.getLastRowNum() + 1;

		for (int i = 1; i < trows; i++) {
			
			String max = s.getRow(i).getCell(3).getStringCellValue();
			
			m = Integer.parseInt(max);

			if (m > r) {
				
				r = m;

			}

		}
		System.out.println(r);
	}

}

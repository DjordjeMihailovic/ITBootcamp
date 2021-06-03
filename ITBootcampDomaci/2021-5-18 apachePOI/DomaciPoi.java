package VezbanjePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DomaciPoi {

	public static void main(String[] args) {
		
		double zbir = 0;
		
		try {
		File f = new File("domaci.xlsx");
		InputStream is = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(is);
		Sheet sheet = wb.getSheetAt(0);
		int zadnjiRow = sheet.getLastRowNum();
		Cell cell1;
		Row row1;
		int x = 0;
		
			while (x < zadnjiRow) {
				row1 = sheet.getRow(x);
				cell1 = row1.getCell(0);
				zbir = zbir + cell1.getNumericCellValue();
				x++;
			}
	}
		catch (Exception e) {
			System.out.println(zbir);
			System.out.println("Nema Daljih zadatih vrednosti");
		}

	}
}

package automationTestingDPIA;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.io.FileOutputStream;
import java.io.IOException;

public class apache_poi{
	public static void main(String[] args) {
		try {
			// Membuat workbook dan sheet
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Sheet1");

			// Membuat header row
			XSSFRow headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("EmployeeName");
			headerRow.createCell(1).setCellValue("AGE");
			headerRow.createCell(2).setCellValue("Dept");

			// Membuat data row
			XSSFRow dataRow = sheet.createRow(1);
			dataRow.createCell(0).setCellValue("Simpson");
			dataRow.createCell(1).setCellValue("35"); // Gunakan integer untuk angka
			dataRow.createCell(2).setCellValue("DE");

			// Menulis ke file
			FileOutputStream fileOut = new FileOutputStream("employee.xlsx");
			workbook.write(fileOut);
			fileOut.close(); // Tutup FileOutputStream

			// Tutup workbook
			workbook.close();

			System.out.println("Excel file created successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

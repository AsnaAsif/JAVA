package excelRead;

import java.io.IOException;

public class ExcelCall extends ExcelCode {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelCode.readIntegerData(4, 1));
		System.out.println(ExcelCode.readStringData(4, 0));
		

	}

}

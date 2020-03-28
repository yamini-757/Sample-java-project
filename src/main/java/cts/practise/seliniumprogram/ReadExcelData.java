package cts.practise.seliniumprogram;

import cts.miniprjct.utility.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig excel=new ExcelDataConfig("C:\\\\Users\\\\yamini\\\\eclipse-workspace\\\\sample-java-project\\\\src\\\\test\\\\resources\\\\XLSX\\\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
	}

}

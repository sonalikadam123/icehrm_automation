package com.icehem_automation.LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.ExcelUtil;

public class ExcelTest {

    @DataProvider
    public Object [][]  getTestData(){
        ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "C:\\Users\\DELL\\Documents\\TestData.xlsx";
       
        String sheetName = "credentials";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getTestData")
    public void test(String username, String password){
        System.out.println(username + " "+ password);
    }

}
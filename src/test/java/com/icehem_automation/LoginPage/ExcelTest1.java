package com.icehem_automation.LoginPage;

import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.EmpDetails;
import com.icehrm_automation.utility.ExcelUtil;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest1 extends BaseClass {

    @DataProvider
    public Object[][] getTestData() {
        ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "C:\\Users\\DELL\\Documents\\Book11.xlsx";
        String sheetName = "Sheet1";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getTestData")
    public void test(String username, String password) {
        System.out.println(username + "C:\\\\Users\\\\DELL\\\\Documents\\\\Book11.xlsx" + password);
    }

    @DataProvider
    public Object[][] getEmpData() {
        ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "C:\\Users\\DELL\\Documents\\Book11.xlsx";
        String sheetName = "TestData";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getEmpData")
    public void empTest(EmpDetails empDetails) {
        click(By.id("EmployeeMenu"));
        click(By.id("add_new"));
        enterText(By.id("empNum"), String.valueOf(empDetails.getId()));
        enterText(By.id("firstName"), empDetails.getFirstName());
        enterText(By.id("mname"), empDetails.getMiddleName());
        enterText(By.id("lastName"), empDetails.getLastName());
        click(By.id("save"));

    }
}

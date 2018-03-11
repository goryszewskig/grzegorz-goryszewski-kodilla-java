package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY  = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH  = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR  = "//*[@id=\"year\"]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByValue("2");

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByValue("11");

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1999");


    }
}

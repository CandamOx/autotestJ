package ru.team.qa.pages;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;
import cucumber.runner.RunnerSupplier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    static WebDriver driver = new ChromeDriver();

    @Когда("^открыть главную страницу$")
    @When("^open main page$")
    public static void openMain() {
        System.out.println(System.getProperty("webdriver.chrome.driver"));
//        System.out.println(driver);
//        driver.get(System.getProperty("default.url"));
    }

    @Когда("^нажать на кнопку (.+)$")
    @When("^push button (.+)$")
    public static void clickButton(String button) {
        String xpath = "";
    }

    @Когда("^заполнить поле (.+) текстом (.+)$")
    @When("^fill in the field (.+) with text (.+)$")
    public static void putText() {

    }
}

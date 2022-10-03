package ru.team.qa.pages;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;
import cucumber.runner.RunnerSupplier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.Arrays;

public class MainPage {
    static ChromeDriver driver = new ChromeDriver();;

//    @Before
//    private static void setup() {
//        System.getProperties();
//        driver = new ChromeDriver();
//    }

    @Когда("открыть главную страницу")
    @When("open main page")
    public void openMain() {
        System.out.println("url: " + System.getProperty("default.url"));
        System.out.println("driver: " + System.getProperty("webdriver.chrome.driver"));
        driver.get(System.getProperty("default.url"));
        throw new cucumber.api.PendingException();
    }

    @Когда("^нажать на кнопку (.+)$")
    @When("^push button (.+)$")
    public static void clickButton(String button) {
        String xpath = "";
    }

    @Когда("^заполнить поле (.+) текстом (.+)$")
    @When("^fill in the field (.+) with text (.+)$")
    public static void putText(String input, String text) {

    }
}

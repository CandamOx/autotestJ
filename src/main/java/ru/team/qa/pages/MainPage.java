package ru.team.qa.pages;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    WebDriver driver = new ChromeDriver();

    @Когда("^открыть главную страницу$")
    @When("^open main page$")
    public static void openMain() {

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

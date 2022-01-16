package ru.team.qa.pages;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;

public class MainPage {

    @Когда("^нажать на кнопку (.+)")
    @When("^push button (.+)")
    public static void clickButton(String button) {
        // тут селениумом надо сделать клик по кнопке
        // в идеале бы сделать это через super-методы и @Override, можно попробовать разобраться
    }
}

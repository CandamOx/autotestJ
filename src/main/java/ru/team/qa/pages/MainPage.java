package ru.team.qa.pages;

import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;

public class MainPage {

    @Когда("^открыть главную страницу$")
    @When("^open main page$")
    public static void openMain() {

    }

    @Когда("^нажать на кнопку (.+)$")
    @When("^push button (.+)$")
    public static void clickButton(String button) {
        // тут селениумом надо сделать клик по кнопке
        // в идеале бы сделать это через super-методы и @Override, можно попробовать разобраться
    }

    @Когда("^заполнить поле (.+) текстом (.+)$")
    @When("^fill in the field (.+) with text (.+)$")
    public static void putText() {

    }
}

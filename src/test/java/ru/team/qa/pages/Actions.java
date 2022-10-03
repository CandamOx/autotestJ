package ru.team.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Actions {
    @FindBy(linkText = "ABOUT")
    @CacheLookup
    private WebElement aboutButton;
}

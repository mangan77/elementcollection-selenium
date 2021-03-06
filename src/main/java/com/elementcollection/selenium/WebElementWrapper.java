package com.elementcollection.selenium;

import com.elementcollection.api.Element;
import com.elementcollection.api.SelectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebElementWrapper implements Element {

    private final WebElement webElement;

    public WebElementWrapper(WebElement webElement) {
        this.webElement = webElement;
    }

    @Override
    public void click() {
        webElement.click();
    }

    @Override
    public void submit() {
        webElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        webElement.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        webElement.clear();
    }

    @Override
    public String getTagName() {
        return webElement.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return webElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return webElement.isSelected();
    }

    @Override
    public String getText() {
        return webElement.getText();
    }

    @Override
    public List<Element> findElements(String cssSelector) {
        return Elements.fromWebElements(webElement.findElements(By.cssSelector(cssSelector)));
    }

    @Override
    public boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    @Override
    public SelectElement asSelect() {
        return new SelectElementWrapper(webElement);
    }
}

package com.elementcollection.adapter.selenium;

import com.elementcollection.api.Driver;
import com.elementcollection.api.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Drivers {

    private Drivers() {
    }

    public static Driver fromWebDriver(final WebDriver webDriver) {
        return new Driver() {
            @Override
            public List<Element> findElements(String cssSelector) {
                return Elements.fromWebElements(webDriver.findElements(By.cssSelector(cssSelector)));
            }
        };
    }
}

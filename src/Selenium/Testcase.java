package Selenium;

import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Testcase {
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Map<String, Object> getVars() {
        return vars;
    }

    public void setVars(Map<String, Object> vars) {
        this.vars = vars;
    }

    private WebDriver driver;
    private Map<String, Object> vars;

    public Testcase(WebDriver driver, Map<String, Object> vars) {
        this.driver = driver;
        this.vars = vars;
    }

    public Testcase() {
    }
}

package com.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazePage {

    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button").located(By.cssSelector(".btn-success"));
    public static final Target CART_BUTTON = Target.the("cart button").located(By.id("cartur"));
    public static final Target FIRST_NAME_FIELD = Target.the("first name field").located(By.id("name"));
    public static final Target LAST_NAME_FIELD = Target.the("last name field").located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("email field").located(By.id("email"));
    public static final Target PHONE_FIELD = Target.the("phone field").located(By.id("phone"));
    public static final Target COMPANY_FIELD = Target.the("company field").located(By.id("company"));
    public static final Target ADDRESS_FIELD = Target.the("address field").located(By.id("address"));
    public static final Target CITY_FIELD = Target.the("city field").located(By.id("city"));
    public static final Target ZIP_FIELD = Target.the("zip field").located(By.id("zip"));
    public static final Target COUNTRY_FIELD = Target.the("country field").located(By.id("country"));
    public static final Target REGION_FIELD = Target.the("region field").located(By.id("region"));
    public static final Target SUBMIT_BUTTON = Target.the("submit button").located(By.id("submit"));
    public static final Target SUCCESS_MESSAGE = Target.the("success message").located(By.cssSelector(".success"));
    public static final Target CONFIRMATION_ALERT = Target.the("confirmation alert").located(By.cssSelector(".alert"));
    public static final Target HOME_BUTTON = Target.the("home button").located(By.cssSelector("a.navbar-brand")); // Assuming this is the home button
    public static Target productLink(String productName) {
        return Target.the(productName + " link").located(By.linkText(productName));
    }
    public static String productInCart(String productName) {
        return null;
    }
}

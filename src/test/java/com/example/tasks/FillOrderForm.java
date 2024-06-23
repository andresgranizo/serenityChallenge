package com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import com.example.ui.DemoblazePage;

public class FillOrderForm implements Task {

    private final String firstName, lastName, email, phone, company, address, city, zip, country, region;

    public FillOrderForm(String firstName, String lastName, String email, String phone, String company, String address, String city, String zip, String country, String region) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.region = region;
    }

    public static FillOrderForm withData(String firstName, String lastName, String email, String phone, String company, String address, String city, String zip, String country, String region) {
        return new FillOrderForm(firstName, lastName, email, phone, company, address, city, zip, country, region);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(firstName).into(DemoblazePage.FIRST_NAME_FIELD),
            Enter.theValue(lastName).into(DemoblazePage.LAST_NAME_FIELD),
            Enter.theValue(email).into(DemoblazePage.EMAIL_FIELD),
            Enter.theValue(phone).into(DemoblazePage.PHONE_FIELD),
            Enter.theValue(company).into(DemoblazePage.COMPANY_FIELD),
            Enter.theValue(address).into(DemoblazePage.ADDRESS_FIELD),
            Enter.theValue(city).into(DemoblazePage.CITY_FIELD),
            Enter.theValue(zip).into(DemoblazePage.ZIP_FIELD),
            Enter.theValue(country).into(DemoblazePage.COUNTRY_FIELD),
            Enter.theValue(region).into(DemoblazePage.REGION_FIELD),
            Click.on(DemoblazePage.SUBMIT_BUTTON)
        );
    }
}

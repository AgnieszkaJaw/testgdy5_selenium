package PageObjects;

import org.openqa.selenium.WebDriver;

public class DevToMainPage {
    String url = "https://dev.to";
    WebDriver driverInDevToMainPage;

    public DevToMainPage(WebDriver driverFromPageObjectTests) {
        this.driverInDevToMainPage = driverFromPageObjectTests;
        //przypisanie zależności przeglądarki z klasy Page do przegladarki uzywanej w klasie Dev
        driverInDevToMainPage.get(url); //otwieramy strone w przeglądarce


    }
}

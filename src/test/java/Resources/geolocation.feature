Feature: Verify link on home page
@chrome_geolocation

Scenario: Verify links on homepage by clicking on it using chrome
Given "chrome" browser should be launched
Then open url "https://the-internet.herokuapp.com/"
And verify "home" page
Then click on "Geolocation" link
And verify "geolocation" page
Then close browser
# bdd-bot
Sample automation testing application that uses Selenium &amp; Cucumber to test the behaviour of a page URL

# Steps to build & Run the test
This Test application is build for demo purpose & due to time constraint we have only included the Success scenario to test a page URL

1. Clone the reposity and checkout the `development` branch
2. Check the availaibility of the URL you want to test. The URL is hard coded in the file `com.sap.sample.automation.test.Navigation`
3. Run Maven test command to intiate the test
```
mvn test
```
4. Check the results of your test in the file `cucumber.json` located inside the `target` directory.

# Demo nopCommerce – Test Automation

A test automation project built during a Selenium/Java diploma (AMIT Learning Institute), 
automating key user flows on the nopCommerce demo e-commerce platform 
(https://demo.nopcommerce.com/).

## Overview
This project demonstrates a Cucumber BDD framework built with the Page Object Model (POM) 
design pattern, covering Register and Login functionality, with TestNG as the test runner.

## Tech Stack
- Java
- Selenium WebDriver (with WebDriverManager for driver setup)
- Cucumber (BDD)
- TestNG
- Maven

## Project Structure
```
src
├── main/resources/features   # Gherkin .feature files (F01_Register, F02_Login)
└── test/java/org.example
    ├── pages       # Page Object classes (P01_register, P02_login)
    ├── stepDefs    # Step definitions (D01_registerStepDef, D02_loginStepDef, Hooks)
    └── testRunner  # runners.java (TestNG Cucumber runner class)
pom.xml              # Maven dependencies and reporting plugins
```

## Test Scenarios Covered
- User registration with valid input (@smoke)
- User login with valid credentials (@smoke)

## How to Run
1. Clone the repository
2. Import as a Maven project
3. Run via the `runners` class in `testRunner`, or execute `mvn verify` to run tests 
   and generate the Cucumber HTML report

## Reporting
Configured with the Maven Cucumber Reporting plugin — after running `mvn verify`, 
the report is available at `target/cucumber-html-reports/overview-features.html`.

## Notes
This project was built as part of a hands-on automation diploma to practice 
BDD-style test design, the Page Object Model pattern, and TestNG-based test execution.

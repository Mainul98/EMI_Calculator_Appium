# EMI_Calculator_Appium
Real interest rates on loans with set terms and regular payments are calculated using the calculator. For instance, it can determine interest rates when automobile sellers just supply the total price and monthly payment information, leaving out the real rate on the auto loan.
# APP
## EMI Calculator
The following tasks are completed here:

An EMI Calculator app was downloaded by extracting the apk from https://apps.evozi.com/apk-downloader/.

A negative test scenario is first run, in which the user clicks the compute button without providing any information.

When the user enters the amount, interest rate, period, and processing charge and clicks the Calculate button, different data is examined.

The predicted data in the dataset is compared to the monthly EMI, total interest, processing charge, and total payment generated.

On a small scale, database testing is carried out to see whether the system can handle different types of data to produce accurate results.

A reset button will be clicked following the execution of a test case with a single data. It is tested for five distinct data.

All user information will be kept as JSON data.

APK Downloader

https://apps.evozi.com/apk-downloader/

Technology:

Tool: Selenium Webdriver

IDE: Intellij, Android Studio

Build tool: Gradle

Language: Java

Test_Runner: Appium

How to run:

Prerequisites:

JDK 8 or higher

Configure GRADLE_HOME and set allure path

Start Appium server

Steps to run:

clone the repo

give this command in root directory gradle clean test

To generate report hit this command

allure generate allure-results --clean -o allure-report

allure serve allure-results

CMD 

start appium server

npx appium -p 4723

Report!

[allure_report](![allure_report](https://user-images.githubusercontent.com/61340440/196654805-89404910-eab5-4c61-a73d-30f9e0d8fbd2.JPG)


Suites

![allure_suites](https://user-images.githubusercontent.com/61340440/196654456-3f479aca-6547-4cde-bcb0-59502d519345.JPG)

Graph


![allure_graph](https://user-images.githubusercontent.com/61340440/196654514-4e11fbf3-5083-4a93-bf7a-6838f8ec43ab.JPG)







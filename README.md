📱 Mobile Automation Testing – Android (Appium)

A professional Android Mobile Automation Testing project built using Appium, Java, and TestNG.
This project automates core user flows of a mobile shopping / medicine & health app (similar to PlatinumRx) to ensure application quality, stability, and reliability.

The framework is designed using industry-standard practices and focuses on real-world QA scenarios such as scrolling, dynamic element handling, and user interactions.

🚀 Features

🚀 App Launch validation

🔐 Login testing (Valid & Invalid scenarios)

🛍️ Product selection from listing page

➕ Add product to cart

📜 Scroll & swipe gesture handling

⏳ Explicit waits for dynamic UI

❌ Avoids hard waits (Thread.sleep)

📱 Tested on Android Emulator

🛠️ Tech Stack
Automation & Testing

Java

Appium

TestNG

Selenium WebDriver

Tools

Android Emulator

Appium Server

Eclipse IDE

Git & GitHub

📂 Project Structure
mobile-automation/
│
├── app/
│   └── onlineshop.apk
│
├── src/test/java
│   ├── base
│   │   └── BaseTest.java
│   │
│   ├── tests
│   │   ├── LaunchTest.java
│   │   ├── LoginTest.java
│   │   ├── AddToCartTest.java
│
├── pom.xml
├── README.md

🧪 Test Cases Covered
Test Case	Description
LaunchTest	Verifies application launches successfully
LoginTest	Validates login functionality
AddToCartTest	Selects product, scrolls page, and adds item to cart
▶️ How to Run the Project

Start Android Emulator

Start Appium Server (default port 4723)

Open project in Eclipse

Right-click any test file
👉 Run As → TestNG Test

⚙️ How It Works

Appium installs the APK automatically on the emulator

Tests interact with UI elements using accessibilityId and gestures

Scroll is handled using touch actions for React Native apps

Assertions validate expected behavior

TestNG manages execution lifecycle

🧠 Key Concepts Used

Mobile automation with Appium

Locator strategies for React Native apps

Explicit waits for stability

Scroll & swipe gestures

TestNG annotations (@BeforeClass, @Test, @AfterClass)

Maven dependency management

📌 Learning Outcomes

Built a complete Android mobile automation framework

Understood real-world QA challenges in mobile apps

Learned to automate dynamic & scrollable screens

Gained hands-on experience with Appium + Java

Learned professional project structuring and GitHub usage

📄 Project Details

Project Name: Mobile Automation Testing – Android (Appium)

Description:
Developed an Android mobile automation framework using Appium and Java to test a shopping / medicine application similar to PlatinumRx. The project covers app launch, login, product selection, add-to-cart functionality, and gesture handling with a clean and maintainable test structure.

Responsibilities:

Designed mobile automation framework

Automated core user flows

Handled scrolling using swipe gestures

Used explicit waits for dynamic elements

Maintained project on GitHub with documentation

Tools & Technologies:
Java, Appium, TestNG, Android Emulator, Eclipse IDE, Git, GitHub
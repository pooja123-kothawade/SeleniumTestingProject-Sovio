# Sovio Automation Suite

This project contains Selenium + TestNG automation tests for Sovio’s web application.  
It covers four basic flows:

- **UserRegistrationTest** → verifies the Sign‑Up page loads correctly.
- **SignInTest** → verifies the Sign‑In page loads correctly.
- **PasskeyRegistrationTest** → verifies the Passkey registration option is visible.
- **PasskeySignInTest** → verifies the Passkey sign‑in option is visible.

---

## 📂 Project Structure

SovioAutomation/
├── pom.xml
├── testng.xml
├── README.md
└── src/
└── test/
└── java/
└── tests/
├── UserRegistrationTest.java
├── SignInTest.java
├── PasskeyRegistrationTest.java
└── PasskeySignInTest.java

---

## ⚙️ Prerequisites

- Java 11 or higher
- Maven 3.x
- Chrome browser (latest)
- IntelliJ IDEA or any Java IDE

Dependencies are managed via **Maven** in `pom.xml`:
- Selenium WebDriver
- TestNG
- WebDriverManager (auto‑downloads ChromeDriver)

---

## 🚀 How to Run Tests

### Option 1: Run All Tests Together
Run the TestNG suite:
```bash
mvn test
or right‑click testng.xml in IntelliJ → Run 'Sovio Automation Suite'.

Option 2: Run Tests Individually
Run a single class:

mvn -Dtest=tests.SignInTest test
Replace SignInTest with any of the other test class names.

✅ Expected Results
Each test opens the Sovio site (https://dev.sovio.id/sign-in or https://dev.sovio.id/sign-up).

Assertions check for static text such as:

"Create an account"

"Sign in to your account"

"Continue with email"

"Continue with passkey"

All tests should pass if the pages load and contain the expected text.
⚠️ Notes & Limitations
Complex flows like email verification, QR scanning, and passkey device setup are not automated here.

Tests focus on page load validation and UI text presence to ensure stability.

Manual testing is required for external dependencies (email inbox, Android device).

📸 Submission Evidence  
Include:

Screenshots of IntelliJ/Maven console showing test execution.

<img width="763" height="161" alt="img" src="https://github.com/pooja123-kothawade/SeleniumTestingProject-Sovio/blob/main/img.png?raw=true" />
<img width="780" height="311" alt="img_1" src="https://github.com/pooja123-kothawade/SeleniumTestingProject-Sovio/blob/main/img_1.png?raw=true" />
<img width="777" height="284" alt="img_2" src="https://github.com/pooja123-kothawade/SeleniumTestingProject-Sovio/blob/main/img_2.png?raw=true" />
<img width="777" height="284" alt="img_3" src="https://github.com/pooja123-kothawade/SeleniumTestingProject-Sovio/blob/main/img_3.png?raw=true" />


👩‍💻 Author
Automation suite prepared for Sovio QA assignment.
Technologies: Selenium WebDriver, TestNG, Maven, WebDriverManager.


---


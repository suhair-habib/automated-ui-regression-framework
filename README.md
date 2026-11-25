# Automated UI & Regression Testing Framework (Java + Selenium)

A modular, maintainable end-to-end UI test automation framework built with **Java 17**, **Selenium WebDriver 4**, **TestNG**, and **Maven**. Designed using the **Page Object Model (POM)** architecture to separate test logic from UI locators and streamline regression cycles.

---

### 🎯 Key Features

- **Page Object Model (POM) Architecture:** Clean separation between page locators/actions (`pages/`) and test assertions (`tests/`), reducing maintenance overhead when UI elements change.
- **Explicit Wait Synchronization:** Built-in `WebDriverWait` wrappers to eliminate flaky tests caused by asynchronous DOM rendering.
- **CI/CD Ready:** Automatic headless execution mode when run inside continuous integration pipelines (e.g., GitHub Actions, Jenkins).
- **TestNG Suite Management:** Supports grouped smoke/regression execution, test prioritization, and HTML/XML test reporting via `testng.xml`.

---

### 🛠️ Tech Stack

- **Language:** Java 17
- **Browser Automation:** Selenium WebDriver 4 (with built-in Selenium Manager)
- **Test Runner & Assertions:** TestNG
- **Build & Dependency Management:** Apache Maven

---

### 🚀 Getting Started

#### Prerequisites
- Java JDK 17 or higher
- Apache Maven 3.8+
- Google Chrome installed locally

#### Installation & Execution
1. Clone the repository:
   ```bash
   git clone [https://github.com/suhair-habib/automated-ui-regression-framework.git](https://github.com/suhair-habib/automated-ui-regression-framework.git)
   cd automated-ui-regression-framework

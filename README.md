# 🚀 MWS Academy - Automation Testing Framework

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-Automation-green?style=for-the-badge&logo=selenium)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![Jenkins](https://img.shields.io/badge/Jenkins-CI/CD-blue?style=for-the-badge&logo=jenkins)
![GitHub](https://img.shields.io/badge/GitHub-Version_Control-black?style=for-the-badge&logo=github)

</p>

---

# 📖 Project Overview

The **MWS Academy Automation Framework** is a Selenium-based test automation project developed using **Java** and **Maven**.

This framework automates the major functionalities of the **MWS Academy Admin Portal**, reducing manual testing efforts while ensuring application stability and faster regression testing.

The project is integrated with:

- ✅ GitHub for Version Control
- ✅ Jenkins for Continuous Integration & Continuous Deployment (CI/CD)
- ✅ Maven for Dependency Management
- ✅ Selenium WebDriver for Browser Automation

---

# 🎯 Project Goals

- Automate repetitive manual test cases
- Improve regression testing speed
- Reduce testing effort
- Detect bugs early
- Generate reliable automation results
- Support Continuous Integration using Jenkins

---

# 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Selenium WebDriver | UI Automation |
| Maven | Build Tool |
| TestNG | Test Execution |
| Git | Version Control |
| GitHub | Source Code Repository |
| Jenkins | CI/CD Pipeline |
| ChromeDriver | Browser Automation |

---

# 📂 Project Structure

```
MWSAcademy
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │
│       ├── AuthSection
│       ├── Company
│       ├── Courses
│       ├── Dashboard
│       ├── ExploratoryTesting
│       ├── Forms
│       ├── Groups
│       ├── Marketing
│       ├── MarketingContent
│       ├── Members
│       ├── New_Assignment
│       ├── Product
│       ├── Profile
│       ├── SuggestedPrice
│       └── Training
│
├── screenshots
│
├── pom.xml
│
└── README.md
```

---

# ✨ Automated Modules

The following modules have been automated:

## 🔐 Authentication

- Login
- Logout
- Forgot Password
- Session Validation

---

## 🏢 Company

- Create Company
- Update Company
- Delete Company
- View Company
- Validation Testing

---

## 📚 Courses

- Create Course
- Edit Course
- Delete Course
- Course Validation

---

## 📋 Dashboard

- Dashboard Verification
- Navigation Testing
- Dashboard UI Validation

---

## 📄 Forms

- Create Forms
- Edit Forms
- Delete Forms
- Validation Checks

---

## 👥 Members

- Add Member
- Update Member
- Delete Member
- Search Member

---

## 👨‍👩‍👧 Groups

- Create Group
- Add Members
- Edit Group
- Delete Group

---

## 📈 Marketing

- Create Marketing Campaign
- Edit Marketing Data
- Delete Marketing Data

---

## 📝 Marketing Content

- Create Marketing Content
- Update Content
- Delete Content
- Content Validation

---

## 📦 Product

- Create Product
- Edit Product
- Delete Product
- Product Validation

---

## 💰 Suggested Price

- Create Suggested Price
- Update Suggested Price
- Delete Suggested Price

---

## 🎓 Training

- Create Training
- Edit Training
- Delete Training

---

## 🆕

New Assignment Module Automation

---

## 👤 Profile

- Profile Update
- Validation Testing

---

## 🔍 Exploratory Testing

Automation scripts for exploratory scenarios.

---

# ⚙️ Framework Features

✅ Page Object Model (POM)

✅ Explicit Waits

✅ Reusable Methods

✅ Clean Project Structure

✅ Maven Dependency Management

✅ Cross Browser Ready

✅ Screenshot Capture

✅ Easy Maintenance

✅ GitHub Integration

✅ Jenkins Integration

---

# 📸 Screenshots

Automation execution screenshots are stored inside:

```
screenshots/
```

These screenshots help in debugging failed test cases.

---

# 🚀 Running the Project

### Clone Repository

```bash
git clone <your-github-repository-url>
```

---

### Import Project

Import as

```
Existing Maven Project
```

in Eclipse.

---

### Install Dependencies

```bash
mvn clean install
```

---

### Run Test Suite

```bash
mvn test
```

or

Run the TestNG XML file directly from Eclipse.

---

# 🔄 Jenkins CI/CD

This project is integrated with **Jenkins**.

Pipeline Flow:

```
Developer Pushes Code
          │
          ▼
      GitHub Repository
          │
          ▼
     Jenkins Trigger
          │
          ▼
    Build Project (Maven)
          │
          ▼
   Execute Selenium Tests
          │
          ▼
Generate Test Results
          │
          ▼
 Build Success / Failure Report
```

Benefits:

- Automatic Build
- Automatic Test Execution
- Continuous Regression Testing
- Faster Feedback
- Reliable Test Reports

---

# 📁 Reports

Execution reports can be viewed from Jenkins after every build.

Typical reports include:

- Build Status
- Console Output
- Test Results
- Failed Test Cases
- Build History

---

# 🌟 Framework Highlights

- Modular Architecture
- Scalable Framework
- Easy to Maintain
- Reusable Components
- Organized Package Structure
- CI/CD Enabled
- GitHub Version Control
- Selenium Best Practices
- Production Ready

---

# 👨‍💻 Author

**Ashish K Rai**



### Skills

- Java
- Selenium WebDriver
- TestNG
- Maven
- Git & GitHub
- Jenkins CI/CD
- Automation Testing

---

# 📌 Future Enhancements

- Extent Reports
- Allure Reports
- Cross Browser Execution
- Parallel Execution
- Docker Integration
- Selenium Grid
- Email Reports
- Data Driven Framework
- API Automation (Rest Assured)

---
 


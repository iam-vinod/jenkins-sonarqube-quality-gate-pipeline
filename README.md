# 🚀 Jenkins SonarQube Quality Gate Pipeline

## 📌 Project Name
**jenkins-sonarqube-quality-gate-pipeline**

---

## 📖 Project Overview

This project demonstrates a **production-ready CI pipeline** using **Jenkins**, **Maven**, and **SonarQube** to enforce **code quality and Quality Gates automatically**.

The pipeline:
- Builds a Java application using Maven
- Runs unit tests
- Performs static code analysis using SonarQube
- Enforces Quality Gates
- Fails the pipeline automatically if quality standards are not met

This setup reflects **real-world DevOps best practices** used in enterprise CI/CD pipelines.

---

## 🛠️ Technologies Used

- **Jenkins** – CI automation
- **SonarQube** – Static code analysis & Quality Gates
- **Maven** – Build & dependency management
- **Java 17**
- **JaCoCo** – Code coverage
- **GitHub** – Source control

---

## 📂 Project Folder Structure

```
jenkins-sonarqube-quality-gate-pipeline/
│
├── Jenkinsfile
├── README.md
└── app/
    ├── pom.xml
    └── src/
        ├── main/
        │   └── java/
        │       └── com/example/App.java
        └── test/
            └── java/
                └── com/example/AppTest.java
```


---

## 🔄 CI Pipeline Stages

1. **Checkout Code**
2. **Build & Test**
3. **SonarQube Analysis**
4. **Quality Gate Validation**
5. **Pipeline Pass / Fail Decision**

---

## 📜 Jenkinsfile Highlights

- Uses Jenkins Declarative Pipeline
- Configures Java and Maven via Jenkins tools
- Integrates SonarQube using `withSonarQubeEnv`
- Enforces Quality Gate using `waitForQualityGate`

---

## ⚙️ Prerequisites

- Jenkins installed and running
- SonarQube running and accessible
- Jenkins plugins installed:
  - Pipeline
  - Git
  - SonarQube Scanner
  - Maven Integration
- JDK 17 configured in Jenkins
- Maven configured in Jenkins
- SonarQube webhook configured in Jenkins

---

## 🔐 SonarQube Webhook Configuration

Configure the webhook in SonarQube:

http://<jenkins-ip>:8080/sonarqube-webhook/


This allows Jenkins to receive Quality Gate results.

---

## ▶️ Common Commands Used

### Clone Repository
```bash
git clone https://github.com/iam-vinod/jenkins-sonarqube-quality-gate-pipeline.git

Build & Test Locally

cd app
mvn clean verify

Run SonarQube Analysis Locally

mvn org.sonarsource.scanner.maven:sonar-maven-plugin:5.5.0.6356:sonar

Check Jenkins Initial Admin Password

sudo cat /var/lib/jenkins/secrets/initialAdminPassword

📊 Quality Gate Behavior

✅ Pipeline PASSES when:

Code coverage meets threshold

No critical bugs or vulnerabilities

Tests pass successfully

❌ Pipeline FAILS when:

Coverage is insufficient

Untested code is introduced

SonarQube Quality Gate conditions fail

🎯 Learning Outcomes

End-to-end Jenkins + SonarQube integration

Real-world Quality Gate enforcement

Maven + JaCoCo coverage integration

Debugging and troubleshooting CI pipelines

Industry-grade CI pipeline design

🧠 Key Takeaway

Jenkins does not decide quality — SonarQube does.
Jenkins only enforces the Quality Gate result automatically.

📌 Author

Vinod
DevOps | CI/CD | Jenkins | SonarQube | Cloud

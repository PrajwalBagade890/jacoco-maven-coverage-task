# JaCoCo Maven Code Coverage Task

## Aim
Integrate the JaCoCo Maven plugin into a Java Maven project, run unit tests, and generate an HTML code coverage report.

## Tools required
- JDK 17 or later
- Apache Maven 3.8 or later
- IntelliJ IDEA, Eclipse, or VS Code (optional)
- Internet connection for Maven to download dependencies the first time

## Project structure

```text
jacoco-maven-coverage-task/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/example/Calculator.java
    └── test/java/com/example/CalculatorTest.java
```

## Implementation steps

1. Open this project folder in your IDE.
2. Check that Java and Maven are installed:
   ```bash
   java -version
   mvn -version
   ```
3. Open `pom.xml`. The JaCoCo Maven plugin is configured with:
   - `prepare-agent` to attach the JaCoCo agent when tests run.
   - `report` in the Maven `verify` phase to create the coverage report.
4. Run all unit tests:
   ```bash
   mvn clean test
   ```
5. Generate the coverage report:
   ```bash
   mvn clean verify
   ```
6. Open this file in your browser:
   ```text
   target/site/jacoco/index.html
   ```
7. Review the package and class coverage. Red areas indicate code that was not executed by tests; green areas indicate code that was executed.
8. If any code is not covered, add suitable JUnit test cases and run `mvn clean verify` again.

## Expected output

- Maven build completes successfully.
- JUnit tests execute successfully.
- JaCoCo creates the HTML report at `target/site/jacoco/index.html`.
- The report shows instruction, branch, line, method, and class coverage metrics where applicable.

## Useful commands

| Command | Purpose |
|---|---|
| `mvn clean` | Removes the previous build output |
| `mvn test` | Compiles and runs unit tests |
| `mvn clean test` | Cleans and runs tests |
| `mvn clean verify` | Runs tests and generates the JaCoCo report |

## Notes
- The report is generated under `target/site/jacoco/` after `mvn clean verify`.
- Do not open `index.html` before running the build; the report folder is created by Maven.
- The report is based on the sample `Calculator` class and its JUnit tests.

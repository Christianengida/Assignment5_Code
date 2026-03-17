# Assignment 5 – SE333
## Demo Video

The recorded Playwright execution video is included in the `videos/` folder of this repository.
## Project Overview
This project implements automated testing and continuous integration for a sample application using Maven.  
The goal is to ensure software quality through unit testing, integration testing, and CI automation.

---

## Tests Implemented

### Unit Tests
- Specification-based testing
- Structural-based testing

### Integration Tests
- Specification-based testing
- Structural-based testing

---

## CI Pipeline
GitHub Actions automatically executes the following on each push:

- Maven build
- Unit tests
- Integration tests
- Checkstyle static analysis
- JaCoCo test coverage reporting

---

## Build Status

![Build](https://github.com/Christianengida/Assignment5_Code/actions/workflows/SE333_CI.yml/badge.svg)

---

## Reflection: Traditional vs LLM-Assisted UI Testing

### Traditional Playwright Testing
In the traditional Playwright approach, I manually created the test structure, used Playwright’s code generation, and refined the generated code to integrate with JUnit. This method provided full control over the test flow and allowed me to clearly understand how browser automation operates. Each selector, action, and assertion was explicitly defined, making debugging more straightforward when issues such as incorrect locators or failing assertions occurred. However, this approach required more time and effort, especially when stabilizing selectors and restructuring generated code.

---

### LLM / MCP-Assisted Testing
In the LLM-assisted approach, the workflow was faster and more guided. The AI helped generate Playwright test structures and suggested improvements when issues arose, reducing the amount of manual coding required. This made it easier to move quickly from an idea to a functional test. However, AI-generated code still required careful review. In some cases, selectors were too broad or assertions were too strict for the actual behavior of the application. As a result, understanding the underlying test logic remained essential to ensure correctness.

---

### Key Takeaways
Both approaches offer valuable advantages. Traditional Playwright testing strengthens understanding of browser automation and provides precise control, while LLM-assisted testing accelerates development and reduces repetitive work. The most effective strategy is to combine both approaches: leveraging AI for speed while applying human judgment to ensure accuracy, reliability, and maintainability.

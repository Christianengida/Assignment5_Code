# Assignment 5 – SE333

## Project Overview
This project implements automated testing and CI for the Amazon package.  
The goal is to ensure software quality using unit tests, integration tests, and continuous integration.

## Tests Implemented
- **Unit Tests**
  - specification-based
  - structural-based

- **Integration Tests**
  - specification-based
  - structural-based

## CI Pipeline
GitHub Actions automatically runs:

- Maven build
- Unit tests
- Integration tests
- Checkstyle static analysis
- JaCoCo test coverage

## Build Status

![Build](https://github.com/Christianengida/Assignment5_Code/actions/workflows/SE333_CI.yml/badge.svg)

## Reflection on Traditional vs LLM UI Testing

Reflection paragraph 1

In the traditional Playwright approach, I manually created the test structure, ran Playwright code generation, and cleaned up the generated code so it would run as a JUnit test. This approach gave me more direct control over the test flow and helped me understand exactly how the browser automation worked. I was able to see each selector, action, and assertion clearly, which made debugging easier when a locator or URL assertion failed. However, it also took more time because I had to adjust fragile selectors and rewrite parts of the generated script to make the test more stable.

Reflection paragraph 2

In the LLM or MCP-assisted approach, the process felt faster and more guided because the AI helped generate the Playwright structure and suggested ways to improve the test when issues appeared. This reduced some of the manual effort of writing code from scratch and made it easier to move from an idea to a working test. At the same time, I noticed that AI-generated code can still require human review, especially when selectors are too broad or when assertions are too strict for the actual website behavior. Because of that, the LLM-assisted method was helpful for speed, but it was still important for me to understand the test logic and verify that the generated code actually matched the site.

Reflection paragraph 3

Overall, both approaches were useful in different ways. Traditional Playwright testing helped me build a stronger understanding of browser automation and debugging, while the LLM or MCP-assisted workflow made test generation quicker and more convenient. The manual approach felt more reliable when I needed precise control, but the AI-assisted approach was better for starting quickly and reducing repetitive work. My main takeaway is that AI tools are helpful for accelerating UI testing, but they work best when combined with human review and understanding.

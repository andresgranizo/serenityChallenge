
# Serenity MVC Example

This project demonstrates an End-to-End (E2E) automation test using Serenity BDD with Screenplay and Cucumber for the website [Demoblaze](https://www.demoblaze.com/). The test covers a purchase flow where products are added to the cart, the cart is viewed, and an order form is filled out.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Tests](#running-the-tests)
- [Project Structure](#project-structure)
- [Conclusion](#conclusion)
- [License](#license)

## Prerequisites

- **JDK**: 1.8 or higher
- **Gradle**: 7.6.1
- **IntelliJ IDEA**
- **ChromeDriver**: Ensure that the ChromeDriver executable is available in your PATH.

## Setup

1. **Clone the repository**:
    ```sh
    git clone <repository_url>
    cd serenity-mvc-example
    ```

2. **Configure ChromeDriver**:
   Ensure ChromeDriver is installed and available in your system PATH. You can download it from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads).

3. **Build the project**:
    ```sh
    gradle clean build
    ```

## Running the Tests

To run the tests, execute the following command:
```sh
gradle clean test
```

The test report will be generated in the `target/site/serenity` directory. You can open the `index.html` file in a browser to view the test results.

## Project Structure

- **src/test/java/com/example/tasks**: Contains the tasks to be performed by the actors (e.g., `AddProductToCart`).
- **src/test/java/com/example/ui**: Contains the page objects representing the UI components (e.g., `DemoblazePage`).
- **src/test/java/com/example/steps**: Contains the step definitions for the Cucumber scenarios (e.g., `PurchaseSteps`).
- **src/test/resources/features**: Contains the Cucumber feature files (e.g., `purchase.feature`).

## Conclusion

This project demonstrates the automation of a purchase flow on the Demoblaze website using Serenity BDD with Screenplay and Cucumber. The test scenario includes adding products to the cart, viewing the cart, and verifying the products in the cart.

For any issues or contributions, please feel free to create an issue or a pull request in the repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

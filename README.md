
# Payment Gateway (Spring Boot + Razorpay)

A simple Spring Boot project that integrates Razorpay for payment processing. This project demonstrates how to create payment orders using the Razorpay API and provides a minimal frontend for testing payments.

## Features
- RESTful API to create Razorpay payment orders
- Securely uses Razorpay API keys from configuration
- Simple Bootstrap-based frontend for payment testing
- Java 17 & Spring Boot 3.4.4

## Tech Stack
- Java 17
- Spring Boot 3.4.4
- Razorpay Java SDK
- Maven
- Bootstrap (frontend)

## Getting Started

### Prerequisites
- Java 17+
- Maven
- Razorpay test account (for API keys)

### Setup
1. **Clone the repository:**
   ```bash
   git clone <repo-url>
   cd Payment-Gateway
   ```
2. **Configure Razorpay Keys:**
   Edit `src/main/resources/application.properties`:
   ```properties
   razorpay.key_id=YOUR_KEY_ID
   razorpay.key_secret=YOUR_KEY_SECRET
   ```
3. **Build and Run:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Access the Frontend:**
   Open [http://localhost:8080/index.html](http://localhost:8080/index.html) in your browser.

## API Endpoints
- `POST /api/payments/create-order?amount=<amount>&currency=<currency>`
  - Creates a Razorpay order. Example: `amount=100`, `currency=INR`.

## Example Frontend Usage
- Enter an amount and click "Pay Now" to test the payment flow using Razorpay Checkout.

## Dependencies
Key dependencies from `pom.xml`:
- `spring-boot-starter-web`
- `com.razorpay:razorpay-java`
- `lombok` (optional)

## License
This project is for demo/educational purposes.
=======
Add and create Your Own Razorpay api keys
 f3e812b3529228952f156494780fec852fcea996

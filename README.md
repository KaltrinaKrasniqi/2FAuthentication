# Two Factor Authentication

This is a project developed in Android Studio using Java, designed to enhance user authentication security during login and sign-up by implementing email-based Two Factor Authentication.

## Features
- Sends a verification code to the user's email during login or sign-up for additional security.
- Users must input the verification code sent to their email to proceed.
- If the verification code expires, users can request a new code by using the "Resend Code" option.
- Upon successful verification, the user is redirected to a simple homepage.

## Getting Started

### Prerequisites
- Ensure you have Android Studio installed on your system.
- Use a Gmail account with an app password enabled for sending emails.

### Run the application
1. Clone the repository:
   ```bash
   git clone https://github.com/KaltrinaKrasniqi/2FAuthentication.git
2. Launch Android Studio and select the Open an Existing Project option. Navigate to the cloned repository folder and open it.
3. Enter an email address during the login or sign-up process.
4. Check the inbox of the provided email to receive the verification code.
5. Enter the code on the verification page to complete the authentication process.

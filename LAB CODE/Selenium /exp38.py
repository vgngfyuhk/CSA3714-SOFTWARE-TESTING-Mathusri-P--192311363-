
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create registration webpage
html = """
<html>
<head>
    <title>Registration Form</title>
</head>
<body style="font-family:Arial; margin:40px;">

    <h2>Student Registration Form</h2>

    <label>Name:</label><br>
    <input type="text" id="name" placeholder="Enter your name"><br><br>

    <label>Email:</label><br>
    <input type="email" id="email" placeholder="Enter your email"><br><br>

    <label>Password:</label><br>
    <input type="password" id="password" placeholder="Enter password"><br><br>

    <button id="register" onclick="
        document.getElementById('result').innerHTML =
        'Registration Successful!';
        document.getElementById('result').style.color='green';
    ">Register</button>

    <h3 id="result"></h3>

</body>
</html>
"""

# Save webpage
file = Path("registration.html")
file.write_text(html, encoding="utf-8")

# Open Chrome
driver = webdriver.Chrome()

try:
    driver.get(file.resolve().as_uri())

    # Enter registration details
    driver.find_element(By.ID, "name").send_keys("Mathusri")
    driver.find_element(By.ID, "email").send_keys("mathusri@gmail.com")
    driver.find_element(By.ID, "password").send_keys("Mathu123")

    # Click Register button
    driver.find_element(By.ID, "register").click()

    # Display result
    result = driver.find_element(By.ID, "result").text
    print("Registration Result:", result)

    input("Press Enter to close browser...")

finally:
    driver.quit()

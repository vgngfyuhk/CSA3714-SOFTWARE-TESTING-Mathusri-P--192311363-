
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create HTML webpage
html = """
<html>
<head>
    <title>Example Domain</title>
</head>
<body>
    <h2>Website Title Verification</h2>

    <label>Expected Title:</label>
    <input type="text" id="title" placeholder="Enter website title">

    <button onclick="
        let value = document.getElementById('title').value;

        if(value == document.title) {
            document.getElementById('result').innerHTML =
            'Test Passed! Website title is correct.';
        } else {
            document.getElementById('result').innerHTML =
            'Test Failed! Website title is incorrect.';
        }
    ">Verify Title</button>

    <p id="result"></p>
</body>
</html>
"""

# Save HTML file
file = Path("website_title.html")
file.write_text(html, encoding="utf-8")

# Open Chrome
driver = webdriver.Chrome()

try:
    driver.get(file.resolve().as_uri())

    # Enter input
    title = driver.find_element(By.ID, "title")
    title.send_keys("Example Domain")

    # Click button
    driver.find_element(By.TAG_NAME, "button").click()

    input("Press Enter to close browser...")

finally:
    driver.quit()

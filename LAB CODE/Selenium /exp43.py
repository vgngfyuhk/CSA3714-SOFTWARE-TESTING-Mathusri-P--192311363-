
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create HTML webpage
html = """
<html>
<head>
    <title>JavaScript Alerts</title>
</head>
<body style="font-family:Arial; margin:40px;">

    <h2>JavaScript Alert Handling</h2>

    <button id="alert" onclick="alert('This is an Alert Box!')">
        Alert
    </button>

    <br><br>

    <button id="confirm"
    onclick="confirm('Do you want to continue?')">
        Confirm
    </button>

    <br><br>

    <button id="prompt"
    onclick="prompt('Enter your name:')">
        Prompt
    </button>

    <h3 id="result">Results will appear here</h3>

</body>
</html>
"""

# Save webpage
file = Path("alerts.html")
file.write_text(html, encoding="utf-8")

# Open Chrome browser
driver = webdriver.Chrome()

try:
    driver.get(file.resolve().as_uri())

    # Handle Alert box
    driver.find_element(By.ID, "alert").click()
    alert = driver.switch_to.alert
    print("Alert Message:", alert.text)
    alert.accept()

    driver.execute_script("""
        document.getElementById('result').innerHTML =
        'Alert Accepted Successfully!';
    """)

    # Handle Confirm box
    driver.find_element(By.ID, "confirm").click()
    confirm = driver.switch_to.alert
    print("Confirm Message:", confirm.text)
    confirm.accept()

    driver.execute_script("""
        document.getElementById('result').innerHTML +=
        '<br>Confirm Accepted Successfully!';
    """)

    # Handle Prompt box
    driver.find_element(By.ID, "prompt").click()
    prompt = driver.switch_to.alert
    print("Prompt Message:", prompt.text)

    prompt.send_keys("Mathusri")
    prompt.accept()

    driver.execute_script("""
        document.getElementById('result').innerHTML +=
        '<br>Prompt Accepted Successfully!';
    """)

    print("Prompt Input: Mathusri")
    print("All JavaScript Alerts Handled Successfully!")

    input("Press Enter to close browser...")

finally:
    driver.quit()

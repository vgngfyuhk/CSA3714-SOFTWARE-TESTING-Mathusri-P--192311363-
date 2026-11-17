
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Open Chrome browser
driver = webdriver.Chrome()

try:
    # Open practice login website
    driver.get("https://the-internet.herokuapp.com/login")

    # Enter invalid username
    driver.find_element(By.ID, "username").send_keys("invaliduser")

    # Enter invalid password
    driver.find_element(By.ID, "password").send_keys("wrongpass")

    # Click Login button
    driver.find_element(By.CSS_SELECTOR, "button[type='submit']").click()

    # Wait for error message
    message = WebDriverWait(driver, 10).until(
        EC.visibility_of_element_located((By.ID, "flash"))
    ).text

    print("Username: invaliduser")
    print("Password: wrongpass")
    print("Login Result:", message)

    input("Press Enter to close browser...")

finally:
    driver.quit()

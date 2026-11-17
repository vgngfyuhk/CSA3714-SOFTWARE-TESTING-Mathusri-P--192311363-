
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Open Chrome browser
driver = webdriver.Chrome()

try:
    # Open Google
    driver.get("https://www.google.com")

    # Enter search input
    search_box = WebDriverWait(driver, 15).until(
        EC.presence_of_element_located((By.NAME, "q"))
    )

    search_box.send_keys("Saveetha School of Engineering")

    # Perform search
    search_box.send_keys(Keys.RETURN)

    # Wait for search results
    WebDriverWait(driver, 15).until(
        EC.presence_of_element_located((By.ID, "search"))
    )

    print("Google Search Completed Successfully")
    print("Search Input: Saveetha School of Engineering")
    print("Page Title:", driver.title)

    input("Press Enter to close the browser...")

finally:
    driver.quit()

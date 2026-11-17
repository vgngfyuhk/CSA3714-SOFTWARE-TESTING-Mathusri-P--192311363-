
from selenium import webdriver
from pathlib import Path

# Open Chrome browser
driver = webdriver.Chrome()

try:
    # Open Google website
    driver.get("https://www.google.com")

    # Maximize browser
    driver.maximize_window()

    # Create screenshots folder
    folder = Path("screenshots")
    folder.mkdir(exist_ok=True)

    # Capture screenshot
    screenshot_path = folder / "google_screenshot.png"
    driver.save_screenshot(str(screenshot_path))

    # Display output
    print("Website Opened Successfully")
    print("Website: Google")
    print("Screenshot Captured Successfully!")
    print("Screenshot saved in local system")

    print("Saved Location:", screenshot_path.resolve())

    input("Press Enter to close browser...")

finally:
    driver.quit()

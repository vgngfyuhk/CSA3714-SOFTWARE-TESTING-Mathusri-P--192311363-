
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create HTML webpage
html = """
<html>
<head>
    <title>Checkbox and Radio Button</title>
</head>
<body style="font-family:Arial; margin:40px;">

    <h2>Student Preference Form</h2>

    <h3>Select Your Hobbies:</h3>

    <input type="checkbox" id="reading" value="Reading"
    onchange="showResult()"> Reading<br>

    <input type="checkbox" id="music" value="Music"
    onchange="showResult()"> Music<br>

    <input type="checkbox" id="sports" value="Sports"
    onchange="showResult()"> Sports<br>

    <h3>Select Your Gender:</h3>

    <input type="radio" name="gender" value="Male"
    onchange="showResult()"> Male<br>

    <input type="radio" name="gender" value="Female"
    onchange="showResult()"> Female<br>

    <h3 id="result"></h3>

    <script>
        function showResult() {
            let hobbies = [];

            document.querySelectorAll(
                'input[type="checkbox"]:checked'
            ).forEach(item => hobbies.push(item.value));

            let gender = document.querySelector(
                'input[name="gender"]:checked'
            );

            let genderValue = gender ? gender.value : "Not selected";

            document.getElementById("result").innerHTML =
                "Selected Hobbies: " +
                (hobbies.length ? hobbies.join(", ") : "None") +
                "<br>Gender: " + genderValue;
        }
    </script>

</body>
</html>
"""

# Save webpage
file = Path("checkbox_radio.html")
file.write_text(html, encoding="utf-8")

# Open Chrome browser
driver = webdriver.Chrome()

try:
    driver.get(file.resolve().as_uri())

    print("Student Preference Form Opened Successfully")

    # Wait for manual selection
    input("Select hobbies and gender in Chrome, then press Enter here...")

    # Get selected hobbies
    hobbies = driver.find_elements(
        By.CSS_SELECTOR, "input[type='checkbox']:checked"
    )

    selected_hobbies = [item.get_attribute("value") for item in hobbies]

    # Get selected gender
    gender = driver.find_elements(
        By.CSS_SELECTOR, "input[name='gender']:checked"
    )

    selected_gender = gender[0].get_attribute("value") if gender else "Not selected"

    print("Selected Hobbies:", ", ".join(selected_hobbies) if selected_hobbies else "None")
    print("Selected Gender:", selected_gender)

    input("Press Enter to close browser...")

finally:
    driver.quit()

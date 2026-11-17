
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create HTML webpage
html = """
<html>
<head>
    <title>Dropdown Selection</title>
</head>
<body style="font-family:Arial; margin:40px;">

    <h2>Car Selection Form</h2>

    <label>Select Your Car:</label><br><br>

    <select id="cars" onchange="showResult()">
        <option value="">Choose a car</option>
        <option value="BMW">BMW</option>
        <option value="Audi">Audi</option>
        <option value="Benz">Benz</option>
        <option value="Tesla">Tesla</option>
    </select>

    <h3 id="result"></h3>

    <script>
        function showResult() {
            let car = document.getElementById("cars").value;

            if (car !== "") {
                document.getElementById("result").innerHTML =
                    "Selected Car: " + car;
                document.getElementById("result").style.color = "green";
            } else {
                document.getElementById("result").innerHTML = "";
            }
        }
    </script>

</body>
</html>
"""

# Save webpage
file = Path("dropdown.html")
file.write_text(html, encoding="utf-8")

# Open Chrome browser
driver = webdriver.Chrome()

try:
    driver.get(file.resolve().as_uri())

    # Find dropdown
    dropdown = driver.find_element(By.ID, "cars")

    print("Car Selection Form Opened Successfully")

    # Wait for manual selection
    input("Select any car in Chrome and press Enter here...")

    # Read selected car
    selected = dropdown.get_attribute("value")

    result = driver.find_element(By.ID, "result").text

    print("Selected Car:", selected)
    print("Output:", result)

    input("Press Enter to close browser...")

finally:
    driver.quit()

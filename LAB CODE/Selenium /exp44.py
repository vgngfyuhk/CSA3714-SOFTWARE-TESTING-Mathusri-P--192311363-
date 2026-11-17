
from selenium import webdriver
from selenium.webdriver.common.by import By
from pathlib import Path

# Create sample file
sample_file = Path("sample_upload.txt").resolve()
sample_file.write_text("This is a sample file for Selenium upload.")

# Create HTML webpage
html = """
<html>
<head>
    <title>File Upload</title>
</head>
<body style="font-family:Arial; margin:40px;">

    <h2>File Upload Form</h2>

    <label>Select File:</label><br><br>

    <input type="file" id="file"><br><br>

    <button id="upload" onclick="
        let file = document.getElementById('file').files[0];

        if(file) {
            document.getElementById('result').innerHTML =
            'File Uploaded Successfully!<br>File Name: ' + file.name;

            document.getElementById('result').style.color = 'green';
        } else {
            document.getElementById('result').innerHTML =
            'Please select a file!';
            document.getElementById('result').style.color = 'red';
        }
    ">Upload</button>

    <h3 id="result"></h3>

</body>
</html>
"""

# Save webpage
webpage = Path("file_upload.html")
webpage.write_text(html, encoding="utf-8")

# Open Chrome browser
driver = webdriver.Chrome()

try:
    driver.get(webpage.resolve().as_uri())

    # Select file using Selenium
    driver.find_element(By.ID, "file").send_keys(str(sample_file))

    # Click Upload button
    driver.find_element(By.ID, "upload").click()

    # Get upload result
    result = driver.find_element(By.ID, "result").text

    print("Selected File:", sample_file.name)
    print("Upload Result:", result)

    input("Press Enter to close browser...")

finally:
    driver.quit()

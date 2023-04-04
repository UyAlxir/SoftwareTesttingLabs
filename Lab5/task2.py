from selenium import webdriver


#  TODO: 1.Open Chrome browser and navigate to a website with a login form
#   (e.g. https://the-internet.herokuapp.com/login).
driver = webdriver.Chrome("chromedriver.exe")
driver.get("https://the-internet.herokuapp.com/login")

# TODO: 2.Enter a valid username and password
username_input = driver.find_element_by_id("username")
password_input = driver.find_element_by_id("password")
username_input.send_keys("tomsmith")
password_input.send_keys("SuperSecretPassword!")


# TODO: 3.Click the login button
login_button = driver.find_element_by_xpath("/html/body/div[2]/div/div/form/button")
login_button.click()

# TODO: 4.Verify that the user is redirected to the home page
assert driver.current_url == "https://the-internet.herokuapp.com/secure"

# TODO: 5.Verify that the user's username is displayed on the home page
#  (but in fact, the page will not display the user's name)
welcome_message = driver.find_element_by_xpath("/html/body/div[2]/div/div/h2")
assert welcome_message.text == "Secure Area"

# TODO: 6.Logout and verify that the user is redirected to the login page
logout_btn = driver.find_element_by_xpath("/html/body/div[2]/div/div/a")
logout_btn.click()
assert driver.current_url == "https://the-internet.herokuapp.com/login"


# TODO: 7. Enter a invalid username and password and check what's gonna happen
#  (It will warn me that the username is invalid)
username_input = driver.find_element_by_id("username")
password_input = driver.find_element_by_id("password")
username_input.send_keys("Tom Smith")
password_input.send_keys("SuperSecretPassword!")
login_button = driver.find_element_by_xpath("/html/body/div[2]/div/div/form/button")
login_button.click()

# close the driver
driver.quit()

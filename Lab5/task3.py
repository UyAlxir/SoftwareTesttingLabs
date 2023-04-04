from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains

# TODO: 1.Open Chrome browser and navigate to a website with a registration form (e.g.
#   https://demoqa.com/automation-practice-form).
driver = webdriver.Chrome("chromedriver.exe")
driver.get("https://demoqa.com/automation-practice-form")

# TODO: 2.Enter invalid data into the form fields (e.g. a non-email address in the email
#   field, a phone number with letters in the phone number field).
firstName_input = driver.find_element_by_id("firstName")
lastName_input = driver.find_element_by_id("lastName")
userEmail_input = driver.find_element_by_id("userEmail")
gender_radio3 = driver.find_element_by_id("gender-radio-3")
userNumber_input = driver.find_element_by_id("userNumber")

firstName_input.send_keys("Who")
lastName_input.send_keys("Iam")
userEmail_input.send_keys("123@1.com")
userNumber_input.send_keys("1")

# Move to element and click , If I didn't move that , there would be some errors
actions = ActionChains(driver)
actions.move_to_element(gender_radio3).click().perform()


# TODO: 3.Submit the form and verify that appropriate error messages are displayed for
#   each invalid field.

firstName_input.send_keys(Keys.ENTER)
driver.implicitly_wait(10)

assert userNumber_input.value_of_css_property("background-image") != \
       firstName_input.value_of_css_property("background-image")

# # TODO: 4.Enter valid data into the form fields.
#
# userNumber_input.send_keys("1111111111")
# driver.implicitly_wait(10)
#
# assert userNumber_input.value_of_css_property("background-image") == \
#        firstName_input.value_of_css_property("background-image")
#
# # TODO: 5.Submit the form and verify that the user is redirected to a success page
#
# firstName_input.send_keys(Keys.ENTER)
# driver.implicitly_wait(10)
# assert "Thanks for submitting the form" in driver.page_source
#
# # close the driver
# driver.implicitly_wait(1000)
# driver.quit()

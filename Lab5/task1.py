from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# TODO: 1.Open Chrome browser and navigate to https://www.google.com/
driver = webdriver.Chrome("chromedriver.exe")
driver.get("https://www.google.com/")

# TODO: 2.Enter "selenium" in the search box and press Enter
search_box_input = driver.find_element_by_xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
search_box_input.send_keys("selenium")
search_box_input.send_keys(Keys.ENTER)

# TODO: 3.Verify that the search results page displays at least 7 search results
res = driver.find_element_by_id("rso")
assert len(res.find_elements_by_class_name("MjjYud")) >= 7

# TODO: 4.Verify that the first search result link is from the Selenium official website (https://www.selenium.dev/).

res1 = driver.find_element_by_xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/"
                                    "div[1]/div/div/div/div/div/div/div[1]/a")
driver.implicitly_wait(10)
assert res1.get_attribute("href") == "https://www.selenium.dev/"

# TODO: 5.Verify that the search box text contains "selenium"
search_box = driver.find_element_by_xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input")
assert search_box.get_attribute("value") == "selenium"

# close the driver
driver.implicitly_wait(1000)
driver.quit()

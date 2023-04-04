from selenium import webdriver

# TODO: 1. Open Chrome browser and navigate to a website with dynamic content (e.g. htt
#   ps://the-internet.herokuapp.com/dynamic_content).
driver = webdriver.Chrome("chromedriver.exe")
driver.get("https://the-internet.herokuapp.com/dynamic_content")

# TODO: 2.Verify that the page displays three images.

contents = driver.find_element_by_xpath("/html/body/div[2]/div/div/div/div")
assert len(contents.find_elements_by_tag_name("img")) == 3

# TODO: 3.Click the "Shuffle" button to change the images

imgs_before = []
for img in contents.find_elements_by_tag_name("img"):
    imgs_before.append(img.get_attribute("src").split(".")[-2].split("-")[-1])

print(imgs_before)

shufful_btn = driver.find_element_by_xpath("/html/body/div[2]/div/div/p[2]/a")
shufful_btn.click()


# TODO: 4.Verify that the images have been shuffled and that there are still three images
#   displayed.

imgs_after = []
contents = driver.find_element_by_xpath("/html/body/div[2]/div/div/div/div")
for img in contents.find_elements_by_tag_name("img"):
    imgs_after.append(img.get_attribute("src").split(".")[-2].split("-")[-1])

print(imgs_after)

assert imgs_before != imgs_after

# close the driver
driver.implicitly_wait(1000)
driver.quit()

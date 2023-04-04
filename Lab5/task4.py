from selenium import webdriver

# TODO: 1. Open Chrome browser and navigate to a website with a navigation menu (e.g. h
#   ttps://www.udemy.com/)
driver = webdriver.Chrome("chromedriver.exe")
driver.get("http://www.tju.edu.cn")

# TODO: 2.Click on each link in the navigation menu and verify that the corresponding
#   page loads.

menu = driver.find_element_by_id("nav_menu")
links = menu.find_elements_by_class_name("mainlevel")
main_page = driver.current_url
for link in links:
    href = link.find_element_by_xpath("a").get_attribute("href")
    driver.execute_script("window.open(arguments[0], '_blank');", href)
    handles = driver.window_handles
    assert len(handles) == 2
    driver.switch_to.window(handles[1])
    assert main_page != driver.current_url
    driver.close()
    driver.switch_to.window(handles[0])

# TODO: 3.Click on the website logo or home link and verify that the user is redirected to
#   the home page.

main_page = driver.current_url
logo = driver.find_element_by_xpath("/html/body/header/div[3]/div/a/img")
logo.click()
assert driver.current_url == main_page

# TODO: 4.Use the back and forward buttons in the browser to navigate between pages
#   and verify that the correct pages are loaded.

menu = driver.find_element_by_id("nav_menu")
links = menu.find_elements_by_class_name("mainlevel")
main_page = driver.current_url
hrefs = [main_page]
for i in range(2):
    href = driver.find_element_by_xpath("/html/body/nav/ul/li[%d]/a" % (i+1)).get_attribute("href")
    hrefs.append(href)
    driver.get(href)

assert driver.current_url == hrefs[2]
driver.back()
assert driver.current_url == hrefs[1]
driver.back()
assert driver.current_url == hrefs[0]
driver.forward()
assert driver.current_url == hrefs[1]
driver.forward()
assert driver.current_url == hrefs[2]

# close the driver
driver.implicitly_wait(1000)
driver.quit()

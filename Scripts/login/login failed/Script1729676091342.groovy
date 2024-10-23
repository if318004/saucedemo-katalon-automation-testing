import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Akses url web
WebUI.openBrowser('https://www.saucedemo.com/')

//Maximize browser
WebUI.maximizeWindow()

//input wrong / locked out username
WebUI.setText(findTestObject('saucedemo/Field/username'), 'locked_out_user')

//input password
WebUI.setText(findTestObject('saucedemo/Field/password'), 'secret_sauce')

//click button login
WebUI.click(findTestObject('saucedemo/Button/button-login'))

//verify bahwa invalid login & muncul error
WebUI.verifyElementPresent(findTestObject('saucedemo/error/error-locked-out-user'), 20)

//WebUI.closeBrowser() --> dipindahkan ke test suite login 
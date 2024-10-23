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

//akses url web
WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

//field username
WebUI.setText(findTestObject('saucedemo/Field/username'), 'standard_user')

//field password
WebUI.setText(findTestObject('saucedemo/Field/password'), 'secret_sauce')

//click button 'login'
WebUI.click(findTestObject('saucedemo/Button/button-login'))

//verify when login success
WebUI.verifyElementPresent(findTestObject('saucedemo/Icon/shopping-cart'), 20)

//test selesai - browser di close
//WebUI.closeBrowser() ----> ini dipanggil di Test Suites saja.

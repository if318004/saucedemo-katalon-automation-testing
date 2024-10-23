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

//click button checkout
WebUI.click(findTestObject ('saucedemo/Button/checkout'))

//input first-name with 'juwito'
WebUI.setText(findTestObject ('saucedemo/Field/first-name'), ('Juwito'))

//input last-name with 'siahaan'
WebUI.setText(findTestObject ('saucedemo/Field/last-name'), ('siahaan'))

//input zip with '123456'
WebUI.setText(findTestObject ('saucedemo/Field/zip'), ('123456'))

//click button 'checkout'
WebUI.click(findTestObject ('saucedemo/Button/continue-checkout'))

//click finish 
WebUI.click(findTestObject ('saucedemo/Button/finish'))

//verify order completed
WebUI.verifyElementPresent(findTestObject ('saucedemo/Teks/checkout-complete'), 10)

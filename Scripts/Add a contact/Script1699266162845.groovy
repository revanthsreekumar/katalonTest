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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wiredplus:SouthParade10@qa.conesso.io/sign-in')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/add a contact/Page_Sign in  Conesso/input_email'), 'revanth.sreekumar@idhl.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/add a contact/Page_Sign in  Conesso/input_password'), '4w8RW6A5/guMebuEITAVEw==')

WebUI.click(findTestObject('Object Repository/add a contact/Page_Sign in  Conesso/button_Sign in'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Sign in  Conesso/h5_End-To-End Test Account PROD Mailgun'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Home  Conesso/span_Audience'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Home  Conesso/a_Contacts'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Contacts  Conesso/path'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Contacts  Conesso/li_Add a new contact'))

WebUI.setText(findTestObject('Object Repository/add a contact/Page_Create Contact  Conesso/input_email'), 'testkatalon001@test.com')

WebUI.setText(findTestObject('Object Repository/add a contact/Page_Create Contact  Conesso/inputMuiDropDown'), '')

WebUI.click(findTestObject('Object Repository/add a contact/Page_Create Contact  Conesso/inputMuiDropDown'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Create Contact  Conesso/li_Subscribed'))

WebUI.click(findTestObject('Object Repository/add a contact/Page_Create Contact  Conesso/button_Create'))

WebUI.takeScreenshotAsCheckpoint('new1')

WebUI.closeBrowser()


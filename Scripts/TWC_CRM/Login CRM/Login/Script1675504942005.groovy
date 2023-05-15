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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.comment('click on Login button')

WebUI.click(findTestObject('TWC_CRM/CRM_Login/Login Button'))

WebUI.comment('Validate the getting error text in Email Id and Password')

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Login/EmailIdText'), GlobalVariable.EmailIdText)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Login/PassIdText'), GlobalVariable.PassIdText)

WebUI.comment('Enter the valid Email Id')

WebUI.setText(findTestObject('TWC_CRM/CRM_Login/Enter Email Id'), GlobalVariable.EnterEmailId)

WebUI.comment('Enter the invalid Pass')

WebUI.setText(findTestObject('TWC_CRM/CRM_Login/Enter Pass'), GlobalVariable.EnterPass)

WebUI.delay(2)

WebUI.comment('Click on eye-view icon')

WebUI.click(findTestObject('TWC_CRM/CRM_Login/Eye View'))

WebUI.comment('Click on login button')

WebUI.delay(2)

WebUI.click(findTestObject('TWC_CRM/CRM_Login/Login Button'))

WebUI.comment('Verify Flying error message')

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Login/Invalid Credentials'), GlobalVariable.FlyMessage)

WebUI.delay(5)

WebUI.comment('Refresh the page')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.comment('Enter the email id')

WebUI.setText(findTestObject('TWC_CRM/CRM_Login/Enter Email Id'), GlobalVariable.EnterEmailId1)

WebUI.delay(2)

WebUI.comment('Enter Valid Password')

WebUI.setText(findTestObject('TWC_CRM/CRM_Login/Enter Pass'), GlobalVariable.EnterValidPass)

WebUI.comment('Click on eye-view icon')

WebUI.click(findTestObject('TWC_CRM/CRM_Login/Eye View'))

WebUI.comment('Click on Login button')

WebUI.click(findTestObject('TWC_CRM/CRM_Login/Login Button'))

WebUI.comment('Set 3 second delay time')

WebUI.delay(3)

WebUI.comment('Verify Logout Text on CRM Dashboard')

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Login/Logout Button'), GlobalVariable.Logout)

WebUI.closeBrowser()


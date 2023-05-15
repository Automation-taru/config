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

CustomKeywords.'login_Config.config_login.userLogin'()

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Wallet Requests option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Wallet Requests/Wallet Requests text'), 'Wallet Requests')

WebUI.setText(findTestObject('TWC_Config/Wallet Requests/Search by client name'), 'TWC Platinum')

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Search icon'))

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Eye view icon'))

WebUI.verifyElementText(findTestObject('TWC_Config/Wallet Requests/Wallet Request - TWC Platinum text'), 'Wallet Request - TWC Platinum')

WebUI.verifyElementText(findTestObject('TWC_Config/Wallet Requests/Approved Users text'), 'Approved Users')

WebUI.setText(findTestObject('TWC_Config/Wallet Requests/Search user by email id'), 'pooja.jain@truworth.com')

WebUI.click(findTestObject('TWC_Config/Wallet Requests/user search icon through email'))

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Last Transaction'))

WebUI.setText(findTestObject('TWC_Config/Wallet Requests/Last Transaction search'), 'pooja.jain@truworth.com')

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Last transaction search icon'))

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Flagged user label'))

WebUI.setText(findTestObject('TWC_Config/Wallet Requests/Flagged User search'), 'test@gmail.com')

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Flagged User search icon'))

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Rejected Users'))

WebUI.setText(findTestObject('TWC_Config/Wallet Requests/Rejected user search by email id'), 'test2@gmail.com')

WebUI.click(findTestObject('TWC_Config/Wallet Requests/Rejected user search icon'))


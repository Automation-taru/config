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

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Admin Users option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Admin Users/All Admin Users'), 'All Admin Users')

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Search by email id'), 'tarun.kumar@truworth.com')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Search icon'))

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/eye icon of searched user'))

WebUI.back()

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Create Admin Users button'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Admin Users/Create User Account text'), 'Create User Account')

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Search by Email ids field'), 'tarun.kumar@truworth.com')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/User Search icon'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Admin Users/Toast msg for alredy added admin'), 'This Member Account is already linked with an Admin User')

WebUI.refresh()

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Search by Email ids field'), 'tarun1@gmail.com')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/User Search icon'))

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/User Type'))

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Coach User Type'))

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Enter Password'), 'Truworth@123')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Password eye view icon'))

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Enter confirm password'), 'Truworth@123')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Total experience'))

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Total experience'), '2')

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Enter Bio'), 'Testing')

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Enter About'), 'Test')

WebUI.setText(findTestObject('TWC_Config/Config_Admin Users/Enter Certificates'), 'None')

WebUI.click(findTestObject('TWC_Config/Config_Admin Users/Save Button'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Admin Users/Added email id text verify'), 'tarun1@gmail.com')


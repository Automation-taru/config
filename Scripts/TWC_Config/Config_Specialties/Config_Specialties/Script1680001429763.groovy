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

WebUI.click(findTestObject('TWC_Config/Config_Specialties/Specialties option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Specialties/All Specialties text'), 'All Specialties')

WebUI.setText(findTestObject('TWC_Config/Config_Specialties/Search field'), 'Dentist')

WebUI.click(findTestObject('TWC_Config/Config_Specialties/All Specialty button'))

WebUI.setText(findTestObject('TWC_Config/Config_Specialties/Specialty name field'), 'Eye Specialist')

WebUI.click(findTestObject('TWC_Config/Config_Specialties/Save button'))

WebUI.delay(3)

WebUI.click(findTestObject('TWC_Config/Config_Specialties/First Delete Button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Specialties/Are You Sure text'), 'Are you sure?')

WebUI.click(findTestObject('TWC_Config/Config_Specialties/Yes delete it button'))


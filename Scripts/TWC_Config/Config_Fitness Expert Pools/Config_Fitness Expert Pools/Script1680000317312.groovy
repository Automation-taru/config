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

WebUI.click(findTestObject('TWC_Config/Config_Fitness Expert Pools/Fitness Expert Tools text'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Fitness Expert Pools/All Fitness Expert Pools text'), 'All Fitness Expert Pools')

WebUI.setText(findTestObject('TWC_Config/Config_Fitness Expert Pools/Search field'), 'Truworth Fitness Experts')

WebUI.click(findTestObject('TWC_Config/Config_Fitness Expert Pools/Create Fitness Expert Pool'))

WebUI.setText(findTestObject('TWC_Config/Config_Fitness Expert Pools/Enter pool name'), 'Fitness Expert')

WebUI.setText(findTestObject('TWC_Config/Config_Fitness Expert Pools/Enter pool description'), 'Testing')

WebUI.click(findTestObject('TWC_Config/Config_Fitness Expert Pools/Save button'))


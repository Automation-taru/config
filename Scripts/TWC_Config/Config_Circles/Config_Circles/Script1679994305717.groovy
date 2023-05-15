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

WebUI.click(findTestObject('TWC_Config/Config_Circles/Circles option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Circles/All Circles text'), 'All Circles')

WebUI.setText(findTestObject('TWC_Config/Config_Circles/Search by Circle Name'), 'Test circle')

WebUI.click(findTestObject('TWC_Config/Config_Circles/Search icon'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Create Circle button'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Circles/Create A Circle text'), 'Create A Circle')

WebUI.click(findTestObject('TWC_Config/Config_Circles/Select Category field'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Health Centers option'))

WebUI.setText(findTestObject('TWC_Config/Config_Circles/Name field'), 'Wellfare')

WebUI.setText(findTestObject('TWC_Config/Config_Circles/Description field'), 'Well for wellness')

WebUI.click(findTestObject('TWC_Config/Config_Circles/Circle join_anyone'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Content visible_Everyone'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Circle visiblity_Dicoverable'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Display members_Enable'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Allow users to post_Allow'))

WebUI.click(findTestObject('TWC_Config/Config_Circles/Save button'))


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

WebUI.click(findTestObject('TWC_Config/Config_Clients/Clients option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Clients/All Clients text'), 'All Clients')

WebUI.setText(findTestObject('TWC_Config/Config_Clients/Seach by clients name'), 'Tarunn')

WebUI.click(findTestObject('TWC_Config/Config_Clients/Search icon'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Eye view icon'))

WebUI.delay(5)

WebUI.click(findTestObject('TWC_Config/Config_Clients/Configure Wallet button'))

WebUI.uploadFile(findTestObject('TWC_Config/Config_Clients/Upload file'), 'C:\\Users\\tarun.kumar\\OneDrive - Truworth Health Technologies Private Limited\\Pictures\\sample-configure-wallet-sheett.csv')

WebUI.click(findTestObject('TWC_Config/Config_Clients/Next Button'))

WebUI.delay(5)

WebUI.click(findTestObject('TWC_Config/Config_Clients/Clients option'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TWC_Config/Config_Clients/Create a new client'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Clients/Create a new client text'), 'Create a New Client')

WebUI.setText(findTestObject('TWC_Config/Config_Clients/Enter client name field'), 'Quality')

WebUI.setText(findTestObject('TWC_Config/Config_Clients/Enter client key'), '12345')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('TWC_Config/Config_Clients/Client image'), 'C:\\Users\\tarun.kumar\\OneDrive - Truworth Health Technologies Private Limited\\Desktop\\category nto available.png')

WebUI.click(findTestObject('TWC_Config/Config_Clients/Client Partner'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/PartnerA'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Client Circle'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Test Circle ABCD'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Client_TP'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Client Default Cirlce'))

WebUI.click(findTestObject('TWC_Config/Config_Clients/Test Circle ABCD1'))

WebUI.setText(findTestObject('TWC_Config/Config_Clients/Email Extensions'), 'gmail.com')

WebUI.click(findTestObject('TWC_Config/Config_Clients/Membership switch'))

WebUI.delay(2)

WebUI.setText(findTestObject('TWC_Config/Config_Clients/Platinum User Limit'), '1')

WebUI.click(findTestObject('TWC_Config/Config_Clients/Save button'))


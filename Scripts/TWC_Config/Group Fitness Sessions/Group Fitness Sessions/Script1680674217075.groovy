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

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Group Fitness Sessions option'))

WebUI.verifyElementText(findTestObject('TWC_Config/Group Fitness Sessions/Group Fitness Sessions text'), 'Group Fitness Sessions')

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Create button'))

WebUI.setText(findTestObject('TWC_Config/Group Fitness Sessions/Name field'), 'Testing Team')

WebUI.setText(findTestObject('TWC_Config/Group Fitness Sessions/Description field'), 'Test')

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Category field'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Yoga option'))

WebUI.setText(findTestObject('TWC_Config/Group Fitness Sessions/Total Slots'), '2')

WebUI.uploadFile(findTestObject('TWC_Config/Group Fitness Sessions/Upload image'), 'C:\\Users\\tarun.kumar\\OneDrive - Truworth Health Technologies Private Limited\\Desktop\\OTP not showing in nonverified.png')

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Coach field'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Coach option'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/DateTime field'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Apr month'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Select Apr month'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/15th Apr date'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('TWC_Config/Group Fitness Sessions/TP/Select_Date'), 2)

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/TP/Select_Date'))

not_run: WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/time 12'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/time 00 min'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Time mediun PM'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Ok button'))

WebUI.click(findTestObject('TWC_Config/Group Fitness Sessions/Ok button modal'))


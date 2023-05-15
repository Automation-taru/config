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

CustomKeywords.'login_CRM.loginCRM_Keyword.userLogin'()

WebUI.delay(5)

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/hamburger to maximize the window'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Appointments Pipeline'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Appointment Pipeline text'), 'Appointments - Pipeline')) {
    System.out.println('Test case passed')
} else {
    System.out.println('Test case failed')

    assert false.call()
}

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Start Date'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Apr 2023'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Apr Month'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Select date_1stApril'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Select end date 30thApr'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/Submit button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments Pipeline/View All_Partner Assign Pending'))


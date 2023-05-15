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

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments by Status Text'), 'Appointments by Status')

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_Confimed'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments Text'), 'Appointments')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_Partner Assigned'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments Text'), 'Appointments')

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_Sample Collected'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments Text'), 'Appointments')

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_Completed'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments Text'), 'Appointments')

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_Cancelled'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Appointments Text'), 'Appointments')

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/View All_OverDue Appointments'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Dashboard/Overdue Appointments text'), 'Overdue Appointments')

WebUI.click(findTestObject('TWC_CRM/CRM_Dashboard/Overdue Appointments Cross button'))


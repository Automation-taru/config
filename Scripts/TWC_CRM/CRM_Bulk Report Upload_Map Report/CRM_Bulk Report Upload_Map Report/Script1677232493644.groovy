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

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Bulk Report Upload option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Map Report option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Unassigned Reports text'), 'Unassigned Reports')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by Report Name'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by Report Name'), 'clear-desk-policy-1676523215776')

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by report name icon'))

not_run: WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/clear-desk-policy-1676523215776 text'), 
    'clear-desk-policy-1676523215776')

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Map to User'))

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by Appointment or email or number'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by Appointment or email or number'), '6375360445')

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Search by appointment, email and number icon'))

not_run: WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Appointment id TWC-663-AATF34 text'), 
    'Appointment ID - TWC-663-AATF34')

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Map report button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Action option YES'))

not_run: WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/Appointments Details text'), 'Appointment Details')

not_run: WebUI.click(findTestObject('TWC_CRM/CRM_Bulk Report Upload_Map Report/View Report button'))


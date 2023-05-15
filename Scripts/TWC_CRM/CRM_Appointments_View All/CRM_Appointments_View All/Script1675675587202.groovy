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

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Appointments Option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/View All Button'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Create Appointment text'), 'Create Appointment')

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Bar'), GlobalVariable.AppointmentNo)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Button'))

WebUI.delay(3)

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Appointment no 1 text'), 'TWC-916-671UKD')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Appointment View button'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Appointment Details text'), 'Appointment Details')

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Send Email Button text'), 'Send Email', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Sample Collected Button text'), 'Sample Collected', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Reschedule Button text'), 'Reschedule', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Change Lab Button text'), 'Change Lab', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointments_View All/Cancel Button text'), 'Cancel', FailureHandling.OPTIONAL)

WebUI.back()

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Create Appointment text'))

WebUI.delay(3)

WebUI.getText(findTestObject('TWC_CRM/CRM_Appointments_View All/Search User text'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TWC_CRM/CRM_Appointments_View All/Enter email address'), GlobalVariable.EmailAddress)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Search User, Email search button'))

WebUI.delay(2)

WebUI.getText(findTestObject('TWC_CRM/CRM_Appointments_View All/Select Package text'))

WebUI.delay(2)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Package Name'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Package Name'), GlobalVariable.SelectPackage)

WebUI.delay(2)

not_run: WebUI.selectOptionByIndex(findTestObject('TWC_CRM/CRM_Appointments_View All/Search Package Name'), 0)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Click Radiology package 1'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointments_View All/Booking for self radio button'))


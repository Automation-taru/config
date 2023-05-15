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

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Appointment Option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Advanced Filters Option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Appoinment - Advanced Filters text'), GlobalVariable.VerifyText)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.setText(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Client dropdown'), 'Tarunn')

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Tarunn dropdown option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Start date'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select_Date_21'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select_EndDate_24'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select Collection'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Home Collection'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select Package'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select Package'), GlobalVariable.Selectpackage)

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Diabetes Profile package'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Select Status'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Confimed Status'))

WebUI.click(findTestObject('TWC_CRM/CRM_Appointment_Advanced Filters/Search Button'))


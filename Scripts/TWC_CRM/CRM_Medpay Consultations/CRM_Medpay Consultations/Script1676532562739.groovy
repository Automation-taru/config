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

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/Medpay Consultations option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Medpay Consultations/Medpay Appointments text'), 'Medpay Appointments')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/Search Bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Medpay Consultations/Search Bar'), 'TWC-813-ZHGD67')

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/Search Button icon'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Medpay Consultations/Appointment No TWC-813-ZHGD67 text'), 'TWC-813-ZHGD67')

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/TWC-813-ZHGD67 View Button'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Medpay Consultations/Medpay Appointment Details text'), 'Medpay Appointment Details')


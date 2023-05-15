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

WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Refunds Option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Refund Requests Option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Refund text'), 'Refund')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Order Id Search bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Order Id Search bar'), 'TWC-885-Q6T4V5')

WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Search button icon'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/TWC-885-Q6T4V5 text'), 'TWC-885-Q6T4V5')

WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/View Button'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Refund text1'), 'Refund')

not_run: WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Process Button'))

not_run: WebUI.click(findTestObject('TWC_CRM/CRM_Refunds_Refund Requests/Process Button2'))


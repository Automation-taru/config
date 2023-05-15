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

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Health Plans option'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Plans/Health Plans text'), 'Health Plans')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Plans/Email id search box'), 'rajesh.sharma1@truworth.com')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Search button icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Enroll User button'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Plans/Enroll User to Health Plan text'), 'Enroll User to Health Plan')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Plans/Enter Email Id'), 'tarun.kumar@truworthwellness.com')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Plan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Select Plans'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Plans/Submit Button'))


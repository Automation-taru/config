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

WebUI.click(findTestObject('TWC_CRM/CRM_Fitternity/Fitternity Option'))

WebUI.delay(2)

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Fitternity/Fitternity text'), 'Fitternity')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Fitternity/Search Bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Fitternity/Search Bar'), 'HEALTH-PLAN-BENEFIT-85-1675839317745')

WebUI.click(findTestObject('TWC_CRM/CRM_Fitternity/Search Button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Fitternity/Verify HEALTH-PLAN-BENEFIT-85-1675839317745 text'), 'HEALTH-PLAN-BENEFIT-85-1675839317745')

WebUI.delay(2)

WebUI.click(findTestObject('TWC_CRM/CRM_Fitternity/Eye view icon'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Fitternity/Workout Detail text'), 'Workout Detail')


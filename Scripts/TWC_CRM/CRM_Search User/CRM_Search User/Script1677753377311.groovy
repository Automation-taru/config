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

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search User option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Search User text'), 'Search User'))
{
	System.out.println("Test case pass")
}
else
{
	System.out.println("Test case fail")
	assert false
}

WebUI.setText(findTestObject('TWC_CRM/CRM_Search User/Search Bar with name and email'), 'rajesh.sharma1@truworth.com')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search bar icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Eye view icon'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Email in text'), 'rajesh.sharma1@truworth.com')

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Wallet Transactions text'), 'Wallet Transactions')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/View button (1st)'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Transaction Details'), 'Transaction Details')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Cross Icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Orders Section'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Orders text'), 'Orders')

WebUI.setText(findTestObject('TWC_CRM/CRM_Search User/Search Bar'), 'TWC-611-K7UT6B')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search bar iconn'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/view button'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Store order id details'), 'Store order id TWC-611-K7UT6B detail')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Cross button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Health Checks Appointments section'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Health Checks Appointments text'), 'Health Check Appointments')

WebUI.setText(findTestObject('TWC_CRM/CRM_Search User/Search bar3'), 'TWC-660-5M1VN8')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/View buttonn'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Appointment Details text'), 'Appointment Details')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Store Transactions section'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Store Transaction text'), 'Store Transactions')

WebUI.setText(findTestObject('TWC_CRM/CRM_Search User/Search bar_store transaction'), 'PO07322314740407')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search icon_Store transaction'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Store Orders section'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Store Orders text'), 'Store Orders')

WebUI.setText(findTestObject('TWC_CRM/CRM_Search User/Search bar_Store Orders'), 'PO07422414720412')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Search icon_Store Orders'))

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/View button_Store Orders'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Search User/Store Order id details_Store Orders'), 'Store order id PO07422414720412 detail')

WebUI.click(findTestObject('TWC_CRM/CRM_Search User/Cross iconn'))


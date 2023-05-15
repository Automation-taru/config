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

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Onsite Health Checks option'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Onsite Locations option'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Onsite Locations text'), 'Onsite Locations')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Search Bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Search By Location Name'), 'Jaipur')

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Search button icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Add New Location'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Add New Onsite Location'), 'Add New Onsite Location')

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Location Name'), 'Jaipur')

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on select client'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Select Client Id'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/State'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/State'), 'Rajasthan')

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Set Rajasthan'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on city'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/City'), 'Jaipur')

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Set Jaipur'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Pincode'), '302021')

WebUI.setText(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Onsite Address'), '4th Floor, Smart Bazar Building, Vaishali Nagar')

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Select Date'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Today on calendar'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Start Time'))

WebUI.scrollToElement(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on 10'), 2)

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on 10'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on 00'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on AM'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on OK button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on 11'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on End 00'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Click on End AM'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/End Ok button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Onsite Health Checks_Onsite Locations/Submit Button'))


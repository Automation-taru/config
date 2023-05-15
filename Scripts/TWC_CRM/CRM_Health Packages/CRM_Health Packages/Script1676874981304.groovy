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
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver

CustomKeywords.'login_CRM.loginCRM_Keyword.userLogin'()

WebUI.delay(5)

WebUI.click(findTestObject('TWC_CRM/CRM_Medpay Consultations/hamburger to maximize the window'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Health Packages option'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Packages/Health Packages text'), 'Health Packages')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Search Bar'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Search Bar'), 'HC-MMS-10')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Search icon'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Packages/HC-MMS-10 text'), 'HC-MMS-10')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Eye View Icon'))

WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Packages/Package details text'), 'Platinum Package Female Above 40 Years at Premium Hospital / Lab')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Cross Button icon'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Create package button'))

if (WebUI.verifyElementText(findTestObject('TWC_CRM/CRM_Health Packages/Add package text'), 'Add Package')) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Package name'), 'Health Care')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter code'), '8111')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Package gender'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Select Gender Both Male and Female'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter Age'), '30')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Health package risk'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Full Body option'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Fasting required'), '12')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Report Time'), '14-72 Hours')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Parameters'), '12')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter MRP'), '999')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Selling Price'), '699')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Corporate Price'), '499')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Platinum Price'), '699')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Home Collection radio button'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Add Provider'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Select Provider'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Healthians Service Provider'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Package Code'), '10010')

not_run: WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Time Slots'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Time Slots'), 'Before 10 AM', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Appintment stops before days'), '2')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Is retails_Yes'))

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Additional Package'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter test name'), 'Test1')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Total Parameter'), '21')

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'), 'Test01')

Robot robot = new Robot()

Thread.sleep(2000 // Thread.sleep throws InterruptedException)
    )

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.enhancedClick(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'), 'Test02')

Thread.sleep(2000 // Thread.sleep throws InterruptedException)
    )

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.enhancedClick(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'), 'Test03')

Thread.sleep(2000 // Thread.sleep throws InterruptedException)
    )

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.enhancedClick(findTestObject('TWC_CRM/CRM_Health Packages/Enter child test'))

not_run: WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Add Test button'))

WebUI.setText(findTestObject('TWC_CRM/CRM_Health Packages/Description'), 'ABCDEFGHJKLMNOPQRWSTUVWXYZ')

WebUI.click(findTestObject('TWC_CRM/CRM_Health Packages/Save Package Button'))


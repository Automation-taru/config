package login_Config
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException



class config_login {

	@Keyword
	public static void userLogin() {
		WebUI.openBrowser('https://dev-config.thewellnesscorner.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TWC_Config/Config_Login/Login button'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Login/Enter your login ID text'), 'Please enter your Login ID!')

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Login/Please input your password text'), 'Please input your Password!')

WebUI.setText(findTestObject('TWC_Config/Config_Login/Login ID field'), 'admin')

WebUI.setText(findTestObject('TWC_Config/Config_Login/Password field'), 'Truworth@!@#')

WebUI.click(findTestObject('TWC_Config/Config_Login/EyeView'))

WebUI.click(findTestObject('TWC_Config/Config_Login/Login button'))

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Login/Login successful_Toast msg'), 'Login successful')

WebUI.verifyElementText(findTestObject('TWC_Config/Config_Login/Logout text'), 'Logout')
	}
}


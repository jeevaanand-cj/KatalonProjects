package apps

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Login {
	@Keyword
	public Boolean Logins(String url,String username,String password){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
		WebUI.maximizeWindow()
		WebUI.delay(3)
		WebUI.setText(findTestObject("Object Repository/Logins/UserName"), username,FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject("Object Repository/Logins/DeliveryQuality"),FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(4)
		WebUI.setText(findTestObject("Object Repository/Logins/Password"), password,FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject("Object Repository/Logins/DeliveryQuality"),FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(20)
	}
	@Keyword
	public Boolean Logout(){
		WebUI.click(findTestObject("Object Repository/Logins/Logout"),FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/Logins/SignOut"),FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(10)
		WebUI.closeBrowser()
	}
}

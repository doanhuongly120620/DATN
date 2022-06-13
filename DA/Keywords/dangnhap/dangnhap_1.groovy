package dangnhap

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.StringEscapeUtils
import internal.GlobalVariable

public class dangnhap_1 {
	//public void String email, String password
	@Keyword
	def dangnhap_pass(String email, String password) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://samtech.vn/')

		WebUI.click(findTestObject('Object Repository/Page_Phn phi thit b in thng minh Smart home IOT/a_ng nhp'))

		WebUI.setText(findTestObject('Object Repository/Page_ng nhp ti khon/input__email'), email)

		WebUI.setText(findTestObject('Object Repository/Page_ng nhp ti khon/input__password'), password)

		WebUI.click(findTestObject('Object Repository/Page_ng nhp ti khon/button_ng nhp'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Trang khch hng/img'), '')
		WebUI.closeBrowser()
	}
	@Keyword
	def dangnhap_fail(String email, String password) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://samtech.vn/')

		WebUI.click(findTestObject('Object Repository/Page_Phn phi thit b in thng minh Smart home IOT/a_ng nhp'))

		WebUI.setText(findTestObject('Object Repository/Page_ng nhp ti khon/input__email'), email)

		WebUI.setText(findTestObject('Object Repository/Page_ng nhp ti khon/input__password'), password)

		WebUI.click(findTestObject('Object Repository/Page_ng nhp ti khon/button_ng nhp'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Trang khch hng/img'), '')
		WebUI.closeBrowser()
	}
}

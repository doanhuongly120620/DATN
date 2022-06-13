	package dangky

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
import internal.GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys
public class dangky_1 {
	@Keyword
	def DangKy_ktc (String lastName, String firstName, String password, String email ) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://samtech.vn/')

		WebUI.click(findTestObject('DK/DK'))

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_lastName'), lastName)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_firstName'), firstName)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_password'), password)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_email'), email)

		WebUI.click(findTestObject('DK/Page_ng k ti khon/button_DK'))

		String checkURL = WebUI.getUrl()

		WebUI.verifyEqual(checkURL, 'https://samtech.vn/account/register')

		WebUI.closeBrowser()
	}
	@Keyword
	def DangKy_tc (String lastName, String firstName, String password, String email ) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://samtech.vn/')

		WebUI.click(findTestObject('DK/DK'))

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_lastName'), lastName)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_firstName'), firstName)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_password'), password)

		WebUI.setText(findTestObject('DK/Page_ng k ti khon/input_email'), email)

		WebUI.click(findTestObject('DK/Page_ng k ti khon/button_DK'))

		String checkURL = WebUI.getUrl()

		WebUI.verifyEqual(checkURL, 'https://samtech.vn/')

		WebUI.closeBrowser()
	}
}
package timkiem

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

public class Keyword_TK {
	@Keyword
	def TK(String SP,String ketqua) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://samtech.vn/')

		WebUI.click(findTestObject('GioHang/Page_Phn phi thit b in thng minh Smart home IOT/img'))

		if(SP.length() == 0) {

			WebUI.click(findTestObject('Object Repository/Page_Phn phi thit b in thng minh Smart home IOT/button_Kinh Doanh 02462927193_search-form__submit'))

			WebUI.verifyElementText(findTestObject('Object Repository/tim-kiem/Page_Kt qu tm kim cho/kq-tk'), "Không còn sản phẩm nào thỏa mãn.")
		}else {
			WebUI.setText(findTestObject('Object Repository/Page_Phn phi thit b in thng minh Smart home IOT/input_Kinh Doanh 02462927193_query'),SP)

			WebUI.click(findTestObject('Object Repository/Page_Phn phi thit b in thng minh Smart home IOT/button_Kinh Doanh 02462927193_search-form__submit'))

			WebUI.verifyElementText(findTestObject('Object Repository/Page_Kt qu tm kim cho camera/li_Kt qu tm kim cho camera'), ketqua)
		}

		WebUI.closeBrowser()
	}
}

package dathang

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
import java.awt.Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys



public class dathang_1 {
	@Keyword
	def diachi(String billingName,billingPhone, billingAddress, billingProvince, reductionCode) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_DH'))

		WebUI.verifyElementText(findTestObject('DH/Verify/DC'), 'Vui lòng nhập địa chỉ')

		WebUI.closeBrowser()
	}

	@Keyword
	def ten(String billingName,billingPhone, billingAddress, billingProvince, reductionCode, ketqua) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_DH'))

		WebUI.verifyElementText(findTestObject('DH/Verify/Hoten'), ketqua)

		WebUI.closeBrowser()
	}
	@Keyword
	def sdt(String billingName,billingPhone, billingAddress, billingProvince, reductionCode, ketqua) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_DH'))

		WebUI.verifyElementText(findTestObject('DH/Verify/Sdt'), ketqua)

		WebUI.closeBrowser()
	}
	@Keyword
	def mgg(String billingName,billingPhone, billingAddress, billingProvince, reductionCode, ketqua) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.verifyElementText(findTestObject('DH/Verify/MGG'), ketqua)

		WebUI.closeBrowser()
	}
	@Keyword
	def pttt(String billingName,billingPhone, billingAddress, billingProvince, reductionCode, ketqua) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		//		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_DH'))

		WebUI.verifyElementText(findTestObject('DH/Verify/PTTT'), ketqua)

		WebUI.closeBrowser()
	}
	@Keyword
	def tt(String billingName,billingPhone, billingAddress, billingProvince, reductionCode, ketqua) {

		WebUI.callTestCase(findTestCase('Giỏ hàng/GH-CALL'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('GioHang/Page_Gi hng (1)/a_Thanh ton'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Name'),billingName)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Phone'),billingPhone)

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Address'),billingAddress)

		//		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/Tinhthanh'))

		//			WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), billingProvince)

		//			WebUI.sendKeys(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input__TT'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/PTTT'))

		WebUI.setText(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/input_Mgg'),reductionCode)

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_mgg'))

		WebUI.click(findTestObject('DH/Page_in thng minh Samtech - Thanh ton n hng/button_DH'))

		WebUI.verifyElementText(findTestObject('DH/Verify/Tinhthanh'), ketqua)

		WebUI.closeBrowser()
	}
}



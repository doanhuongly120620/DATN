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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://samtech.vn/')

WebUI.click(findTestObject('DN/DN'))

WebUI.setText(findTestObject('DN/input_email'), 'hihi@gmail.com')

WebUI.setEncryptedText(findTestObject('DN/input_password'), 'CSt51UwWECc=')

WebUI.click(findTestObject('DN/button_DN'))

WebUI.rightClick(findTestObject('Object Repository/Page_Trang khch hng/img'))

WebUI.click(findTestObject('Object Repository/Page_Trang khch hng/div_Cha c n hng no c t.Ti mun mua hngH v tn_fdc597'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Trang khch hng/a_Ti mun mua hng'), 'Tôi muốn mua hàng')

WebUI.closeBrowser()


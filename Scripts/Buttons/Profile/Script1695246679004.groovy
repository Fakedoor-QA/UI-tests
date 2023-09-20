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

WebUI.navigateToUrl('https://delightful-stone-07bb55f0f.3.azurestaticapps.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Profile/Page_FakeDoor/input_User Name_username'), 'admin2')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/Page_FakeDoor/input_Password_password'), 'Lm1Albv1LteQ2KmNJoEiNQ==')

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Login'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Day'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_SUN'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_MON'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_TUE'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_WED'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_THU'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_FRI'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/p_SAT'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Month'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Continue'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Back'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/button_Overview_MuiButtonBase-root MuiIconB_eec332'))

WebUI.click(findTestObject('Object Repository/Profile/Page_FakeDoor/span_Logout'))

WebUI.closeBrowser()


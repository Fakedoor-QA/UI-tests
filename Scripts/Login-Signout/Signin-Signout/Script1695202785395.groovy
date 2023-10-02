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

WebUI.click(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/input_User Name_username'), 'admin2')

WebUI.setEncryptedText(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/input_Password_password'), 'Lm1Albv1LteQ2KmNJoEiNQ==')

WebUI.click(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/button_Login'))

WebUI.click(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Login-Signout/Signin/Page_FakeDoor/button_Sign Out'))

WebUI.closeBrowser()


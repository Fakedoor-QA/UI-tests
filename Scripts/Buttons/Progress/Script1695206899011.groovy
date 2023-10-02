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

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/input_User Name_username'), 'admin2')

WebUI.setEncryptedText(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/input_Password_password'), 'Lm1Albv1LteQ2KmNJoEiNQ==')

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/button_Login'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/span_Progress'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/span_Physics'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.1 Energy'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.2 Electricity'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.3 Particle model of matter'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.4 Atomic Structure'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.5 Forces'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.6 Waves'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.7 Magnetism and electromagnetism'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.8 Space physics'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/p_4.9 Key Ideas'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/img'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/button_Week'))

WebUI.click(findTestObject('Object Repository/Buttons/Progress/Page_FakeDoor/button_Month'))

WebUI.closeBrowser()


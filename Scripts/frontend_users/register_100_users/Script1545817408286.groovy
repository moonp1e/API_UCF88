import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('dev-operator.ucf88.com/#/')

WebUI.click(findTestObject('registerUser/span_signUp'))

WebUI.setText(findTestObject('registerUser/signUp_username'), signUp_username)

WebUI.setText(findTestObject('registerUser/signUp_email'), signUp_email)

WebUI.setText(findTestObject('registerUser/signUp_name'), signUp_name)

WebUI.delay(3)

WebUI.setText(findTestObject('registerUser/input_password'), signUp_password)

WebUI.delay(3)

WebUI.click(findTestObject('registerUser/button_signUp'))

WebUI.setText(findTestObject('registerUser/input_username'), input_username)

WebUI.setText(findTestObject('registerUser/input_password'), input_password)

WebUI.delay(2)

WebUI.click(findTestObject('registerUser/button_Login'))

WebUI.verifyElementVisible(findTestObject('registerUser/span_Logout'))

WebUI.click(findTestObject('registerUser/span_Logout'))


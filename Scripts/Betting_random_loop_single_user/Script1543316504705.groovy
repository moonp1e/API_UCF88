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

for (loop = 1; loop <= 500; loop++) {
    response1 = WS.sendRequest(findTestObject('betting_meron'))

    WebUI.delay(2)

    WS.verifyResponseStatusCode(response1, 200)

    response2 = WS.sendRequest(findTestObject('betting_wala'))

    WebUI.delay(2)

    WS.verifyResponseStatusCode(response2, 200)

    WebUI.delay(2)

    response3 = WS.sendRequest(findTestObject('betting_draw'))

    WebUI.delay(2)

    WS.verifyResponseStatusCode(response3, 200)

    response4 = WS.sendRequest(findTestObject('betting_ftd'))

    WebUI.delay(2)

    WS.verifyResponseStatusCode(response4, 200)

    WebUI.delay(2)

    WS.verifyElementPropertyValue(response4, 'results.status', 1)
}


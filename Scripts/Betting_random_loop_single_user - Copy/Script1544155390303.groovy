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
import java.util.Random










for (loop = 1; loop <= 500; loop++) {
	
	
    response_meron = WS.sendRequest(findTestObject('betting_meron'))
	response_wala = WS.sendRequest(findTestObject('betting_wala'))
    response_draw = WS.sendRequest(findTestObject('betting_draw'))
    response_ftd = WS.sendRequest(findTestObject('betting_ftd'))
	
	String[] odds;
	
	String y
	odds = new [4];
	
	odds[0] = response_meron;
	odds[1] = response_wala;
	odds[2] = response_draw;
	odds[3] = response_ftd;
	
	Random rand = new Random()
	int randomOdds = rand.nextInt(odds.size())
	return y
	WS.verifyResponseStatusCode(y, 200)
	

	
	
	WS.verifyElementPropertyValue(response_ftd, 'results.status', 1)
	
}


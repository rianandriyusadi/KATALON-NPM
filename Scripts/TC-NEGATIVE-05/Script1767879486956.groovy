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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/input_Name_firstName (1)'), 'rian')

WebUI.setText(findTestObject('Object Repository/input_Name_lastName (1)'), 'andriyusadi')

WebUI.setText(findTestObject('Object Repository/input_Email_userEmail (1)'), 'andririan40@gmail.com')

WebUI.click(findTestObject('Object Repository/label_Male (1)'))

WebUI.setText(findTestObject('Object Repository/input_(10 Digits)_userNumber (1)'), '081221')

WebUI.setText(findTestObject('Object Repository/input_Date of Birth_dateOfBirthInput (1)'), '08 Jan 2026')

WebUI.click(findTestObject('Object Repository/input_Date of Birth_dateOfBirthInput (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_190019011902190319041905190619071908_246ee1 (1)'), '2007', 
    true)

WebUI.click(findTestObject('Object Repository/div_4 (1)'))

WebUI.click(findTestObject('Object Repository/div_Subjects_subjects-auto-complete__value-_d244cf (1)'))

WebUI.setText(findTestObject('Object Repository/input_Subjects_subjectsInput (1)'), 't')

WebUI.click(findTestObject('Object Repository/div_Computer Science (1)'))

WebUI.click(findTestObject('Object Repository/label_Music (1)'))

WebUI.setText(findTestObject('Object Repository/textarea_Current Address_currentAddress (1)'), 'jalan tanah abang')

WebUI.click(findTestObject('Object Repository/svg_Select State_css-19bqh2r (1)'))

WebUI.click(findTestObject('Object Repository/div_NCR (1)'))

WebUI.click(findTestObject('Object Repository/svg_Select City_css-19bqh2r (1)'))

WebUI.click(findTestObject('Object Repository/div_Delhi (1)'))

WebUI.click(findTestObject('Object Repository/button_Submit (1)'))


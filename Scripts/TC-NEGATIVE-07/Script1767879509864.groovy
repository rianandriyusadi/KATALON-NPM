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

WebUI.setText(findTestObject('Object Repository/input_Name_firstName (3)'), 'rian')

WebUI.setText(findTestObject('Object Repository/input_Name_lastName (3)'), 'andriyusadi')

WebUI.setText(findTestObject('Object Repository/input_Email_userEmail (3)'), 'andririan40@gmail.com')

WebUI.click(findTestObject('Object Repository/label_Male (3)'))

WebUI.setText(findTestObject('Object Repository/input_(10 Digits)_userNumber (3)'), '@&*%$@^&**')

WebUI.setText(findTestObject('Object Repository/input_Date of Birth_dateOfBirthInput (3)'), '08 Jan 2026')

WebUI.click(findTestObject('Object Repository/input_Date of Birth_dateOfBirthInput (3)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_190019011902190319041905190619071908_246ee1 (3)'), '1999', 
    true)

WebUI.click(findTestObject('Object Repository/div_6 (2)'))

WebUI.click(findTestObject('Object Repository/div_Subjects_subjects-auto-complete__value-_d244cf (3)'))

WebUI.setText(findTestObject('Object Repository/input_Subjects_subjectsInput (3)'), 't')

WebUI.click(findTestObject('Object Repository/div_Maths'))

WebUI.click(findTestObject('Object Repository/label_Music (3)'))

WebUI.setText(findTestObject('Object Repository/textarea_Current Address_currentAddress (3)'), 'jalan tanah abang')

WebUI.click(findTestObject('Object Repository/svg_Select State_css-19bqh2r (3)'))

WebUI.click(findTestObject('Object Repository/div_NCR (3)'))

WebUI.click(findTestObject('Object Repository/svg_Select City_css-19bqh2r (3)'))

WebUI.click(findTestObject('Object Repository/div_Delhi (3)'))

WebUI.click(findTestObject('Object Repository/button_Submit (3)'))


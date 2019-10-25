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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.doubleClick(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.doubleClick(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control_1'))

WebUI.doubleClick(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Demo account_form-control_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/td_26'))

WebUI.setText(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Created an appointment for Hongkong region')

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/a_History'))

not_run: WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

not_run: WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/a_Logout'))

not_run: WebUI.click(findTestObject('Object Repository/project-tej-3/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.closeBrowser()


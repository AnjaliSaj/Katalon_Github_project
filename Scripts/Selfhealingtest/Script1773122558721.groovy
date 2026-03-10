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

WebUI.navigateToUrl('https://qaautomationlabs.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('selfhealing/Page_Home - QA Automation Labs/a_Shop'))

WebUI.setText(findTestObject('selfhealing/Page_QA AUTOMATIONLAB/input_Email'), 'demo@demo.com')

WebUI.click(findTestObject('selfhealing/Page_QA AUTOMATIONLAB/input_Password'))

WebUI.setEncryptedText(findTestObject('selfhealing/Page_QA AUTOMATIONLAB/input_Password'), 'PblvLzUlPsM=')

WebUI.click(findTestObject('selfhealing/Page_QA AUTOMATIONLAB/button_loginBtn'))

WebUI.click(findTestObject('selfhealing/Page_SHOP  QA AUTOMATIONLAB/a_Shop Now'))

WebUI.click(findTestObject('selfhealing/Page_SHOP  QA AUTOMATIONLAB/button_Add to Cart'))

WebUI.click(findTestObject('selfhealing/Page_SHOP  QA AUTOMATIONLAB/i_fas fa-shopping-cart text-primary fa-2x'))

WebUI.click(findTestObject('selfhealing/Page_CART  QA AUTOMATIONLAB/a_checkoutBtn'))

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter First Name'), 'test')

WebUI.click(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter Middle Name'))

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter Last Name'), 'yesr')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_exampleemail.com'), 'example@gmail.com')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_9876543210'), '2134567876')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/textarea_Enter Address'), 'streeet')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter State'), 'kjhgfds')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter City'), 'nbvcxz')

WebUI.setText(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/input_Enter Pin Code'), '876543')

WebUI.click(findTestObject('selfhealing/Page_CHECKOUT  QA AUTOMATIONLAB/button_continue'))

WebUI.click(findTestObject('selfhealing/Page_CONFIRM  QA AUTOMATIONLAB/a_Place Order'))

WebUI.verifyElementPresent(findTestObject('selfhealing/Page_THANKS  QA AUTOMATIONLAB/p_Your order has been placed successfully'), 
    0)

WebUI.click(findTestObject('selfhealing/Page_THANKS  QA AUTOMATIONLAB/a_Shop Again'))

WebUI.closeBrowser()


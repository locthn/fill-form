import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dvc-home tax-form1'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1')

'step 2: At Page dvc-home tax-form1 input on input combo box demo'

testObj = findTestObject('Object Repository/Page_dvc-home/input_combo_box_demo')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_combo_box_demo)

'step 3: At Page dvc-home tax-form1 click on div object'

testObj = findTestObject('Object Repository/Page_dvc-home/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page dvc-home tax-form1'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to Tax Form1 in DVC Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

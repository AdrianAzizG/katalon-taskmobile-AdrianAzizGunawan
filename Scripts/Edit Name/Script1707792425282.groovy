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

Mobile.startApplication('C:\\Main Storage\\Downloads\\Android-Solodroid_E-CommerceApp Demo_3.2.0.apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.tap(findTestObject('Spy/Profile/profileMenu'), 0)

Mobile.tap(findTestObject('Spy/Profile/editProfileLink'), 0)

Mobile.tap(findTestObject('Spy/Profile/profileName'), 0)

Mobile.setText(findTestObject('Spy/Profile/profileNameEditText'), name, 0)

Mobile.tap(findTestObject('Spy/Profile/profileNameOKButton'), 0)

Mobile.verifyElementText(findTestObject('Spy/Profile/profileNameTextView'), name)

Mobile.closeApplication()


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

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.RelativeLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Record/Checkout/android.widget.EditText (1)'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.Button - ADD (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.Button - CHECKOUT (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Record/Checkout/android.widget.EditText - Your Name (1)'), 'Rizan', 0)

Mobile.setText(findTestObject('Object Repository/Record/Checkout/android.widget.EditText - your.emailgmail.com (1)'), 'rizan@mail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Record/Checkout/android.widget.EditText - 628123456789 (1)'), '081110197364', 
    0)

Mobile.setText(findTestObject('Object Repository/Record/Checkout/android.widget.EditText - Your Address (1)'), 'Jalan Raya Cibubur', 
    0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.CheckedTextView - COD (Cash On Delivery) (1)'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Spy/Checkout/processCheckout'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Checkout/android.widget.Button - ADD (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Record/Checkout/android.widget.TextView - Congratulation (1)'), 
    'Congratulation')

Mobile.closeApplication()


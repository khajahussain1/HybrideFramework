$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./featurefile/Loginlogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login into the application",
  "description": "",
  "id": "login-into-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login into the application",
  "description": "",
  "id": "login-into-the-application;login-into-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter username \"username@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter password \"passwor1d\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on signin tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "loin to the application successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.launch_the_application()"
});
formatter.result({
  "duration": 16652031894,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.click_on_sigin_button()"
});
formatter.result({
  "duration": 85022095,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //[@id\u003d\u0027account\u0027]/a because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//[@id\u003d\u0027account\u0027]/a\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 28 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027LP-5CD7465GP0\u0027, ip: \u0027192.168.43.197\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\khaja.h\\AppData\\Local\\Temp\\scoped_dir11132_28484}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d68.0.3440.106, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 2f19a0ba6d3d8d67045a1f9edcdf89f4\n*** Element info: {Using\u003dxpath, value\u003d//[@id\u003d\u0027account\u0027]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat cucumber.pageobjects.LoginPageobject.signinbutton(LoginPageobject.java:32)\r\n\tat com.cucumber.stepdefination.Stepdefination.click_on_sigin_button(Stepdefination.java:57)\r\n\tat ✽.Then click on signin button(./featurefile/Loginlogin.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "username@gmail.com",
      "offset": 16
    }
  ],
  "location": "Stepdefination.enter_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "passwor1d",
      "offset": 16
    }
  ],
  "location": "Stepdefination.enter_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefination.click_on_signin_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefination.loin_to_the_application_successfully()"
});
formatter.result({
  "status": "skipped"
});
});
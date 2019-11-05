@tag
Feature: Login into the application

  @tag1
  Scenario: Login into the application
    Given Launch the application
    Then click on signin button
    Then enter username "username@gmail.com"
    Then enter password "passwor1d"
    Then click on signin tab
    Then loin to the application successfully
    #Examples: 
      #| username          | password  |
      #| hussain@gmail.com | aish@123  |
      #| khaja@gmail.com   | asdf@3899 |

Feature: this is login testcase
  
  Author:Vikram
#
  #Scenario: Verify Login Testcase for DemoWebShop
    #Given Enter ORANGEHRM URL
    #When enter valid username and pass word for ORH
    #Then click Login button from Login Page

  Scenario Outline: Verify Login Testcase with example
    Given Enter ORANGEHRM URL
    When enter valid username and password "<username>" and "<password>" for ORH
    Then click Login button from Login Page
		
		Examples:
		|username|password|
		|vdm12@gmail.com|vdm111|
		|vdm14@gmail.com|vdm111|
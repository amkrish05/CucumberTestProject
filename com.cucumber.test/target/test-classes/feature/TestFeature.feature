Feature: To test the feature
  @tag1
  Scenario Outline: Test feature file
    Given Application "url" should be launched using "browser"
    And User should have valid "<username>" and "<password>"
    When I launched application 
    And click on login button
    Then I should be able to logged into the application
    And application should populated my "username" as a logged in user
  
  Examples:
  			|username|password|  
  			|jhon    |jhon    |
  
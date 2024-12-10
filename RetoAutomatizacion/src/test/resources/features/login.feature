Feature: Login into Orangehrm
  I as a user want to log in to the Orangehrm website

  @caseLogin
  Scenario: Login to the site
    Given the link to the Orangehrm website
    When I enter my login details
    Then I access the homepage
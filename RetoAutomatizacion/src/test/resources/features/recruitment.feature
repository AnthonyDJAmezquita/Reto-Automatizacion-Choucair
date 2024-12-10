Feature: Recruitment process
  I as a user want to fill in the data for the recruitment process

  @caseRecruitment
  Scenario: Fill in recruitment data
    Given the fields and the candidates information
    When we fill the fields
    Then information was saved and verified

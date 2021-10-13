
@tag
Feature: Validate Response

  @tag1
  Scenario: Negative Scenario
    Given API for getting response code
    When posted with future date info
    Then validate the positive response code 

 

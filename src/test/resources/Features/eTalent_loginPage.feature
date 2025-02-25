Feature: eTalent Login

  Scenario: User logs in successfully
    Given the user is on the eTalent login page
    When the user logs in with username "validUsername" and password "validPassword"
    Then the user should be redirected to the dashboard page


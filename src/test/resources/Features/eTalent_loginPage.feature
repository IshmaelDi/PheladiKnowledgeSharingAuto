Feature: eTalent Login

  Scenario: User logs in successfully
    Given the user is on the eTalent login page
    When the user logs in with username "lebodirero@gmail.com" and password "Ish@cyest#982"
    Then the user should be redirected to the dashboard page


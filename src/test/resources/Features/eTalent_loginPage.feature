Feature: eTalent Login

  @Login
  Scenario: User logs in successfully
    Given the user is on the eTalent login page
    When the user logs in with username "lebodirero@gmail.com" and password "Ish@cyest#982"
    And the user should be redirected to the dashboard page
#    //And the user click burger menu button on top right side

#  Scenario: User click on Hamburger Menu to select Job Offers Contracts text link from the list below
    And the user click job OffersContracts text link
    Then the user click Job Posts text link


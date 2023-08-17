Feature: Application Login

Background:
  Given Validate the browser
  When Browser is triggered
  Then check if browser is started
  
Scenario: Home Page default login
  Given User is on NetBankingn Landing page
  When User Login into application with "om" ans password "12345"
  Then Home page is populated
  And cards are displayed are "true"

  
Scenario: Home Page default login
  Given User is on NetBankingn Landing page
  When User Login into application with "chandani" ans password "12345"
  Then Home page is populated
  And cards are displayed are "false"


Scenario: Home Page default login
  Given User is on NetBankingn Landing page
  When User Login into application with "Gautam" ans password "12345"
  Then Home page is populated
  And cards are displayed are "false"

  #Data Table 
  Scenario: Home Page default login
  Given User is on NetBankingn Landing page
  When User signup with following details
  |Jonny|abcd|jonny@gmail.com|Canada|254678|  
  Then Home page is populated
  And cards are displayed are "ture"
  
  #Parameterization
Scenario Outline: Home Page default login
  Given User is on NetBankingn Landing page
  When User Login into application with <Username> and password <Passowrd>
  Then Home page is populated
  And cards are displayed are "true"
  
  Examples: 
  |Username|Passowrd|
  |Usen1   |pass1   |
  |Usen2   |pass2   |
  |Usen3   |pass3   |
  |Usen4   |pass4   |
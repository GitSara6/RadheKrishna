Feature: +User Auth


Background:
Given User is on Home Page

@Credit/Debit
Scenario: Credit User Auth
Given Credit user login
When User enter credit card
Then Payment is verified

@Credit/Debit
Scenario: Debit User Auth
Given Debit user login
When User enter Debit card
Then  Debit Payment is verified

@Upi
Scenario: Upi User Auth
Given Upi user login
When User enter upi detail
Then upi Payment is verified
#Author: Heriberto-hg@hotmail.com

@CusRegMob
Feature: Customer Registration Mobile Services
  I want to register a client consuming the rest CustomerRegistrationMobileServices service

  @CusRegMobUAT
  Scenario: Customer Registration Mobile UAT
    When consume the CustomerRegistrationMobileServices service with personal customer information
    Then the client must be registered successfully by returning the personid
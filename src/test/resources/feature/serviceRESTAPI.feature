#Author: Heriberto-hg@hotmail.com

Feature: consume geonames.org service
  I want to consult the countries by their geographical location

  @ConService
  Scenario: consult countries by latitude and longitude
    When consume the service with 10 and 20
    Then the service must answer the geographic information of the country TD Africa/Ndjamena Chad

  @ConServiceFaile
  Scenario: consult countries by latitude and longitude out of phase
    When consume the service with 1000 and 2000
    Then the service must respond to invalid parameters invalid lat/lng

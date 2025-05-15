@US009
Feature: US009 Car Rental sayfasinda login islemi

  @US009_TC01
  Scenario: TC01 Verilen Email ve password bilgileri ile login olunur
    Given Kullanici "https://www.speedyli.com" sayfasina gider
    But kullanici 1 saniye bekler
    And Verilen gecerli email ve password bilgileri ile login olur
      | email              | password   |
      | ayhancan@cars.com  | Aa1234567! |
      | beyhancan@cars.com | Aa1234567! |
      | ceyhancan@cars.com | Aa1234567! |
    And Sayfayi kapatir


  @US009_TC02
  Scenario: TC02 Verilen Email ve password bilgileri ile login olunur
    Given Kullanici "https://www.speedyli.com" sayfasina gider
    But kullanici 1 saniye bekler
    And Verilen gecerli email ve password bilgileri ile login olur ikinci yol
      | email              | password   |
      | ayhancan@cars.com  | Aa1234567! |
      | beyhancan@cars.com | Aa1234567! |
      | ceyhancan@cars.com | Aa1234567! |
    And Sayfayi kapatir
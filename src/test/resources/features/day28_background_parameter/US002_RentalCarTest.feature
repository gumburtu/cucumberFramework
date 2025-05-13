@US002
Feature: US002 RentalCar Sayfasinda Login testi

  Scenario: TC01 Verilen Email ve Password ile login olunur

    Given kullanici rentalCar safyasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And Sayfayi kapatir


  Scenario: TC02 Verilen Email ve Password ile login olunur

    Given kullanici rentalCar safyasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And Sayfayi kapatir


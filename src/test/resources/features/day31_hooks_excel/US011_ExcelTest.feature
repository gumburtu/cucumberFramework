
@US011
Feature: US011 Car Rental Sayfasinda Login Islemi
  Scenario: TC01 Exceldeki Email ve Password bilgileri ile Login olunur
    Given kullanici rentalCar safyasina gider
    When registerlogin butonuna tiklar
    Then exceldeki "Sayfa1" sayfasindaki kullanici bilgileri ile login olunur
    And kullanici 2 saniye bekler
    And Sayfayi kapatir
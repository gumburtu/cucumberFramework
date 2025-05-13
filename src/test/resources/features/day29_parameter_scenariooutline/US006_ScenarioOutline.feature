@US006
Feature: US006 Google Testi Scenario Outline

  Scenario Outline: TC01 Google sayfasinda arama kutusunda arac aratilir

    Given Kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "<ARACLAR>" aratilir
    Then sayfa basliginin "<ARACLAR>" icerdigini test eder
    But kullanici 2 saniye bekler
    And Sayfayi kapatir

    Examples:
      | ARACLAR |
      | honda   |
      | toyota  |
      | volvo   |
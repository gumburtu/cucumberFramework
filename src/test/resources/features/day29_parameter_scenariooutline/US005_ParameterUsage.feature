
@US005
Feature: US005 Google Testi

  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir

    Given Kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "ford" aratilir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And Sayfayi kapatir
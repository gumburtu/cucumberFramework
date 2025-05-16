@US010
Feature: US003 Amazon testi Hook kullanimi

  Background:
    Given Kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda iphone aratir
    And Sayfayi kapatir

  @samsung
  Scenario: TC02 arama kutusunda samsung aratilir
    When Arama kutusunda samsung aratir
    And Sayfayi kapatir

  @nokia
  Scenario: TC03 arama kutusunda nokia aratilir
    When Arama kutusunda nokia aratir
    And Sayfayi kapatir
@US004
Feature: US004 Amazon testi

  Background:
    Given Kullanici "https://amazon.com" sayfasina gider


  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda "iphone" aratir
    And Sayfayi kapatir


  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda "nokia" aratir
    And Sayfayi kapatir


  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda "samsung" aratir
    And Sayfayi kapatir


  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda "tablet" aratir
    And Sayfayi kapatir
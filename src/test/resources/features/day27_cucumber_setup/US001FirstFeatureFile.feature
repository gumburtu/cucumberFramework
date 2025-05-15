# yorum satiri icin ctrl + /
# Her bir feature file Feature: keywordu ile baslamak zorundadir ve sadece 1 tane kullanilabilir
# Feature file da test scenariolarimizi Scenario keywordu ile tanimlariz, ve istedigmiz kadar kullanabiliriz

@US001
Feature: US001 Amazon Home Page Test

  Scenario: TC01 Search for iphone in the search box

    Given Kullanici amazon sayfasina gider
    When Arama kutusunda iphone aratir
    And Sayfayi kapatir
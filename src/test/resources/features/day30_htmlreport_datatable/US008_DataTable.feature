@US008
Feature: US008 Amazon DataTable Testi

  Scenario: TC01 Amazon sayfasinda arama yapilir

    Given Kullanici "https://amazon.com" sayfasina gider
    When verilen bilgiler ile arama yapar
      | tablet   |
      | mouse    |
      | keyboard |
    And Sayfayi kapatir


  Scenario: TC02 Amazon sayfasinda arama yapilir

    Given Kullanici "https://amazon.com" sayfasina gider
    When verilen bilgiler ile arama yapar ikinci yol
      | tablet   |
      | mouse    |
      | keyboard |
    And Sayfayi kapatir




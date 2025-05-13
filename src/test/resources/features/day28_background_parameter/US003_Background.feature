#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

@US003
Feature: US003 Amazon testi
  #Feature file da BASLANGIC icin ortak adimlar varsa bu ortak adimlari Background keywordu ile yazariz
  #@BeforeMethod mantigi ile calisir
  Background:
    Given Kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda iphone aratir
    And Sayfayi kapatir

  @samsung @nokia
  Scenario: TC02 arama kutusunda samsung aratilir
    When Arama kutusunda samsung aratir
    And Sayfayi kapatir

  @nokia
  Scenario: TC03 arama kutusunda nokia aratilir
    When Arama kutusunda nokia aratir
    And Sayfayi kapatir


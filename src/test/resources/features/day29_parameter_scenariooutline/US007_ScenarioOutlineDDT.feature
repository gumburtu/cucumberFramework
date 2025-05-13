#USER STORY : User_login_test
#Scenario:kullanici tum user email ve passwordler ile giriş yapabilmeli
#TEST DATA
#url : https://www.speedyli.com/
#Credentials:
#| ayhancan@cars.com   | Aa1234567!     |
#| beyhancan@cars.com   | Aa1234567!    |
#| ceyhancan@cars.com   | Aa1234567!    |

@US007
Feature: US007 Car Rental Login İslemi

  Scenario Outline:  TC01 Kullanici tum user email ve passwordler ile giriş yapabilmeli
    Given Kullanici "https://www.speedyli.com/" sayfasina gider
    When registerlogin butonuna tiklar
    And kullanici gecerli "<EMAIL>" ve "<PASSWORD>" bilgilerini girer
    Then kullanici login oldugunu dogrular
    And Sayfayi kapatir

    Examples:
      | EMAIL              | PASSWORD   |
      | ayhancan@cars.com  | Aa1234567! |
      | beyhancan@cars.com | Aa1234567! |
      | ceyhancan@cars.com | Aa1234567! |
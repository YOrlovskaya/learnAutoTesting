Feature: I want to test form

  Scenario: I want to fill form with correct data
    Given I go to main page
    When I choose link "Кредит наличными от"
    And I fill name field with text "Тестов Клиент Анкетович"
    And I fill phone field with text "9816994934"
    And I fill email field with text "test@test.ru"
    And I choose sex "Мужской"
    And I check the box
    And I click button "Продолжить"
    Then I see page step2

  Scenario Outline:  I want to fill form with incorrect data
    Given I go to main page
    When I choose link "Кредит наличными от"
    And I fill name field with text "Тестов Клиент Анкетович"
    And I fill phone field with text "<phone>"
    And I fill email field with text "<email>"
    And I choose sex "Мужской"
    And I check the box
    And I click button "Продолжить"
    Then I not see page step2

    Examples:
      | phone      | email        |
      | 1816994934 | test@test.ru |
      | 9816994934 |              |
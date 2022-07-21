# Будем описывать шаги, перечисленные в этом файле
Feature: simple test wix site

  @UI
  Scenario: simple test
    * открыть главную страницу
    * нажать на кнопку "About"
    * заполнить поле "First Name" текстом "Александр"
    * заполнить поле "Last Name" текстом "Пушкин"
    * заполнить поле "Email" текстом "apushkin@pushka.as"
    * нажать на кнопку "Submit"

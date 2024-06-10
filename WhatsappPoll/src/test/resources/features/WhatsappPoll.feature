Feature: WhatsappPoll App

  @WhatsApp
  Scenario: WhatsappPoll
    Given go to page
    When Accept google accept cookies
    When Some buttons in WsWeb
    When click search button in whatsapp
    Then write text in searchBox
    Then choose the group
    Then click additional button
    Then choose the poll
    Then write datas in poll
    Then click send button
    And close page
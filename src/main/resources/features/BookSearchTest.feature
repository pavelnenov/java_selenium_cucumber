Feature: Basic search
  Scenario: Search a book on Amazon
    Given I am on the Amazon homepage
    When I enter "George Orwell" in search field
    And I click search button
    Then I should see list of results

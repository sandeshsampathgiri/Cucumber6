Feature: Calculate billing amount

Scenario Outline: Calculate billing amount

Given the user is on the billing page
When the user enters the billing amount "<BillAmount>"
And the user enters the tax amount "<TaxAmount>"
And the user clicks on Calculate button
Then it should display the final amount "<FinalAmount>"

Examples:
| BillAmount | TaxAmount | FinalAmount |
| 10 | 5 | 15 |
| 20 | 10 | 30 |
| 25 | 12.5 | 37.5 |
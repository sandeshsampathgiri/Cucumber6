Feature: User creation

Scenario: Create users with different sets of data

Given the user is on the home page
When the user enters the following details
| Sandesh | Sampathgiri | sandesh.giri@gmail.com | 9632525696 | Bangalore |
| Naveen | Khunteta | naveen.khunteta@gmail.com | 9945995011 | Bangalore |
Then the user should be created successfully

Scenario: Create users with different sets of data with the columns

Given the user is on the home page
When the user enters the following details with the columns
| firstname | lastname | Email Address | Mobile | City |
| Sandesh | Sampathgiri | sandesh.giri@gmail.com | 9632525696 | Bangalore |
| Naveen | Khunteta | naveen.khunteta@gmail.com | 9945995011 | Bangalore |
Then the user should be created successfully
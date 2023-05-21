Feature: validate functionality of irctc web application
Scenario: Home page
Given user lanch the irctc web application
When user click dismiss alert pop in alert field  
Then user click Register button it is redireacts to creat account page 

Scenario: create account page
When user enter name in user name field
And  user enter password in password field
And  user again enter re_password in confirm password field
And  user select language in preferred language field
And user Select the security question in  security question field
And user enter the Security Answer in Answer field
And user click the continue button it is redireacts to Personal Details
And user enter the First name in firstname field
And user enter the middle name in middle name optionl field
And user enter the last name in last name optionl field
And user select the occupation in the occpation field
And user enter DOB in date of birth field
And user Select the month in month field
And user Select the year in year field
And user enter the day on the calender field
And user click the married field
And user click nationality field
And user click gender field
And user enter email id in email field
And user enter india mobil number in mobil field
And user click select nationality field 
And user select nationality in the field
Then  user click continue button it is redirects to address page

Scenario: Address page
When  user enter Dno in Dno field
And  user enter the street name in street field
And user enter the locality name in locality field
And user enter the pincode name in pincode field
And user enter the state name in state field
And  user select city in city field
And  user click post office in the field
And  user enter the mobil number in phone field
And user click office address in the field 


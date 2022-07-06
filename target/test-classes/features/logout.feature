@SEAMLES-1960
Feature: Default

	#Verify that user can log out and ends up in login page
	@SEAMLES-1958
	Scenario: US002_AC1_TC1 User can log out and ends up in login page [AutomationS3-AD]
		When user clicks in the upper right corner E button
		And user clicks Log out link opened menu
		Then user can log out and seee homepage (seamlesly)	

	#US002_AC2_TC1 Verify that user can not go to home page again by clicking step back button after successfully logged out [AutomationS3-AD]
	@SEAMLES-1959
	Scenario: US002_AC2_TC1 User can not go to home page again by clicking step back button after successfully logged out [AutomationS3-AD]
		When user hovers over the step back button
		And user clicks on the step back button
		Then user can not go to home page again
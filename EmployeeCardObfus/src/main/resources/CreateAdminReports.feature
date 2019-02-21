Feature: Reports generation 
	The manager uses the system to generate relevant reports and statistics. 
				

Scenario: The manager generates a report with statistics of deposits and withdrawals of employee cards for all the canteens

	Given the manager wants to know the number of employee cards that has been used for deposits and withdrawals in all canteens

	When he generates a canteen statistics report 

	Then the system produces a pdf report named as "repStationStatistics.pdf"

Scenario: The manager generates a report with the names of employees registered in the system

	Given the manager wants to see a list with the names of employees registered in the system

	When he generates an employee list 

	Then the system produces a text file named as "repNameList.txt" which contains the employee list
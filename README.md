SplitBills is a Java application designed to help divide shared expenses between a group of people. It allows users to keep track of who paid for what and calculates how much each participant owes or should receive.
******
Features

Add Players:   Users can input the names of the participants involved in the expense-sharing event.
Track Payments:   For each event, the user can specify who is paying and the amount.
Equal or Custom Distribution:   Expenses can be split equally among all participants or customized based on individual payment statuses.
Debt Calculation:   After all events are logged, the program calculates the net amount each person owes or is owed and displays the final settlements.
Multiple Events:   Users can log several expense-sharing events and continue until they wish to exit the program.

******

How It Works

Initialize Players:   The program begins by asking how many people are participating and their names.  
Log Events:   For each event, the program asks who is paying, the amount paid, and who the amount should be split among (either all players or selected individuals).  
Calculate Settlements:   Once the user decides to stop adding events, the program calculates how much each participant owes or is owed and displays the settlement details.  
Final Settlements:   The program will output the names of participants and the corresponding payments that need to be made between them.  
******
Sample Output

Enter no. of players: 3

Enter their names:

Alice

Bob

Charlie




Alice: 1

Bob: 2

Charlie: 3


EVENT-1

Who is paying?

1

Enter Amount:

100

Who all are getting paid?
(-1:exit, 0:all)

0

Enter 0 to exit, any other to continue:

0


Final Settlements:

Bob has to pay 33 to Alice

Charlie has to pay 33 to Alice
******



Getting Started
Clone the Repository: git clone https://github.com/rithi2211/splitbills


Run the Program Compile and run the SplitBills.java file in any Java-supported environment.

Prerequisites

Java: Ensure that you have the latest version of Java installed.
******


Future Improvements

Add support for saving data between sessions.
Integrate a user interface for easier input and tracking of expenses.
Support for unequal payment scenarios where participants can pay different amounts.

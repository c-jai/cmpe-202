# Design Patterns

## 1) Singleton
For this scenario, only one waitlist should be maintained. Since the waitlist is maintained by the WaitlistManager, this class follows the Singleton pattern and ensures only one instance of waitlist exists.
      
## 2) Chain Of Responsibility
When a table is available, multiple customers are capable of claiming it or "handling" it. Initially the WaitlistManager assigns table to the first customer in the waitlist, but the table is passed to next customer in the waitlist if the table does not accomodate the previous customer's party. Thus Customer follows Chain of Responsibility design pattern

# Brief Explanation
Customer: represents customer of Din Tai Fung restaurant. Messenger represents class responsible for all the communication through text messages. WaitlistManager manages waitlist for the restaurant. Table manager keeps track of available tables and their seating capacity

# CRC Cards

## 1) Customer

### Responsibilities:
+ Sign-up for a table by providing name, contact number and party size
+ Receive Table-available-notification from either WaitlistManager or the previous Customer in the chain
+ Handle Table-available-notification: Check if the available Table can accomodable the party size. 
	If Table can accomodate party size then ask Messenger to inform corresponding real customer about available Table, asking them to       reply "Confirm" or "Leave"
	If the table cannot accomodate party size then pass the Table-available-notification to next customer in chain

### Collaborators: 
WaitlistManager, Messenger


## 2) WaitlistManager

### Responsibilities:
+ Record sign-up information of customer
+ Send sign-up confirmation to Messenger
+ Append newly signed-up customer to the waitlist at the back to ensure FCFS order.
+ Get information from table manager about available Tables
+ Send Table-available-notification to first customer in chain (irrespective of customer's party size) and let the chain of customers handle it.
+ Process confirmation reply from real customer:
	If he/she replies "Confirm" then wait for real customers to check in. Else if he/she replies "Leave" then remove customer from         waitlist while maintaining the FCFS order of remaining ones
+ Ask TableManager to hold table till confirmed customer checks in

### Collaborators: 
Messenger, Customer, TableManager

## 3) Messenger

### Responsibilities:
+ Receive sign-up text message from real customer
+ Ask WaitlistManager to add signed up customer to waitlist
+ Send sign-up confirmation text message to real customer
+ Send Table-available-notification text message to real customer, asking he/she to reply "Confirm"/ "Leave"
+ Inform WaitlistManager about real customer's confirmation response ("Confirm"/ "Leave")

### Collaborators: 
WaitlistManager, Customer

## 4) TableManager

### Responsibilities:
+ Keep track of available Tables 
+ Inform WaitlistManager wheneever  Tables available
+ Hold table till confirmed customer checks in

### Collaborators: 
Table, WaitlistManager

## 5) Table

### Responsibilities:
+ Maintain current status of Table availability (available/ not available)
+ Maintain capacity of table
+ Notify when Table becomes available to TableManager
### Collaborators: 
TableManager



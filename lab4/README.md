# Design Patterns

## 1) Singleton
For this scenario, only one waitlist should be maintained. Since the waitlist is maintained by the WaitlistManager, this class follows the Singleton pattern and ensures only one instance of waitlist exists.
      
## 2) Chain Of Responsibility
When a table is available, multiple customers are capable of claiming it or "handling" it. Initially the WaitlistManager assigns table to the top customer in the waitlist, but the table is passed to next customer in the waitlist if it does not accomodate the previous customer's party.


# CRC Cards

## 1) Customer

### Responsibilities:
+ Sign up for a table
+ Join the waitlist
+ Leave the waitlist
+ Confirm to be in the waitlist
+ Pass table to next customer if it does not accomodate the customer's party.

### Collaborators: 
WaitlistManager


## 2) WaitlistManager

### Responsibilities:
+ Ask helper to add customer to waitlist
+ Ask helper to remove customer to waitlist
+ Send sign-up confirmation to Customer
+ Ask customer to confirm or leave waitlist
+ Record responses of Customer
+ Get information from table manager about available tables
+ Assign table to top customer in waitlist

### Collaborators: 
Helper, Customer, TableManager

## 3) Helper

### Responsibilities:
+ Add customer informed by WaitlistManager to waitlist
+ Remove customer informed by WaitlistManager from waitlist

### Collaborators: 
WaitlistManager

## 4) TableManager

### Responsibilities:
+ Check if any table is available
+ Record capacity of available table
+ Inform WaitlistManager about available tables

### Collaborators: 
Table, WaitlistManager

## 5) Table

### Responsibilities:
+ Maintain current status of table's availability (available/ not available)
+ Record capacity of table
### Collaborators: 
TableManager



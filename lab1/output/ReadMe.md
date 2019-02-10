There are 3 types of gumball machines:
1) Type 1: cost 25 cents, accepts only Quarters
2) Type 2: cost 50 cents, accepts only Quarters
3) Type 3: cost 50 cents, accepts only Nickels, Dimes and Quarters

The gumball machine goes through four stages: InsufficientPaymentState, CompletePaymentState, SoldState, SoldOutState. 
Relevant messages are displayed for the events: insert coin, turn crank and eject coin.

Each machine accepts the allowed coins while being in the InsufficientPaymentState, till the complete payment amount is inserted. 
When the payment is completed it goes to CompletePaymentState. 
After turning the crank a gumball is ejected and the gumball count is decreased by 1. 
Before turning the crank if eject coin option is selected then all the inserted coins are ejected, at the turn of the crank only the extra change is ejected.



# Design Pattern implemented in solution - Strategy Pattern
I have implemented the solution using Strategy Pattern. Here the algorithm for "printing" the receipt varies - for the customer and for the five guys. Hence there are two "strategies" for printing the receipt.

The interface representing the printing strategies is "PrintOrderStrategy". The class "CustomerReceiptOrder" contains the strategy for printing the customer receipt, while the class "PackingSlipOrder" contains the strategy for printing the packing slip. Both of these implement the PrintOrderStrategy interface by implementing the print() method in it.

## Description of classes:
+  Order:
     This class represents the orders placed by the customers. Every order is composed of one or more order items. The total cost of the order is calculated by adding price of each order item
     
+  OrderItem:
     This class represents the order items in every order. If an order item is a burger, then it is composed of BurgerComponents like topppings (tomato, lettuce, grilled onion, grilled jalapeno etc) and patty/ meat.
     
+  BurgerComponent:
     This class represents the items that go inside a burger, as described above.
     
+  PrintOrderStrategy:
     This is an interface which encapsulates the printing strategies
     
+  CustomerReceiptOrder:
     This class represents the printing strategy for customer receipt, which is basically the sequence of items ordered by the customer
     
+  PackingSlipOrder:
     This class represents the printing strategy for packing slip, which is ordered according to what is placed on the top bun, what is placed on the bottom bun and what is placed on the patty/ meat.

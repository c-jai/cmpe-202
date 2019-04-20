# Functional Interface and Lambda Function:

- Functional interfaces are basically interfaces having only one abstract method. 
- Lambda expressions are anonymous methods used to provide implementation for the abstract method of the functional interface.

- As we can see from the code, in case of Java implementation (without Lambda expressions), we have created an interface “WeaponBehaviour” and its implementation classes “AxeBehaviour”, “SwordBehaviour”, “PoisonBehaviour”.
- The implementation classes provide implementation for the method “useWeapon()” provided by the WeaponBehaviour interface. Since WeaponBehaviour has only one method i.e. useWeapon(), it is a functional interface.

- However when we use Lambda expressions, we can see from the code that we have not created any classes implementing the WeaponBehaviour interface. There is only the WeaponBehaviour interface. 
- In such cases, when we need a concrete implementation for the useWeapon() method of the interface, we can do it with the help of Lambda expressions. As mentioned already,  Lambda expressions are anonymous methods that provide implementation for the interface’s method.

# Comparison of two solutions

- The advantage of using Lambda expression is that we don’t need to write an entire class just to implement a single method. It allows the developers to provide implementation at a specific location in the code, where it is actually needed. Thus, Lambda expressions will help in reducing lot of boilerplate code to achieve more concise code.

- However Lambda expressions also restrict reuse of these anonymous implementations, as they cannot be invoked outside of the class in which they are defined. This is not the case for the Java solution.

# postage-legacy-refactoring
Using mutation testing and approval testing to practice refactoring legacy code in simple and safe steps:

How to fix Long Parameter List and Data Clump code smells.

Extract Class from Parameters to create a parameter object.

Fix Feature Envy code smell by using Move refactoring.

Decompose conditionals to clarify the logic, and then Extract Method Objects to encapsulate the behaviour of each branch.

Introduce static factory to separate creation logic from behaviour.

Finally, practise refactoring to polymorphism.

# how to run approval tests
mvn clean test

# how to run mutation tests
mvn org.pitest:pitest-maven:mutationCoverage




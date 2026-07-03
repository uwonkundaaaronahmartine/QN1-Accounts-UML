# QN1 Accounts UML - Project 2

## Relationships in Figure 1

The relationships shown are:

1. `Account` realizes or implements the `Statement` interface.
2. `SavingsAccount` inherits from the abstract `Account` class.
3. `CurrentAccount` inherits from the abstract `Account` class.
4. `Customer` is connected to `Account` by aggregation because a customer keeps a list of accounts.

## Multiplicity

The multiplicity is `1` on the customer side and `0..*` on the account side.

It means one customer may have no account, one account, or many accounts. In this diagram, an account is associated with one customer.

## NetBeans testing

Open NetBeans, click `File` > `Open Project`, and select this folder: `QN1-Accounts-UML-Project2`.

Then right-click the project and choose `Run`. NetBeans should recognize it as a Maven Java project because of the `pom.xml` file.

Terminal test:

```bash
javac src/*.java
java -cp src Main
```

Maven test:

```bash
mvn compile exec:java
```

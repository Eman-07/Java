Bank Account System
    Base Class: Account (with properties like accountNumber, balance, and methods like deposit(), withdraw()).
Derived Classes:
    SavingsAccount: Inherits from Account, adds properties like interestRate, and overrides withdraw() to enforce withdrawal limits.
    CheckingAccount: Inherits from Account, adds properties like overdraftLimit, and overrides withdraw() to allow overdrafts.
    BusinessAccount: Inherits from Account, adds properties like businessName, and modifies withdraw() with business-specific rules.
Practice: Work with different account types, overriding withdrawal methods and adding additional account-specific functionality.
package org.example.prerequisite.oop.inheritance.multilevel;

class Account {

    // Using protected access modifier so that variable is
    // accessible from subclass as well as within the same package
    protected String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public void calculateInterest() {
        System.out.println("Calculating interest for account number: " + accountNumber);
    }
}

class FixedDepositAccount extends SavingsAccount {

    public FixedDepositAccount(String accountNumber) {
        super(accountNumber);
    }

    public void createMaturityAlert() {
        System.out.println("Creating maturity alert for account number: " + accountNumber);
    }
}

class Demo {

    public static void main(String[] args) {
        Account account = new Account("1234");
        System.out.println("Account number is: " + account.getAccountNumber());

        SavingsAccount savingsAccount = new SavingsAccount("5678");
        savingsAccount.calculateInterest();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("4321");
        fixedDepositAccount.createMaturityAlert();
    }
}

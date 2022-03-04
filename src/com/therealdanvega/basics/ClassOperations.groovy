package com.therealdanvega.basics

class ClassOperations {


    static void main(String[] args) {
        def account1 = new Account(balance: 150)
        def account2 = new Account(balance: 600)

        def account3 = account1 + account2

        println account3

        account3.deposit(555)

        println account3

        account3.withdraw(200)

        println account3

    }


}

class Account {

    BigDecimal balance


    Account plus(Account other) {
        new Account(balance: this.balance + other.balance)

    }

    String toString() {
        "Account balance : $balance"
    }

    void deposit(BigDecimal income){
        balance += income
    }

    void withdraw(BigDecimal amount){
        balance -= amount
    }


}